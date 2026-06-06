class Solution {
    public int searchInsert(int[] nums, int target) {
    //     int l=0;
    //     int r=nums.length-1;
    //     while(l<=r){
    //         int mid=l+(r-l)/2;
    //         if(nums[mid]==target)
    //         return mid;
    //         else if(nums[mid]<target)
    //         l=mid+1;
    //         else 
    //         r=mid-1;
    //     }
    //     return l;
    // }
     return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return start;
        }

        int mid = start + (end - start) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (target < nums[mid]) {
            return binarySearch(nums, target, start, mid - 1);
        }

        return binarySearch(nums, target, mid + 1, end);
    }
}