package com.dbo.sql;

public abstract class DboAbs {
    protected String tableName = "";

    public DboAbs(String tableName) {
        this.tableName = tableName;
    }
}