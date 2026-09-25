class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int arr:nums){
            if(set.contains(arr)){
                return arr;
            }
            set.add(arr);
        }
        return -1;
    }
}
