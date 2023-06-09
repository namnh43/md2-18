package runable;

public class Count implements Runnable{
    private Thread myThread;

    public Count() {
        myThread = new Thread(this, "My runnable thread");
        System.out.println("My thread created " + myThread);
        myThread.start();
    }

    public Thread getMyThread() {
        return myThread;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Print the count "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("My thread run is over");
    }
}
