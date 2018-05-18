package com.aifuli.pojo.entity;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "t_student")
public class Student {
    @Id
    private Integer id;
    private String name;
    private String classNo;
    private Integer sex;
    private String addre;

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

    public String getClassNo() {
        return classNo;
    }

    public void setClassNo(String classNo) {
        this.classNo = classNo;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getAddre() {
        return addre;
    }

    public void setAddre(String addre) {
        this.addre = addre;
    }
}
