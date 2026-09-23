class Solution {
    
    public int maxVowels(String s, int k) {
        int count=0;
        int maxvowels=0;
        for(int i=0;i<k;i++){
          if(isVowels(s.charAt(i))){
            count++;
              }
        }
        maxvowels = count;


        for(int i=k;i<s.length();i++){
         if(isVowels(s.charAt(i))){
            count++;
         }
         if(isVowels(s.charAt(i-k))){
            count--;
         }

        maxvowels=Math.max(maxvowels,count);    
        }

    return maxvowels;
    }

    public static boolean isVowels(char ch){

        if(ch == 'a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return true;
        }
        return false;

    }
}

//if(maxvowels==k){
//return maxvowel
//}


