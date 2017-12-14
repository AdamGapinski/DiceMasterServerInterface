package com.dicemaster.server.api.server;

import com.dicemaster.server.api.common.GameConfigDTO;

import java.util.List;

public abstract class Game {
    private int id;
    private GameConfigDTO gameConfigDTO;

    private List<Player> players;
    abstract void addObserver(Player player);
    abstract void addPlayer(Player player);

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
