package runable;

public class OptimizePrimeFactorization implements Runnable{
    private long number;

    public OptimizePrimeFactorization(long number) {
        this.number = number;
    }

    @Override
    public void run() {
        for (long i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println("OptimizePrimeFactorization: "+ i);
            }
        }
    }
    public boolean isPrime(long number) {
        if (number <= 1) {
            return false;
        }
        for (long i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
