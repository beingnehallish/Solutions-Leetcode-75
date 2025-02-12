class Solution {
    public String reverseWords(String s) {
        char[] ch = s.toCharArray();
        StringBuilder str = new StringBuilder();
        int left = 0, right = ch.length-1;
        while(right >= 0){
            while(right >= 0 && ch[right] == ' ') 
                right--;
            if(right < 0) 
                break;
            left = right;
            while(right >= 0 && ch[right] != ' ')
                right--;
            for(int i=right+1;i<=left;i++){
                str.append(ch[i]);
            }
            str.append(' ');
        }
        return str.substring(0, str.length()-1);
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
