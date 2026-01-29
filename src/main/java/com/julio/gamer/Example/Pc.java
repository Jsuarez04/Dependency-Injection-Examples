package com.julio.gamer.Example;

public class Pc implements Platform {
    private int fps;

    public Pc(int fps) {
        this.fps = fps;
    }

    @Override
    public void play(String game) {
        System.out.println("Playing in PC: " + game + " at " + fps + " fps");
    }
}
