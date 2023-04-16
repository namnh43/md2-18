package main;

import thread.EvenThread;
import thread.OddThread;

public class TestThread {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread("event");
        OddThread oddThread = new OddThread("odd");
        evenThread.start();
        oddThread.start();
    }
}
