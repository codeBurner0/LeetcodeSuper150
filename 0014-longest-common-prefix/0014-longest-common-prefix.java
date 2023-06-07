class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String s1=str[0];
        String s2=str[str.length-1];
        String ans="";
        for(int i=0;i<str[0].length();i++){
            if(s1.charAt(i)==s2.charAt(i)){
                ans+=s1.charAt(i);
            }else{
                break;
            }
        }
        return ans;
    }
}