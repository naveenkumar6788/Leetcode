class Solution {
    public int gcdOfOddEvenSums(int n) {
        int total=n*2;
        int sum=0;
        int sum1=0;
        for(int i=1;i<=total;i++){
            if(i%2==0){
                sum1+=i;
            }
            else{
                sum+=i;
            }
        }
        while(sum1!=0){
            int rem=sum%sum1;
            sum=sum1;
            sum1=rem;
        }
        return sum;
    }
}