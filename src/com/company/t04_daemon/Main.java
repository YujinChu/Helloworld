package com.company.t04_daemon;

public class Main {

    public static void main(String[] args) {
        class DaemonThread extends Thread{
            public void run(){
                try {
                    sleep(Long.MAX_VALUE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        DaemonThread t = new DeamonThread();
        t.setDaemon(true);
        t.start();
    }
}