class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        int case1=robber(nums,0,n-2);
        int case2=robber(nums,1,n-1);
        return Math.max(case1,case2);
    }
    public int robber(int[] nums,int start, int end){
        int prev=0;
        int prev1=0;
        for(int i=start;i<=end;i++){
            int rob=nums[i]+prev;
            int notrob=prev1;
            int curr=Math.max(rob,notrob);
            prev=prev1;
            prev1=curr;
        }
        return prev1;
    }
}