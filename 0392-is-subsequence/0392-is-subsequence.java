class Solution {
    // public boolean isSubsequence(String s, String t) {
    //     if(s.length()==0){
    //         return true;
    //     }
    //     int res=0;
    //     int count=0;
    //     for(int j=0;j<s.length();j++){
    //         for(int i=res;i<t.length();i++){
    //         if(t.charAt(i)==s.charAt(j)){
    //             count++;
    //             res=i+1;
    //             if(count==s.length()){
    //             return true;
    //             }
    //             break;
    //         }
            
    //         }
    //     }
    //     return false;
    // }
    public boolean isSubsequence(String s, String t) {
        int start1=0;
        int start2=0;
        int count=0;
        while(start1<s.length() && start2<t.length()){
            if(s.charAt(start1)==t.charAt(start2)){
                start1++;
                start2++;
                count++;
            }else{
                start2++;
            }
        }
        return count==s.length();
    }
}