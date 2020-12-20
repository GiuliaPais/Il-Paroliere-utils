package uninsubria.utils.chronometer;

public class ChronometerForTest extends Chronometer {

    public ChronometerForTest(Counter counter) {
        super(counter);
    }

    public void run() {
        System.out.println("START...");
        Long startTime = System.currentTimeMillis();

        super.run();

        Long endTime = System.currentTimeMillis();
        Long time = endTime - startTime;

        System.out.println("...END");
        System.out.println("Tempo trascorso in millis: " + time);
    }

}
