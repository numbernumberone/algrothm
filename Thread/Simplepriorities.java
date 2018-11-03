package algrothm.Thread;

/**
 * Created by wr on 2018/10/18.
 */
public class Simplepriorities implements Runnable {

    private int countDown =5;
    private volatile  double d;
    private int priority;
    public Simplepriorities(int priority){
        this.priority = priority;
    }


    @Override
    public void run() {

    }
}
