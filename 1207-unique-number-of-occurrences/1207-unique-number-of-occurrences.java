class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq=new int[2001];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]+1000]++;
        }
        int[] freq2=new int[1001];
        for(int i=0;i<freq.length;i++){
            freq2[freq[i]]++;
        }
        for(int i=0;i<freq2.length;i++){
            if(freq2[i]>=2&&i!=0){
                return false;
            }
        }

    
        return true; 
    }
}