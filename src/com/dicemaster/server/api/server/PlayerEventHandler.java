package com.dicemaster.server.api.server;

import com.dicemaster.server.api.common.Move;

public interface PlayerEventHandler {
    void onMoveRequest(Move move);
    void onUserLeft(User user);
}
