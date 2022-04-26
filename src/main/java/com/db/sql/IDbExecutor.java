package com.db.sql;

import java.sql.ResultSet;

public interface IDbExecutor {
    ResultSet execute(String sqlRequest);
}
