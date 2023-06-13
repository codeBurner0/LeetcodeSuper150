class Solution {
    public String addBinary(String a, String b) {
         int i=0;
         int carry=0;
         String res="";
         int alen=a.length()-1;
         int blen=b.length()-1;
         while(i<=alen || i<=blen || carry!=0){
             int sum=0;
             if(i<=alen && a.charAt(alen-i)=='1'){
                 sum++;
             }
             if(i<=blen && b.charAt(blen-i)=='1'){
                 sum++;
             }
            res=Integer.toString((sum+carry)%2)+res;
            carry=(sum+carry)/2;
            i++;
         }
         return res;
    }
}