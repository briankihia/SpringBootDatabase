package com.example.bootjpa.model;


//here is how we enable jpa and create a table in our database
//add annotation Entity and Id


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien
{
    @Id
    private int aid;
    private String aname;
    private String tech;

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }
}
