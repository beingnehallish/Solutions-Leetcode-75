class Solution {
    public String reverseWords(String s) {
        char[] source = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int left = 0, right = source.length-1;
        while(right >= 0){
            while(right >= 0 && source[right] == ' ') right--;
            if(right < 0) break;
            left = right;
            while(right >= 0 && source[right] != ' ') right--;
            for(int i=right+1;i<=left;i++){
                stringBuilder.append(source[i]);
            }
            stringBuilder.append(' ');
        }
        return stringBuilder.substring(0, stringBuilder.length()-1);
    }

OR

class Solution {
    public static String reverseWords(String s) {
        String[] words = s.trim().split("\\s+"); // Split by spaces, remove extra spaces
        StringBuilder result = new StringBuilder();
        
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        
        return result.toString().trim(); // Remove trailing space
    }
}
