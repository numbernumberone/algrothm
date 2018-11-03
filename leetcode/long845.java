package algrothm.leetcode;

/**
 * Created by wr on 2018/10/17.
 */

class Solution{
    public int longestMountain(int[] A){
        if (A.length==0 || A.length < 3) return 0;
        int res = 0;
        for (int i = 1; i < A.length-1; i++){
            if (A[i-1] < A[i] && A[i+1] < A[i]){
                int left = i - 1;
                int right = i + 1;
                while (left > 0 && A[left-1] < A[left]){
                    left--;
                }
                while (right < A.length-1 && A[right+1] < A[right]){
                    right++;
                }
                res = Math.max(res, (right-left+1));
            }
        }
        return res;
    }
}
public class long845 {
    public static void main(String[] args) {
            int[] A = {2,1,4,7,3,2,5};
            int ret = new Solution().longestMountain(A);
            String out = String.valueOf(ret);
            System.out.print(out);
    }
}
