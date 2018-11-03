package algrothm.Thread;

import java.util.concurrent.TimeUnit;

/**
 * Created by wr on 2018/10/18.
 */
public class SleepingTask extends LiftOff {
    public void run() {
        try {
            while(countDown-- >0){
                System.out.println(status());
                TimeUnit.MICROSECONDS.sleep(1000);
            }

        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
    public static void main(String [] args) {
        for(int i = 0;i< 5; i++){
            new Thread(new SleepingTask()).start();
            System.out.println("waiting for LiftOff");
        }

    }
}
