package runable;

public class RunnableDemo implements Runnable{
    private Thread thread;
    private final String threadName;

    public RunnableDemo(String name) {
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running "+ threadName);
        for (int index = 4;index > 0; index--) {
            System.out.println("Thread: "+threadName +", " + index);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Thread "+ threadName+ " exitting.");
    }
    public void startt() {
        System.out.println("Starting "+ threadName);
        if (thread == null) {
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
