package com.udaan.vit.housekeeping.Modal;

import java.util.ArrayList;


public class Asset {



    private String name;
    private int quantity;
    private String tasks;

    public Asset(){

    }


    public String getName() {
        return name;
    }

    public int getQuatity() {
        return quantity;
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
