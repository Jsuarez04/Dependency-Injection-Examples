package com.julio.gamer.Example;

public class Laptop implements Platform {
    private int fps;
    private int batteryPorcentage;

    public Laptop(int fps, int batteryPorcentage) {
        this.fps = fps;
        this.batteryPorcentage = batteryPorcentage;
    }

    @Override
    public void play(String game) {
        System.out.println("Playing in Laptop: " + game + " at " + fps + " fps");
    }

}
