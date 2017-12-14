package com.dicemaster.server.api.client;

import com.dicemaster.server.api.common.GameDTO;

/**
 * @author Adam Gapiński
 */
public interface GameEventHandler {
    void onGameChange(GameDTO gameDTO);
}
