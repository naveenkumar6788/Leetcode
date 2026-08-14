class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen=0;
        int left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int right=0;right<s.length();right++){
            char curr=s.charAt(right);
            if(map.containsKey(curr)){
                left=Math.max(left,map.get(curr)+1);
            }
            map.put(curr,right);
            maxlen=Math.max(maxlen,right-left+1);
        }
        return maxlen;
    }
}