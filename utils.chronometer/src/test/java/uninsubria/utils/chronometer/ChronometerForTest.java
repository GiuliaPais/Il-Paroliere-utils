package uninsubria.utils.chronometer;

public class ChronometerForTest extends Chronometer {

    public ChronometerForTest(Counter counter) {
        super(counter);
    }

    public void run() {
        System.out.println("START...");
        long startTime = System.currentTimeMillis();

        super.run();

        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
    }

}
