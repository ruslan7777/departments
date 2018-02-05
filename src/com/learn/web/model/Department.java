package com.learn.web.model;

/**
 * Created by RUSLAN77 on  29.01.2018 in Ukraine
 */
public class Department {
    private Integer id;
    private String name;

    public Department(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
