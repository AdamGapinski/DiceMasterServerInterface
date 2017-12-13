package com.dicemaster.server.api.server;

import java.util.List;

public abstract class Game {
    private int id;


    private List<Player> players;
    abstract void addObserver(User user);
    abstract void addPlayer(User user);

    public List<Player> getPlayers() {
        return players;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
