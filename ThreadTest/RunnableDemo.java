package algrothm.ThreadTest;

import algrothm.Thread.LiftOff;

/**
 * Created by wr on 2018/10/16.
 */
public class RunnableDemo implements Runnable {
    private String startMsg;
    private String endMsg;

    public RunnableDemo(){}
    public RunnableDemo(String startMsg,String endMsg) {
        this.startMsg = startMsg;
        this.endMsg = endMsg;
    }

    @Override
    public void run() {
        System.out.println(this + startMsg + "start");
        for(int i =0; i<3;i++){
            System.out.print("run" + i);
            Thread.yield();
        }
        System.out.println(this + endMsg + "end");

    }



    public static  void main(String [] args){

        for(int i = 0;i< 5; i++){
            new Thread(new RunnableDemo()).start();
            System.out.println("waiting for LiftOff");
        }






    }
}