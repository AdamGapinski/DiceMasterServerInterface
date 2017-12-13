package com.dicemaster.server.api.client;

import com.dicemaster.server.api.common.GameTable;
import com.dicemaster.server.api.common.Move;

/**
 * @author Adam Gapiński
 */
public interface GameEventHandler {
    void onGameTableChange(GameTable gameTable);
    void onGameChange(Move move);
    void onMoveRequest();
}
