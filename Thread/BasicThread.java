package algrothm.Thread;

/**
 * Created by wr on 2018/10/16.
 *
 * Thread 构造器只需要一个Runnable的对象
 * 调用Runnable的run()方法。以便在新的线程中启动任务
 * run() 方法 以便在这个新的线程中启动这个任务。尽管start看起来是
 *
 */
public class BasicThread {


    public static void main(String []  args){
        Thread t = new Thread(new LiftOff());
        t.start();
        System.out.println("Waiting for LiftOff");//实际上start（）方法已经返回了
        //这里实际上产生了是对LiftOff.run（）的方法调用 并且这个方法还没有完成。但因为
        // liftOff。run（）是由不同的线程执行的因此我们依旧可以执行main（）线程的其他操作
        // 因此程序会同时运行两个方法，main()和liffOff。run（） 是程序中与其他线程同时执行的
        //代码


    }



}
