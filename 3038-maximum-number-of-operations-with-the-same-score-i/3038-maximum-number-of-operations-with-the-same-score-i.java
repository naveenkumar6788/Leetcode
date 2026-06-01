class Solution {
    public int maxOperations(int[] nums) {
        int c=1;
        int res=nums[0]+nums[1];
        for(int i=2;i<nums.length-1;i+=2){
            if(nums[i]+nums[i+1]==res){
                c++;
            }
            else{
                break;
            }
        }
        return c;
    }
}