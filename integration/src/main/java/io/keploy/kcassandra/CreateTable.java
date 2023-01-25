package io.keploy.kcassandra;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bhanuka
 */
public class CreateTable {

    public static void main(String[] args) {
        try {
            DBConnector connector = new DBConnector();
            connector.connectdb("localhost", 9042);

            final String createmovieTable = "CREATE TABLE IF NOT EXISTS movies_keyspace.movies"
                    + "(title varchar,year int, description varchar, rating varchar, PRIMARY KEY (title, year))";

            connector.getSession().execute(createmovieTable);
            
            connector.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
