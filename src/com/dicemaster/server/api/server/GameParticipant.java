package com.dicemaster.server.api.server;

import com.dicemaster.server.api.common.GameDTO;

/**
 * @author Adam Gapiński
 */
public abstract class GameParticipant {
    abstract void notifyGameStateChange(GameDTO gameDTO);
    abstract void registerPlayerEventHandler(PlayerEventHandler playerEventHandler);

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
