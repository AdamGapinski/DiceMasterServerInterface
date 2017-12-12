package com.dicemaster.server.api;

import java.util.List;

/**
 * @author Adam Gapiński
 */
public interface Player {
    void makeMove();
    void notifyMove(Move move);
    void notifyGameTable(List<Player> players);
}
