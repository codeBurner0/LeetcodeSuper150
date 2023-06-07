class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int res=0;
        int i=s.length()-1;
        for(;i>=1;i--){
            if(map.get(s.charAt(i-1))<map.get(s.charAt(i))){
                res+=map.get(s.charAt(i))-map.get(s.charAt(i-1));
                i--;
            }else{
                res+=map.get(s.charAt(i));
            }
            
        }
        if(i==0){
            return res+map.get(s.charAt(0));
        }else{
            return res;
        }
        
    }
}