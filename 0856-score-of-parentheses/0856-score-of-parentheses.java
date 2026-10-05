class Solution {
    public int scoreOfParentheses(String s) {
        int c=0;
        int size=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                size++;
            }
            else{
                size--;
                if(s.charAt(i-1)=='('){
                    c+=1<<size;
                }
            }
        }
        return c;
    }
}