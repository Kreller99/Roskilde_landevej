package com.company;

public class Battle {

    User server;
    User player;

    public Battle(User server, User player) {
        this.server = server;
        this.player = player;
    }

    public Battle() {
    }

    public Battle(Battle player) {
    }

    public User getServer() {
        return server;
    }

    public void setServer(User server) {
        this.server = server;
    }

    public User getPlayer() {
        return player;
    }

    public void setPlayer(User player) {
        this.player = player;
    }
}
