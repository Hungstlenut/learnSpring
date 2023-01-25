package com.edu.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/*
@Component specifies to the Spring framework that this class will be used as an object,
stored in a Spring container. The objects stored inside this container is called Spring beans.

By uncommenting @Scope, we will be able to create an object every time we call the class.
 */
@Component
//@Scope(value="prototype")
public class Alien {

    private int aid;
    private String name;
    private String tech;

    @Autowired
    private Weapon weapon;

    public void show() {
        System.out.println("In show " + hashCode());
    }

    public void kill() {
        weapon.shoot(); //this would normally not work if we don't instantiate a new object.
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTech() {
        return tech;
    }

    public void setTech(String tech) {
        this.tech = tech;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
