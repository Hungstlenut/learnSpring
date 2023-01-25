package com.edu.spring.demo;

import org.springframework.stereotype.Component;

@Component
public class Weapon {

    private int bullets;
    private String type;

    public void shoot() {
        System.out.println("pew pew");
    }

    public int getBullets() {
        return bullets;
    }

    public void setBullets(int bullets) {
        this.bullets = bullets;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "bullets=" + bullets +
                ", type='" + type + '\'' +
                '}';
    }
}
