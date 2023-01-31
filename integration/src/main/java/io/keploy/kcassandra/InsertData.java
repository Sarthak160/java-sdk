package io.keploy.kcassandra;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;


public class InsertData {

    public static void main(String[] args) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String insertQuery = "INSERT INTO movies_keyspace.movies (title,year,description,rating) "
                    + "VALUES (?,?,?,?)";

            PreparedStatement psInsert = connector.getSession().prepare(insertQuery);
            BoundStatement bsInsert = psInsert.bind("Kaalu", 2022, "Comedy", "4");
            connector.getSession().execute(bsInsert);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
