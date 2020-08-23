package Algorithms;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.nio.Buffer;
import java.util.*;

public class S11RecursionAndDivideConquer {

    public double myPow(double x,int n){
        return n>=0? quickMul(x, n):1/quickMul(x, -n);
    }

    double quickMul(double x,int n){
        if( n==0)
            return 1;
        double y = quickMul(x,n/2);
        return n%2==0?y*y:y*y*x;
    }

    double quickMulWhile(double x,int n){
        double ans = 1.0;
        // 贡献的初始值为 x
        double x_contribute = x;
        while (n > 0) {
            if (n%2 == 1) {
                ans *= x_contribute;
            }
            x_contribute *= x_contribute;
            n >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n =12;
        int j;
        int x;
        j=n&1;
        x=n%2;
        System.out.println(n + " j =" +j +" x =" +x );
        n>>=1;
        j=n&1;x=n%2;
        System.out.println(n + " j =" +j +" x =" +x );
        n>>=1;j=n&1;x=n%2;
        System.out.println(n + " j =" +j +" x =" +x );
        n>>=1;j=n&1;x=n%2;
        System.out.println(n + " j =" +j +" x =" +x );
        n>>=1;j=n&1;x=n%2;
        System.out.println(n + " j =" +j +" x =" +x );
    }

    public int majorityElement(int[] nums){
        Map<Integer,Integer> c = countNums(nums);
        Map.Entry<Integer,Integer> m = null;
        for (Map.Entry<Integer,Integer> e : c.entrySet()){
            if(m==null||e.getValue()>m.getValue()){
                m=e;
            }
        }
        return m.getKey();
    }

    private Map<Integer,Integer> countNums(int[] nums){
        Map<Integer,Integer> c =new HashMap<>();
        for(int num:nums){
            if(!c.containsKey(num)){
                c.put(num,1);
            }else{
                c.put(num,c.get(num)+1);
            }
        }
        return c;
    }

    public int majorityElementSorted(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }

    private int countInRange(int[] nums,int num,int lo,int hi){
        int count = 0;
        for(int i = lo;i<hi;i++){
            if(nums[i]==num){
                count++;
            }
        }
        return count;
    }

    private int majorityElementRec(int[] nums,int lo,int hi){
        if(lo==hi) return nums[lo];
        int mid = (hi -lo)/2 +lo;
        int left = majorityElementRec(nums,lo,mid);
        int right = majorityElementRec(nums,mid+1,hi);
        if(left == right) return left;

        int leftCount = countInRange(nums,left,lo,hi);
        int rightCount = countInRange(nums,right,lo,hi);

        return leftCount>rightCount?left:right;
    }

    public int majorityEVote(int[] nums){
        int count = 0;
        int result = -1;
        for (int num:nums){
            if(count == 0) result = num;
            count+=num==result?1:-1;
        }
        return result;
    }

    //生成括号 22
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generatePDivi(0,0,n,result,"");
        return result;
    }

    public List<String> generatePDivi(int left, int right , int n, List<String> result, String temp){
        if(left == n && right == n)
            result.add(temp);
        if(left<n)
            generatePDivi(left+1,right,n,result,temp+"(");
        if(right<left && right<n){
            generatePDivi(left,right+1,n,result,temp+")");
        }
        return result;
    }


}
