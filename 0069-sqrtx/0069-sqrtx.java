class Solution {
    public int mySqrt(int x) {
        long s=0;long e=x/2+1;
        long ans=0;
        while(s<=e){
            long mid=s+(e-s)/2;
            if(mid*mid==x){
                ans=mid;
                break;
            }else if(mid*mid<x){
                s=mid+1;
                ans=mid;
            }else{
                e=mid-1;
            }
        }
        return (int)ans;
    }
}