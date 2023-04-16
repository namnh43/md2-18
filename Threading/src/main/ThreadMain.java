package main;

import runable.RunnableDemo;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println("Main thread running ...");
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread1-Database");
        runnableDemo1.startt();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thread2-SendEmain");
        runnableDemo2.startt();
        System.out.println("Main thread stopped!!!");
    }
}
