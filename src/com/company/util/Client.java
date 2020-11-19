package com.company.util;

import java.io.*;
import java.net.Socket;

import com.company.Battle;
import com.company.User;

public class Client {
    String serverName = "10.111.179.230"; // Dagens lokal ip på skolen.. TJEK MIG!
    final int port = 5346;


    public Battle client(User user) throws IOException {
        //try{

            //user = new User("Greta Thunberg", 5, 10);


            Socket client = new Socket(serverName, port);

            System.out.println("Client is live");

            DataOutputStream outputStream = new DataOutputStream(client.getOutputStream());
            DataInputStream inputStream = new DataInputStream(client.getInputStream());


            outputStream.writeUTF(user.getName());
            outputStream.writeUTF(String.valueOf(user.getScore()));
            outputStream.writeUTF(String.valueOf(user.getDiceRoll()));


        String serverName = inputStream.readUTF();
            String serverTotalScore = inputStream.readUTF();
            String serverDiceRoll = inputStream.readUTF();

           int serverTotal = Integer.parseInt(serverTotalScore);
           int serverDice = Integer.parseInt(serverDiceRoll);

           User serverUser = new User(serverName, serverTotal, serverDice);

           Battle game = new Battle(serverUser, user);


            client.close();
            return game;

        //} catch (IOException e){
        //    e.printStackTrace();
        //}


    }
}
