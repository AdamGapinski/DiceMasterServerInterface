package com.dicemaster.server.api;

import java.util.List;

/**
 * @author Adam Gapiński
 */
public interface Server {
    void createGame(Game game);
    List<Game> getAvailableGames();
    boolean registerClient(String username);



    void joinGameAsPlayer(Game game);
    void joinGameAsObserver(Game game);

    void requestMove(Move move);
}
