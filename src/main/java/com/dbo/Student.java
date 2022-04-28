package com.dbo;

public class Student {
    public final static String tableName = "Student";
    public Student(int id, String fio, String sex, int idGroup) {
        this.id = id;
        this.fio = fio;
        this.sex = sex;
        this.idGroup = idGroup;
    }
    private int id;
    private String fio;
    private String sex;
    private int idGroup;
    public int getId() {
        return this.id;
    }
    public String getFio() {
        return this.fio;
    }
    public String getSex() {
        return this.sex;
    }
    public int getIdGroup() {
        return this.idGroup;
    }
}
