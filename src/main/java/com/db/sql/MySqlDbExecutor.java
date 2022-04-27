package com.db.sql;

import com.utils.resources.IReadProperty;
import com.utils.resources.ReadPropertiesFromPropertiesFile;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class MySqlDbExecutor implements IDbExecutor {

    @Override
    public ResultSet execute(String sqlRequest) {
        IReadProperty<Properties> readerProps = new ReadPropertiesFromPropertiesFile();
        Properties properties = readerProps.read();
        Connection connect = null;
        try {
            connect = DriverManager.getConnection(
                    properties.getProperty("url") + "/" + properties.getProperty("db_name"),
                    properties.getProperty("username"),
                    properties.getProperty("password"));
        } catch(SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (connect != null) {
                    connect.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
        return null;
    }
}