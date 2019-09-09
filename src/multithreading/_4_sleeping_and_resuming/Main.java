package multithreading._4_sleeping_and_resuming;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String... args) {
        ConsoleClock clock = new ConsoleClock();
        Thread thread = new Thread(clock);
        thread.start();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.interrupt();
    }

}
