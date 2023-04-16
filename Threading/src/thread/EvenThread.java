package thread;

public class EvenThread extends Thread{

    public EvenThread(String threadName) {
        this.setName(threadName);
    }

    @Override
    public void run() {
        System.out.println("Start thread "+this.getName());
        for(int i = 0; i < 100; i++) {
            if (i%2 == 0) {
                System.out.println("Print number on "+this.getName()+": "+i);
                try {
                    Thread.sleep(150);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println("EvenThread exit");
    }
}
