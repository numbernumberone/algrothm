package algrothm.ThreadTest;

/**
 * Created by wr on 2018/10/18.
 */
public class ATMTest {

    public static void main(String[] args) throws InterruptedException{
        // TODO Auto-generated method stub
        Account ac = new Account();
        Thread t1 = new Thread(ac, "fzy");
        Thread t2 = new Thread(ac, "lxw");
        t1.start();
        t2.start();
    }

}
class Account extends Thread{
    private static int remain = 600;
    @Override
    public void run() {
        // TODO Auto-generated method stub
        while(remain>100){
            synchronized(this){
                if(remain>=100){
                    remain=remain-100;
                    System.out.println(currentThread().getName()+"取走100元，还剩"+remain);
                }else{
                    System.out.println("余额不足");
                }

            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
    public Account() {}
}

