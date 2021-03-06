package com.arun.listview;

public class Person {
    private String name;
    private String birthdate;
    private String sex;

    public Person(String name, String birthdate, String sex) {
        this.name = name;
        this.birthdate = birthdate;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
