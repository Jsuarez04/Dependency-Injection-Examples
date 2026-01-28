package Gamer.Example;

public class Cyber {
    public static void main(String[] args){
        Gamer gamerPC = new Gamer(new Pc(180));
        gamerPC.playGame("CS:GO");

        Gamer gamerLaptop = new Gamer(new Laptop(120, 87));
        gamerLaptop.playGame("Fortnite");

        Gamer gamerConsole = new Gamer(new Console(60));
        gamerConsole.playGame("God of War: Ragnarok");
    }
}
