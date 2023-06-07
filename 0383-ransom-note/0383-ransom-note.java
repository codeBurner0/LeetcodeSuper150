class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<ransomNote.length();i++){
            map.put(ransomNote.charAt(i),map.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for(int i=0;i<magazine.length();i++){
            if(map.containsKey(magazine.charAt(i))){
                map.put(magazine.charAt(i),map.get(magazine.charAt(i))-1);
            }
        }
        for(int i=0;i<ransomNote.length();i++){
            if(map.get(ransomNote.charAt(i))>0){
                return false;
            }
        }
             
    return true;
    }
}