package algrothm;


//everse Only Letters/Users/wr/Documents/GitHub/src/algrothm/MainClass.java


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * Created by wr on 2018/10/12.
 */
class Solution {
    public String reverseOnlyLetters(String S) {

        if(S.length() <= 1) return S;
        char[] chars = S.toCharArray();
        char[] res = new char[chars.length];
        ArrayDeque<Character> stack = new ArrayDeque<Character>(chars.length);

        for (int i = 0; i < chars.length; i++) {
            if((chars[i] >= 'A' && chars[i] <= 'Z') || (chars[i] >= 'a' && chars[i]<='z')){
                stack.push(chars[i]);
            }else{
                res[i] = chars[i];
            }
        }
        for (int i = 0; i < chars.length; i++) {
            if(res[i] == '\u0000'){
                res[i] = stack.pop();
            }
        }
        return new String(res);


    }
}
class Solution1 {
    public String reverseOnlyLetters(String st) {
        int l = 0;
        char[] s = st.toCharArray();   //把字符串转换成字符数组
        int r = s.length-1;
        while(l<r){
            if(((s[l]>='A' && s[l]<='Z')||(s[l]>='a'&&s[l]<='z'))&&((s[r]>='A'&&s[r]<='Z')||(s[r]>='a'&&s[r]<='z'))){
                //如果左右都是字母，则交换。
                char temp = s[l];
                s[l] = s[r];
                s[r] = temp;
                l++;r--;
            }
            else if(!((s[l]>='A'&&s[l]<='Z')||(s[l]>='a'&&s[l]<='z'))&&((s[r]>='A'&&s[r]<='Z')||(s[r]>='a'&&s[r]<='z')))
                l++;                    //左边不是字母，左边做加一操作。
            else if(((s[l]>='A'&&s[l]<='Z')||(s[l]>='a'&&s[l]<='z'))&&!((s[r]>='A'&&s[r]<='Z')||(s[r]>='a'&&s[r]<='z')))
                r--;                   //右边不是字母，右边做减一操作。
            else                       //都不是字母，则左加一右减一。
            {
                l++;
                r--;
            }
        }
        String ss = String.valueOf(s);
        return ss;
    }
}


public class MainClass {


    public static void main(String[] args) throws IOException {

            String S = "a-bC-dEf-ghIj";
            String s = "Tesdsfsdf333t1ng-Leet=code-Q!";

            String ret = new Solution().reverseOnlyLetters(S);

            String ret1 = new Solution1().reverseOnlyLetters(s);


            String out = (ret);

            System.out.println(out);
            System.out.println(ret1);
    }
}