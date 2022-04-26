package com.db.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MySqlDbExecutor implements IDbExecutor {

    @Override
    public ResultSet execute(String sqlRequest) {
        Connection connect = DriverManager.getConnection()
        return null;
    }
}
