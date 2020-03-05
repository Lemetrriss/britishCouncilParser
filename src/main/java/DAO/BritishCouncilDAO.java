package DAO;

import entity.Entity;
import utils.MySqlHandler;
import utils.exceptions.DbClientException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BritishCouncilDAO {

    public void addVehicleBrand(List<Entity> britishCouncil) {
        Connection connection = setConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement("insert into BritishCouncil(Letter, TextA, Link) VALUES (?,?,?)");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            for (Entity e : britishCouncil) {
                statement.setString(1, e.getLetter());
                statement.setString(2, e.getName());
                statement.setString(3, e.getLink());
                statement.addBatch();
            }
            statement.executeBatch();
        } catch (SQLException sqlex) {
            try {
                throw new DbClientException("Application obtain blocker during creation statement", sqlex);
            } catch (DbClientException dcex) {
                dcex.printStackTrace();
            }
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
               try{
                   throw new DbClientException("Application obtain blocker during close statement", e);
               } catch (DbClientException dbex){
                   dbex.printStackTrace();
               }
            }
            try {
                connection.close();
            } catch (SQLException e) {
                try{
                    throw new DbClientException("Application obtain blocker during close connection", e);
                } catch (DbClientException dbex){
                    dbex.printStackTrace();
                }
            }
        }
    }

    private Connection setConnection() {
        Connection connection = null;
        try {
            connection = MySqlHandler.getConnection();
        } catch (DbClientException dcex) {
            dcex.printStackTrace();
        }
        return connection;
    }

}
