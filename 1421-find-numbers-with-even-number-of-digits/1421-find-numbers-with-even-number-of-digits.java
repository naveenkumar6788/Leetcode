class Solution {
    public int findNumbers(int[] nums) {
        int t=0;
        for(int i=0;i<nums.length;i++){
            int n=String.valueOf(Math.abs(nums[i])).length();
            if(n%2==0){
                t++;
            }
        }
        return t;
    }
}