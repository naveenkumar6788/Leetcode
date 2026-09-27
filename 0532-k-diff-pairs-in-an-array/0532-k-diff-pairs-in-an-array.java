class Solution {
    public int findPairs(int[] nums, int k) {
        int c=0;
        HashSet<Integer> set=new HashSet<>();
        HashSet<Integer> found=new HashSet<>();
        for(int num:nums){
            if(set.contains(num-k)){
                found.add(num-k);
            }
            if(set.contains(num+k)){
                found.add(num);
            }
            set.add(num);
        }
        return found.size();
    }
}