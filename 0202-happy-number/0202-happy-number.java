class Solution {
    public boolean isHappy(int n) {
        List<Integer> set=new ArrayList<Integer>();
        while(n!=1){
            int temp=n;
            n=0;
            while(temp>0){
            n=n+(temp%10)*(temp%10);
            temp=temp/10;
        }
        if(set.contains(n)){
            return false;
        }
        else{
            set.add(n);
        }
        }
        return true;   
    }
}


// HashSet
// public boolean isHappy(int n) {
//         HashSet<Integer> set=new HashSet<Integer>();
//         while(n!=1){
//             int temp=n;
//             n=0;
//             while(temp>0){
//             n=n+(int)Math.pow((temp%10),2);
//             temp=temp/10;
//         }
//         if(set.contains(n)){
//             return false;
//         }
//         else{
//             set.add(n);
//         }
//         }
//         return true;   
//     }