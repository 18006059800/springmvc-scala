package com.myapp.Models;

/**
 * Created by jackywong on 28/03/2017.
 */
public class User {
    private Long id;
    private String id_key;
    private String name;

    public Long getId() {
        return id;
    }

    public String getId_key() {
        return id_key;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setId_key(String id_key) {
        this.id_key = id_key;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "User("+this.id+" "+this.name+" "+this.id_key;
    }
}
