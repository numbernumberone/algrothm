package algrothm;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by wr on 2018/10/16.
 *
 * set中的元素是不重复的
 */
public class SetOfInteger {
    public static void main(String [] args){
        Random random = new Random(44);
        Set<Integer> intset = new TreeSet<>();
        for (int i =0;i<10000;i++){
            intset.add(random.nextInt(100));
        }
        System.out.println(intset);

    }
}
