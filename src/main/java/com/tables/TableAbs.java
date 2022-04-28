package com.tables;

import com.db.IDbExecutor;
import com.db.MySqlDbExecutor;
import com.dbo.Student;

import java.util.Locale;

public abstract class TableAbs implements ITable<Student> {
    protected IDbExecutor dbExecutor = null;
    public TableAbs (String dbType) {
        switch (dbType.toLowerCase(Locale.ROOT)) {
            case "mysql": {
                 dbExecutor = new MySqlDbExecutor();
                 break;
            }
        }
    }
}
