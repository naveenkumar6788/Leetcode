class Solution {
    public boolean judgeCircle(String moves) {
        int l = 0;
        int r = 0;
        int u = 0;
        int d = 0;
        for (int ch = 0; ch < moves.length(); ch++) {
            if (moves.charAt(ch) == 'L') l++;
            else if (moves.charAt(ch) == 'R') r++;
            else if (moves.charAt(ch) == 'U') u++;
            else d++;
        }
        return (l == r && d == u);
    }
}