class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        int min=nums[0];
        int max=nums[n];
        while(max!=0){
            int rem=min%max;
            min=max;
            max=rem;
        }
        return min;
    }
}