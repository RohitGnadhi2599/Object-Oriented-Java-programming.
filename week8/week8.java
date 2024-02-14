class DisplayThread extends Thread {
    private String message;
    private int interval;

    public DisplayThread(String message, int interval) {
        this.message = message;
        this.interval = interval;
    }

    public void run() {
        try {
            while (true) {
                System.out.println(message);
                Thread.sleep(interval);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class week8 {
    public static void main(String[] args) {
        DisplayThread thread1 = new DisplayThread("BMS College of Engineering", 10000); // 10 seconds
        DisplayThread thread2 = new DisplayThread("CSE", 2000); // 2 seconds

        thread1.start();
        thread2.start();
    }
}
