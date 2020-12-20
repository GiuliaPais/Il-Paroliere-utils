package uninsubria.utils.chronometer;

public class Counter {

    private int min, sec, millis;
    private Long timeStamp, timeToEnd;
    private boolean running;

    public Counter(int min, int sec, int millis) {
        this.min = min;
        this.sec = sec;
        this.millis = millis;
        this.setTimeStamp();
        running = false;
    }

    public void start() {
        running = true;
        timeToEnd = System.currentTimeMillis() + timeStamp;
    }

    public boolean isRunning() {
        if(System.currentTimeMillis() >= timeToEnd)
            running = false;

        return running;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

    private void setTimeStamp() {
        Long longMillis = Long.valueOf(millis);
        Long longSec = Long.valueOf(sec * 1000);
        Long longMin = Long.valueOf(min * 60000);
        timeStamp = longMillis + longSec + longMin;
    }
}
