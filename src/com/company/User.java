package com.company;

public class User {
    private String name;
    private int diceRoll;
    private int score;

    public User(String name, int score, int diceRoll) {
        this.name = name;
        this.diceRoll = diceRoll;
        this.score = score;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDiceRoll() {
        return diceRoll;
    }

    public void setDiceRoll(int diceRoll) {
        this.diceRoll = diceRoll;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
