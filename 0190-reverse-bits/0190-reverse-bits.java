public class Solution {
    public int reverseBits(int n) {
        int res=0;
        for(int i=0;i<32;i++){
            int lsb=(n&1);
            lsb=lsb<<31-i;
            res=(res|lsb);
            n=n>>1;
        }
        return res;
    }
}