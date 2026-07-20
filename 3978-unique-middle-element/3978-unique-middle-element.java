class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid=nums[nums.length/2];
        int c=0;
        for(int num:nums){
            if(num==mid){
                c++;
            }
        }
        return c==1;
    }
}