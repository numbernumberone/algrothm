package algrothm.Thread.ThreadStudy;

import java.util.Objects;

/**
 * Created by wr on 2018/10/18.
 */
public class Station extends Thread {
    public Station(String name) {
        super(name);
    }

    static int tick = 50;

    static Object ob = "aa";

    public void run() {

        while (tick >0) {
            synchronized (ob){
             // 这个很重要，必须使用一个锁，
                // 进去的人会把钥匙拿在手上，出来后才把钥匙拿让出来
                if (tick > 0) {
                    System.out.println(getName() + "卖出了第" + tick + "张票");
                    tick--;
                }  if(tick==0){
                    System.out.println(getName() +"票卖完了"+"余票   "+tick);
                    //System.out.println(tick);
                }


            }
            try {
                sleep(100);//休息一秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public static void main(String [] args){

        for(int i=1; i<4;i++){
            new Station("窗口 " + i).start();
        }





    }

}
