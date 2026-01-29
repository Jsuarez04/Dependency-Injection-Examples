package com.julio.gamer.Example;

public class Gamer {
    private Platform platform;

    public Gamer( Platform platform) {
        this.platform = platform;
    }

    public void playGame(String game){
        platform.play(game);
    }

}
