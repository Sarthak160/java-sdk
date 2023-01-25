package io.keploy.kcassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Row;
import com.datastax.driver.core.Session;

public class App {

    public static void main(String[] args) {
        String serverIp = "127.0.0.1";
        String keyspace = "tutorial";

        Cluster cluster = Cluster.builder()
                .addContactPoints(serverIp)
                .build();


        Session session = new KSession(cluster.connect(keyspace));
//        XStream xstream = new XStream();
//        String xml = xstream.toXML(session);
//        Session newsession = (Session)xstream.fromXML(xml);
        String cqlStatement = "SELECT * FROM posts;";
        for (Row row : session.execute(cqlStatement)) {

            System.out.println(row.toString());
        }

        session.close();
    }
}