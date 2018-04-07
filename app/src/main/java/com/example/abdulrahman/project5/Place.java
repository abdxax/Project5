package com.example.abdulrahman.project5;

/**
 * Created by Abdulrahman on 07/04/18.
 */

public class Place {
    private String name;
    private int path;

    public Place(String name, int path) {
        this.name = name;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }
}

