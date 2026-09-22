class Solution {
    public String[] findWords(String[] words) {
        int[] freq=new int[26];
        //String[] str={};
        String A ="qwertyuiop";
        String B ="asdfghjkl";
        String C="zxcvbnm";
        for(int i=0;i<A.length();i++){
            freq[A.charAt(i)-'a']=1;
        }
        for(int i=0;i<B.length();i++){
            freq[B.charAt(i)-'a']=2;
        }
        for(int i=0;i<C.length();i++){
            freq[C.charAt(i)-'a']=3;
        }
        String[] ans=new String[words.length];//store for answers
        int k=0;
        for(String ch:words){
            String sk =ch.toLowerCase(); //temporary store in sk
            int r=freq[sk.charAt(0)-'a'];
        boolean taken =true;
            for(int i=1;i<sk.length();i++){
                if(r!=freq[sk.charAt(i)-'a']){
                 taken = false;   

                }
            }
            if(taken){
                ans[k++]=ch;
            }
        }
        return Arrays.copyOf(ans,k);
        //return ans;
    }
}