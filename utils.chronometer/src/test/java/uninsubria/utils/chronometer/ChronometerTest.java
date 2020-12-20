package uninsubria.utils.chronometer;

public class ChronometerTest {

    public static void main(String[] args) {

        Counter counter = new Counter(0,5,0);
        ChronometerForTest chronometer = new ChronometerForTest(counter);
        ChronometerForTest chronometer2 = new ChronometerForTest(counter);
        chronometer.start();
        chronometer2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        chronometer.interrupt();
    }
}
