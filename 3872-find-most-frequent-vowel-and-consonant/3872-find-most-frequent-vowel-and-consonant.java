class Solution {
    public int maxFreqSum(String s) {
        int[] freq = new int[26];

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }

        int maxVowel = 0;
        int maxConsonant = 0;

        // Find max vowel and consonant frequency
        for (int i = 0; i < 26; i++) {
            if (freq[i] > 0) {
                char c = (char) (i + 'a');
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    if (freq[i] > maxVowel) {
                        maxVowel = freq[i];
                    }
                } else {
                    if (freq[i] > maxConsonant) {
                        maxConsonant = freq[i];
                    }
                }
            }
        }

        return maxVowel + maxConsonant;
    }
}