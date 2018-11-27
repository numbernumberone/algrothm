package algrothm;

import java.util.ArrayList;

/**
 * Created by wr on 2018/10/16.
 *
 *
 * 泛型使用的好处，预编译的时候就能发现错误
 * 好处大大的
 * 
 */
class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {return  id ;}
}

public class TestArrayList {

    @SuppressWarnings("unchecked")
    public static void main(String [] args){
        ArrayList<Apple> apples = new ArrayList<Apple>();
        for(int i=0; i<3; i++){
            apples.add(new Apple());
        }

            for(int i=0; i<apples.size();i++)
            System.out.println((apples.get(i)).id());

        //using foreach
            for (Apple C : apples){
                System.out.println(C.id());
            }
    }
}
