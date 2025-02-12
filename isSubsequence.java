//IS SUBSEQUENCE => "absedy" => "abd" is true BUT "adb" is NOT TRUE.

class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
        for (char c : t.toCharArray()) {
            if (i < s.length() && c == s.charAt(i)) {
                i++;
            }
        }        
        return i == s.length(); 
   }
}
