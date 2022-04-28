package com;

import com.dbo.Student;
import com.tables.StudentTable;
import java.util.List;

public class Main {
        public static void main(String[] args) {
        List<Student> students = new StudentTable("mysql").list();
    }
}
