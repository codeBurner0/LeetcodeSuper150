class Solution {
    // public boolean isPalindrome(int x) {
    //     if(x<0){
    //         return false;
    //     }
    //     int n=x;
    //     int rev=0;
    //     while(n>0){
    //         int ld=n%10;
    //         rev=rev*10+ld;
    //         n=n/10;
    //     }
    //     return rev==x;
    // }
    public boolean isPalindrome(int x) {
        if(x<0 || x!=0 && x%10==0){
            return false;
        }
        int rev=0;
        while(x>rev){
            int ld=x%10;
            rev=rev*10+ld;
            x=x/10;
        }
        return (rev==x || x==rev/10);
    }
}