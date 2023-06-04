class Solution {
    // public int majorityElement(int[] nums) {
    //     Arrays.sort(nums);
    //     return nums[nums.length/2];
    // }
    public int majorityElement(int[] nums) {
        int count =0;
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(count>0 && nums[i]!=ans){
                count--;
            }else if(count==0 && nums[i]!=ans){
                ans=nums[i];
            }else{
                count++;
            }
        }
        return ans;
    }
}