//MERGE STRINGS ALTERNATELY

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0, j = 0;
        StringBuilder strBuilder = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();
        while(i < length1 && j < length2)
       {
                strBuilder.append(word1.charAt(i));
                strBuilder.append(word2.charAt(j));
                i++;
                j++;
       }           
       if(i < length1)
                	strBuilder.append(word1.substring(i));            
       if(j < length2)
              		 strBuilder.append(word2.substring(j));           
       return strBuilder.toString();

    }
}
