package runable;

public class NumberGenerator implements Runnable{
    @Override
    public void run() {
        System.out.println("Start thread");
        for (int i = 0; i < 10; i++) {
            System.out.println("Print number "+i + " with hashcode "+ hashCode());
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
