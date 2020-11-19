package com.company;

import com.company.util.Client;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        ArrayList<Integer> userRoll = new ArrayList<>();
        ArrayList<Integer> serverRolls = new ArrayList<>();

        int total = 0;

        String name = "Lille Lars";
        int serverScore = 11;
        int serverRoll;

        Roll diceRoll = new Roll();
        int myRoll = diceRoll.roll();
        serverRoll = myRoll;
        serverRolls.add(myRoll);

        User user = new User(name, serverScore, serverRoll);


        for(int i = 0; i< userRoll.size(); i++){
            userRoll.add(diceRoll.roll());
            total = total + userRoll.get(i);


            System.out.println(total);
        }

        Client client = new Client();

        Battle battle;
        battle = client.client(user);


        System.out.println("\nPlayer Name: " + battle.player.getName() + "\nTotal: " + battle.player.getScore() + "\nDice Roll: " + battle.player.getDiceRoll() + "\n");
        System.out.println("Server Name: " + battle.server.getName() + "\nTotal: " + battle.server.getScore() + "\nDice Roll: " + battle.server.getDiceRoll() + "\n");

    }
}
