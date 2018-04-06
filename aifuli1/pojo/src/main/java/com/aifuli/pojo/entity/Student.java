package com.aifuli.pojo.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_student")
public class Student {
    @Id
    private Integer id;
    private String name;

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
