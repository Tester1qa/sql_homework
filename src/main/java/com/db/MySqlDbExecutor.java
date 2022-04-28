package com.db;

import com.utils.resources.IReadProperty;
import com.utils.resources.ReadPropertiesFromPropertiesFile;
import java.sql.*;
import java.util.Properties;

public class MySqlDbExecutor implements IDbExecutor {
    private static Connection connect = null;
    private static Statement statement = null;
    @Override
    public ResultSet execute(String sqlRequest) {
        IReadProperty<Properties> readerProps = new ReadPropertiesFromPropertiesFile();
        Properties properties = readerProps.read();
        ResultSet resultSet = null;
        try {
            connect = DriverManager.getConnection(
                    properties.getProperty("url") + "/" + properties.getProperty("db_name"),
                    properties.getProperty("username"),
                    properties.getProperty("password"));
            statement = connect.createStatement();
            resultSet = statement.executeQuery(sqlRequest);
//            resultSet = statement.getResultSet();
        } catch(SQLException ex) {
            ex.printStackTrace();
        }
//        finally {
//            try {
//                assert  connect != null: "Connect is null";
//                connect.close();
//            } catch (SQLException ex) {
//                ex.printStackTrace();
//            }
//        }
        return resultSet;
    }
    @Override
    public void close() {
        try {
            connect.close();
            statement.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            }
    }
}