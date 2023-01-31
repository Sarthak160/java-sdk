package io.keploy.kcassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class App {
    public static String cmode = "test";

    public static void main(String[] args) {
        String serverIp = "127.0.0.1";
        String keyspace = "movies_keyspace";

        Cluster cluster = Cluster.builder()
                .addContactPoints(serverIp)
                .build();


        Session session = null;
        if (cmode.equals("record")) {
             session = new KSession(cluster.connect(keyspace));
        } else {
             session = new KSession();
        }


        String cqlStatement = "SELECT * FROM movies_keyspace.movies;";
        for (Row row : session.execute(cqlStatement)) {
            System.out.println("_-----____--_-");
            System.out.println(row.getString("title"));
        }

        session.close();
    }
}