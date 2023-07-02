package com.hackerrank.interthreading;

public class SuspendResume {

    public static void main(String[] args) {
        NewThread ob1 = new NewThread("One");
        NewThread ob2 = new NewThread("Two");


        ob1.t.start();
        ob2.t.start();


        try {
            Thread.sleep(1000);
            ob1.mySuspend();
            System.out.println("Pause of thread one");
            Thread.sleep(1000);
            ob1.myResume();
            System.out.println("Resume thread one");
            ob2.mySuspend();
            System.out.println("Pause of thread two");
            Thread.sleep(1000);
            ob2.myResume();
            System.out.println("Resume thread two");
        } catch (InterruptedException e) {
            System.out.println("Stop of main thread");
        }

        try {
            System.out.println("Wait for threads ending");
            ob1.t.join();
            ob2.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted of main thread");
        }
        System.out.println("End of main thread");
    }
}
