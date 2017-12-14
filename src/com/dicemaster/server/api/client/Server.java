package com.dicemaster.server.api.client;

import com.dicemaster.server.api.common.GameConfigDTO;
import com.dicemaster.server.api.common.GameDTO;

import java.util.List;

/**
 * @author Adam Gapiński
 */
public interface Server {

    ServerGame createGame(GameConfigDTO gameConfigDTO, GameEventHandler gameEventHandler, PlayerType playerType);
    ServerGame requestJoinGame(GameDTO gameDTO, GameEventHandler gameEventHandler, PlayerType playerType);

    List<GameDTO> getAvailableGames();
    boolean registerClient(String username);
}
