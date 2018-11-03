package algrothm.leetcode;

/**
 * Created by wr on 2018/10/19.
 *
 */

class Solution777 {
    public boolean canTransform(String start, String end) {
        char[]  a = start.toCharArray();
        char[]  b = end.toCharArray();
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]==b[i]||a[i]){
                System.out.println(i+"equals");
            }else {
                count++;
            }





            System.out.print(b[i]);
            System.out.println(" ");
            System.out.print(a[i]);
        }
        return true;

    }
}
public class SwapAdjacentinLRString777 {






        public static void main(String[] args)  {

                String start = "RXXLRXRXL";
                String end =   "XRLXXRRLX";
                boolean ret = new Solution777().canTransform(start, end);
                System.out.println(ret);



            }




}
