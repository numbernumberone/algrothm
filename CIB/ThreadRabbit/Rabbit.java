package algrothm.CIB.ThreadRabbit;

/**
 * Created by wr on 2018/10/18.
 */
public class Rabbit extends Animal {
    public Rabbit(){
        setName("兔子");
    }

    @Override
    public void runing() {

        double dis = 0.5;
        length -= dis;
        if(length<=0){
            length=0;
            System.out.println("兔子获得了胜利");
        }
    }
}
