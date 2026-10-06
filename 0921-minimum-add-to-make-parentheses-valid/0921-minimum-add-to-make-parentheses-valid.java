class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> stack=new Stack<>();
        int lc=0;
        int rc=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                lc++;
            }
            else{
                if(lc>0){
                    lc--;
                }
                else{
                    rc++;
                }
            }
        }
        return lc+rc;
    }
}