package com.dicemaster.server.api;

import java.util.List;

/**
 * @author Adam Gapiński
 */
public interface GameEventHandler {
    void onGameTableChange(List<User> users);
    void onMoveRequest();

}
