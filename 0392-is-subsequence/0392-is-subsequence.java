class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int res=0;
        int count=0;
        for(int j=0;j<s.length();j++){
            for(int i=res;i<t.length();i++){
            if(t.charAt(i)==s.charAt(j)){
                count++;
                res=i+1;
                if(count==s.length()){
                return true;
                }
                break;
            }
            
            }
        }
        return false;
    }
}