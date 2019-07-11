package com.udaan.vit.housekeeping;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;
    private int quantity;
    private String tasks;

    public Asset(){

    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuatity() {
        return quantity;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuatity(int quatity) {
        this.quantity = quatity;
    }

    public String getTasks() {
        return tasks;
    }

    public void setTasks(String tasks) {
        this.tasks = tasks;
    }

}
