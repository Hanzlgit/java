package com.learn2.A12PV;

public class Eater extends Thread {
    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                if(Desk.count==0){
                    break;
                }else{
                    if(Desk.foodFlag==0){
                        try {
                            Desk.lock.wait();//让该线程和锁绑定.
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }else{
                        Desk.count--;
                        System.out.println("在吃面条, 还能再吃"+Desk.count+"碗");
                        Desk.foodFlag = 0;
                        Desk.lock.notifyAll();
                    }
                }
            }
        }
    }
}
