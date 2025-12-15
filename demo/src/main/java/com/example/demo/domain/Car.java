package com.example.demo.domain;

import java.util.List;

import lombok.Getter;

@Getter
public class Car {
    private String name;
    private List<Tire> tires;
    private Engine engine;

    public void run(){
        System.out.println("走る！");
    }
}
