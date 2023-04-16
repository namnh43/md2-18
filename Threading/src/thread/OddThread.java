package thread;

public class OddThread extends Thread{

    public OddThread(String threadName) {
        this.setName(threadName);
    }

    @Override
    public void run() {
        System.out.println("Start thread "+this.getName());
        for(int i = 0; i < 100; i++) {
            if (i%2 == 1) {
                System.out.println("Print number on "+this.getName()+": "+i);
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("OddThread exit");
    }
}
