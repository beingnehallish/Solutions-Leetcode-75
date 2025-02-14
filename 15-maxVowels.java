//MAX VOWELS IN SUBSTRING => Sliding Window
class Solution {
    public int maxVowels(String s, int k) {
int[] vowel = new int[26]; // Array to store vowels
        vowel['a' - 'a'] = 1;
        vowel['e' - 'a'] = 1;
        vowel['i' - 'a'] = 1;
        vowel['o' - 'a'] = 1;
        vowel['u' - 'a'] = 1;

        int count = 0, max = 0;
        
        // First window of size `k`
        for (int i = 0; i < k; i++) {
            if (vowel[s.charAt(i) - 'a'] == 1) count++;
        }
        max = count;

        // Sliding window
        for (int i = k; i < s.length(); i++) {
            if (vowel[s.charAt(i) - 'a'] == 1) count++;   // Add new char
            if (vowel[s.charAt(i - k) - 'a'] == 1) count--; // Remove old char
            max = Math.max(max, count);
        }

        return max;
    }
}
