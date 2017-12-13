package com.dicemaster.server.api.client;

import com.dicemaster.server.api.common.Move;

import java.util.List;

/**
 * @author Adam Gapiński
 */
public interface Server {
    void createGame(GameDTO gameDTO);
    List<GameDTO> getAvailableGames();
    boolean registerClient(String username);

    void requestJoinGameAsPlayer(GameDTO gameDTO, GameEventHandler gameEventHandler);
    void requestJoinGameAsObserver(GameDTO gameDTO, GameEventHandler gameEventHandler);

    void requestMove(Move move);
}
