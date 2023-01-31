package io.keploy.kcassandra;

import com.datastax.driver.core.BoundStatement;
import com.datastax.driver.core.PreparedStatement;
import com.datastax.driver.core.ResultSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bhanuka
 */
public class SearchData {

    public static void main(String[] args) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String selectQuery = "SELECT * FROM movies_keyspace.movies WHERE title=? AND year= ?";

            PreparedStatement psSelect = connector.getSession().prepare(selectQuery);
            BoundStatement bsSelect = psSelect.bind("Bhalu", 2019);
            ResultSet rs = connector.getSession().execute(bsSelect);
            System.out.println("HElo");
            rs.forEach(rr -> {
                System.out.println("movie name : " + rr.getString("title"));
                System.out.println("movie desc : " + rr.getString("description"));
                System.out.println("rating : " + rr.getString("rating"));
            });

            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
