package com.dicemaster.server.api.server;

import com.dicemaster.server.api.common.GameDTO;

/**
 * @author Adam Gapiński
 */
public abstract class Player {
    abstract void notifyGameStateChange(GameDTO gameDTO);
    abstract void registerEventHandler(PlayerEventHandler playerEventHandler);

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
