class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int start = 0;
        int end = 0;
        if (n <= 1) {
            return s;
        }
        for (int i = 0; i < n; i++) {
            int p1 = i;
            int p2 = i;
            while (p1 >= 0 && p2 < n && s.charAt(p1) == s.charAt(p2)) {
                p1--;
                p2++;
            }
            int oddLen = p2 - p1 - 1;
            p1 = i;
            p2 = i + 1;
            while (p1 >= 0 && p2 < n && s.charAt(p1) == s.charAt(p2)) {
                p1--;
                p2++;
            }
            int evenLen = p2 - p1 - 1;
            int len = Math.max(oddLen, evenLen);
            if (len > end - start + 1) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
}