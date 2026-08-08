
class Solution {
    public int climbStairs(int n) {
       if(n==0) return 0;
       if(n==1) return 1;
       int step1=1;
       int step2=2;
       for(int i=2;i<n;i++){
        int ans=step1+step2;
        step1=step2;
        step2=ans;
       }
       return step2;
    }
}
