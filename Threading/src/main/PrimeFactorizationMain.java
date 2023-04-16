package main;

import runable.LazyPrimeFactorization;
import runable.OptimizePrimeFactorization;

import java.util.Scanner;

public class PrimeFactorizationMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input big number:");
        long number = scanner.nextLong();
        LazyPrimeFactorization lazy = new LazyPrimeFactorization(number);
        OptimizePrimeFactorization opt = new OptimizePrimeFactorization(number);
        Thread t1 = new Thread(lazy);
        Thread t2 = new Thread(opt);

        t1.start();
        t2.start();

        System.out.println("Done, Exit main thread");

    }

}
