class Solution {
    public int compress(char[] chars) {
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<chars.length){
            char curr=chars[i];
            int c=0;
            while(i<chars.length && chars[i]==curr){
                c++;
                i++;
            }
            sb.append(curr);
            if(c>1){
                sb.append(c);
            }
        }
        for(int j=0;j<sb.length();j++){
            chars[j]=sb.charAt(j);
        }
        return sb.length();
    }
}