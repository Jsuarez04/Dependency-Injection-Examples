package com.julio.gamer.Example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Console implements Platform {
    private int fps;
    private int controllerBatteryPorcentage;

    @Override
    public void play(String game) {
        if(controllerBatteryPorcentage < 10){
            throw new RuntimeException("Too low battery, please charge");
        }else{
            System.out.println("Playing in Console: " + game + " at " + fps + " fps");
        }
    }
}
