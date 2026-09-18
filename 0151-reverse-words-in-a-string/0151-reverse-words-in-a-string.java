class Solution {
    public String reverseWords(String s) {
        String ans="";
        String[] str =s.split(" ");
        for(int i=str.length-1;i>=0;i--){
            if(!str[i].isEmpty()){
                if(!ans.isEmpty()){
                    ans+=" ";
                }
                ans+=str[i];
            }
        }
        return ans;
        
    }
}