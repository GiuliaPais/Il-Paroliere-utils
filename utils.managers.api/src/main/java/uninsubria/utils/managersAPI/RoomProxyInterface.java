package uninsubria.utils.managersAPI;

import java.io.IOException;

public interface RoomProxyInterface {
    enum TimerType {
        PRE_GAME, MATCH, MATCH_END, TIMEOUT
    }

    void setTimer(TimerType timerType) throws IOException;
}
