package com.julio.gamer.Example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Gamer {
    private Platform platform;

    public void playGame(String game){
        platform.play(game);
    }

}
