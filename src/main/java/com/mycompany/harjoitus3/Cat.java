/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.harjoitus3;

import java.util.jar.Attributes;

/**
 *
 * @author pekka
 */
public class Cat extends Animal implements IAnimal{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String sayHello(String value) {
        return "Olen "+value+" kissa";
    }   
}
