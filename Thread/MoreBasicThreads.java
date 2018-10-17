package algrothm.Thread;

/**
 * Created by wr on 2018/10/16.
 */
public class MoreBasicThreads {
    public static void main(String [] args) {

        for(int i = 0;i< 5; i++){
            new Thread(new LiftOff()).start();
            System.out.println("waiting for LiftOff");
        }
    }
}
