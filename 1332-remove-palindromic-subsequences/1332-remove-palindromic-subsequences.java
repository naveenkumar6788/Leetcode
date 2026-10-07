class Solution {
    public int removePalindromeSub(String s) {
        Stack<Character> stack=new Stack<>();
        int c=0;
        int left=0;
        int right=s.length()-1;
        while(left<=right){
            if(s.charAt(left)!=s.charAt(right)){
                return 2;
            }
            left++;
            right--;
        }
        return 1;
    }
}