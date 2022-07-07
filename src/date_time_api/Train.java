package date_time_api;

import java.time.LocalDateTime;

public class Train {
    public static final int MOVEMENT_INTERVAL = 45;
    public static final int MOVEMENT_TIME = 15;
    private LocalDateTime startMovement = LocalDateTime.of(2000, 1,1,0,0);
    private static int count = 0;

    public Train() {
        startMovement = startMovement.plusMinutes(MOVEMENT_TIME * count);
        count++;
    }

    public LocalDateTime getStartMovement() {
        return startMovement;
    }

    public void setStartMovement(LocalDateTime startMovement) {
        this.startMovement = startMovement;
    }
}
