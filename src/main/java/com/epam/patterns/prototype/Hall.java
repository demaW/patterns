package com.epam.patterns.prototype;

public class Hall {
    private int id;
    private String hallName;

    public Hall(int id, String hallName) {
        this.id = id;
        this.hallName = hallName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }
}
