class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String ans = "";
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String revWord = "";
            
            for (int j = word.length() - 1; j >= 0; j--) {
                revWord += word.charAt(j);
            }
            
            if (i > 0) { 
                ans += " ";
            }
            ans += revWord;
        }
        
        return ans;
    }
}