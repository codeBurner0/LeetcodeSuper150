class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
                if(map.get(t.charAt(i))>1){
                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
                }else{
                    map.remove(t.charAt(i));
                }
            }
        }
        System.out.println(map);
        if(map.isEmpty()){
            return true;
        }
        return false;
    }
}