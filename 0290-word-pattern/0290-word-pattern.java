class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map=new HashMap<>();
        HashSet<String> set=new HashSet<>();
        String[] word=s.split(" ");
        if(word.length!=pattern.length()){
            return false;
        }
        for(int i=0;i<word.length && i<pattern.length();i++){
                if(map.containsKey(pattern.charAt(i))){
                    if(!map.get(pattern.charAt(i)).equals(word[i])){
                        return false;
                    }
                }else{
                    if(set.contains(word[i])){
                        return false;
                    }
                    map.put(pattern.charAt(i),word[i]);
                    set.add(word[i]);
                }
        }
        return true;
    }
}