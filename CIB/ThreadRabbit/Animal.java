package algrothm.CIB.ThreadRabbit;

/**
 * Created by wr on 2018/10/18.
 */
public abstract class Animal extends Thread {

    public double length = 20;

    public abstract void runing();

    public void run() {
        super.run();
        while(length>0) {
            runing();
        }
    }

    public static interface Calltoback{
        public void win();
    }


    public Calltoback calltoback;


}
