package algrothm;

import sun.security.x509.AttributeNameEnumeration;

import java.util.*;

import static jdk.nashorn.internal.objects.Global.print;


/**
 * Created by wr on 2018/10/16.
 *
 * 多态的调用的一种方法
 *
 */
public class PrintingContainer {
        static Collection fill(Collection<String> collection){
            collection.add("rat");
            collection.add("cat");
            collection.add("dog");
            collection.add("dog");
            return collection;
        }
    static Map fill(Map<String,String> map) {
        map.put("rat","Fuzzy");
        map.put("cat","Rags");
        map.put("dog","Bosco");
        map.put("dog","Spot");
        return map;
    }


    public static void main(String [] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String, String>()));
        System.out.println(fill(new TreeMap<String, String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));

    }

}
