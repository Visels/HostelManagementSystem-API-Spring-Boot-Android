package com.thecodevillage.hostelreserveapp.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.util.Date;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "room")
public class Room {

    //@Id(autoincrement = true)
    private Long id;


    private String code;

    private String name;


    private int maxOccupants;


    private double cost;


    private Long hostelId;


    @Generated(hash = 824236102)
    public Room(Long id, String code, String name, int maxOccupants, double cost,
            Long hostelId) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.maxOccupants = maxOccupants;
        this.cost = cost;
        this.hostelId = hostelId;
    }

    @Generated(hash = 703125385)
    public Room() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxOccupants() {
        return maxOccupants;
    }

    public void setMaxOccupants(int maxOccupants) {
        this.maxOccupants = maxOccupants;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Long getHostelId() {
        return hostelId;
    }

    public void setHostelId(Long hostelId) {
        this.hostelId = hostelId;
    }
}
