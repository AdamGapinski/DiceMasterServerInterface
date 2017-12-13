package com.dicemaster.server.api.server;

import com.dicemaster.server.api.common.GameTable;
import com.dicemaster.server.api.common.Move;

/**
 * @author Adam Gapiński
 */
public abstract class Player {
    abstract void notifyMoveChange(Move move);
    abstract void notifyGameTableChange(GameTable gameTable);
    abstract void requestMove();
    abstract void registerEventHandler(EventHandler eventHandler);

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
