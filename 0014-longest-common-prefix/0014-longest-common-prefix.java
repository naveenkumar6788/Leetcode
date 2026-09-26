class Solution {
    public String longestCommonPrefix(String[] strs) {
        // String ans="";
        // for(int len=1;len<strs[0].length();len++){
        //     String prefix=strs[0].substring(0,len);
        //     boolean valid=true;
        //     for(int i=1;i<strs.length;i++){
        //         if(!strs[i].startsWith(prefix)){
        //             valid=false;
        //             break;
        //         }
        //     }
        //     if(valid){
        //         ans=prefix;
        //     }
        //     else{
        //         break;
        //     }
        // }
        // return ans;

        if(strs==null || strs.length==0){
            return "";
        }
        String first = strs[0];
        for(int i = 0; i < first.length(); i++) {
            char c = first.charAt(i);
            for(int j = 1; j < strs.length; j++) {
                if(i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return first.substring(0, i);
                    
                }
            }
        }
        return first;
    }
}