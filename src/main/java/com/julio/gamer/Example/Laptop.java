package com.julio.gamer.Example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Laptop implements Platform {
    private int fps;
    private int batteryPorcentage;



    @Override
    public void play(String game) {
        if(batteryPorcentage < 20){
            throw new RuntimeException("Too low battery, please charge");
        }else{
            System.out.println("Too low battery, please charge");
        }
    }

}
