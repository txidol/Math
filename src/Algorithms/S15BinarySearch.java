package Algorithms;

public class S15BinarySearch {

    public int mySqrt(int x){
        int l=0, r=x,ans=-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(mid==x/mid){
                return mid;
            }else if(mid>x/mid){
                r=mid-1;
            }else{
                l=mid+1;
                ans=mid;
            }
        }
        return ans;

    }

}
