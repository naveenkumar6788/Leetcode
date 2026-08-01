class Solution {
    public boolean predictTheWinner(int[] nums) {
        if(nums.length%2==0) return true;
        return winner(nums, 0, nums.length - 1) >= 0;
    }
    private int winner(int[] nums, int i, int j) {
        if (i == j) return nums[i];
        int takeLeft = nums[i] - winner(nums, i + 1, j);
        int takeRight = nums[j] - winner(nums, i, j - 1);
        return Math.max(takeLeft, takeRight);
    }
}