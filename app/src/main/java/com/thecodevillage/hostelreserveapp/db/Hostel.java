package com.thecodevillage.hostelreserveapp.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity(nameInDb = "hostel")
public class Hostel {


    //@Id(autoincrement = true)
    private Long id;


    private String code;

    private String name;

    private String location;

    @Generated(hash = 1425861642)
    public Hostel(Long id, String code, String name, String location) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.location = location;
    }

    @Generated(hash = 601593458)
    public Hostel() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
