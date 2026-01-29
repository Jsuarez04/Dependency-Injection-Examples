package com.julio.gamer.Example;

public class Console implements Platform {
    private int fps;

    public Console(int fps) {
        this.fps = fps;
    }

    @Override
    public void play(String game) {
        System.out.println("Playing in Console: " + game + " at " + fps + " fps");
    }
}
