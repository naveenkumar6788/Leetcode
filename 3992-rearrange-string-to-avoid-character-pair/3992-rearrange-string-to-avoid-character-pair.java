class Solution {
    public String rearrangeString(String s, char x, char y) {
        StringBuilder sb=new StringBuilder();
        for(char ch1=0;ch1<s.length();ch1++){
            if(y==s.charAt(ch1)){
                sb.append(y);
            }
        }
        for(char ch:s.toCharArray()){
            if(ch!=y){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}