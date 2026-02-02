package com.julio.gamer.Example;

public class Cyber {
    public static void main(String[] args){
        Gamer gamerPC = new Gamer(new Pc(180));
        Gamer gamerLaptop = new Gamer(new Laptop(120, 87));
        Gamer gamerConsole = new Gamer(new Console(60, 15));

        tryPlay(gamerPC, "Fortnite");
        tryPlay(gamerLaptop, "League of Legends");
        tryPlay(gamerConsole, "God of War");

    }

    public static void tryPlay(Gamer gamer, String game){
        try{
            gamer.playGame(game);
        } catch (Exception e) {
            System.out.println("Can't play" + e.getMessage());
        }

    }
}
