package com.dominic;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    player.name = "Dominic";
//	    player.health = 20;
//	    player.weapon = "Sword";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("dominic", 200,"Sword");
        System.out.println("Initial health is " + enhancedPlayer.getHitPoints());
    }
}
