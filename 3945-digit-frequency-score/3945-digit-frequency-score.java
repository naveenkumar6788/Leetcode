class Solution {
    public int digitFrequencyScore(int n) {
        int[] freq=new int[10];
        String str=Integer.toString(n);
        for(char ch:str.toCharArray()){
            int digit=ch - '0';
            freq[digit]+=1;
        }
        int score=0;
        for(int i=0;i<=9;i++){
            score+=i*freq[i];
        }
        return score;
    }
}