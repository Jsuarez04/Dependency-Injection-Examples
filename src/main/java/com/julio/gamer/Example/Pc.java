package com.julio.gamer.Example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Pc implements Platform {
    private int fps;

    @Override
    public void play(String game){
        if (fps<60){
            throw new RuntimeException("Pc is too slow");
        }else {
            System.out.println("Playing: " + game + " in PC" + " with " + fps + "fps");
        }

    }
}
