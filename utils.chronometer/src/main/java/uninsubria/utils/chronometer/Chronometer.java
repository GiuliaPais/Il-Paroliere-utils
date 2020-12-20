package uninsubria.utils.chronometer;

public class Chronometer extends Thread {

    private final Counter counter;

    public Chronometer(Counter counter) {
        this.counter = counter;
    }

    public void run() {
        counter.start();
        this.waitTheEnd(counter.getTimeStamp());
    }

    private void waitTheEnd(Long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException ignored) { }
    }

}
