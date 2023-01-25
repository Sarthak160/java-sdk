package io.keploy.kcassandra;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bhanuka
 */
public class UpdateData {

    public static void main(String[] args) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String updateQuery = "UPDATE movies_keyspace.movies SET rating= ? WHERE "
                    + "title= ? AND year = ?";

            PreparedStatement psUpdate = connector.getSession().prepare(updateQuery);
            BoundStatement bsUpdate = psUpdate.bind("10.0", "Annabelle", 2019);
            connector.getSession().execute(bsUpdate);

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
