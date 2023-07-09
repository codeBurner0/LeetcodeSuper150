class Solution {
    public boolean wordPattern(String p, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Boolean> map2=new HashMap<>();
        int j=0;
        for(int i=0;i<p.length();i++){
            String temp="";
            for(;j<s.length();j++){
                
                if(s.charAt(j)==' '){
                    j++;
                    break;
                }
                temp+=s.charAt(j);
                
            }
            if(temp==""){
                return false;
            }
            if(map.containsKey(p.charAt(i))){
                String sp=map.get(p.charAt(i));
                if(!sp.equals(temp)){
                    return false;
                }
            }else{
                if(map2.containsKey(temp)){
                    return false;
                }else{
                map.put(p.charAt(i),temp);
                map2.put(temp,true);
                }
            }
            
        }
        if(j<s.length()){
            return false;
        }
        return true;
    }
}