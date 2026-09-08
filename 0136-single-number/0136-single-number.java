class Solution {
    public int singleNumber(int[] nums) {
        int[] freq = new int[60001];
        for(int i=0;i<nums.length;i++){
            freq[nums[i]+30000]++;
        }
        for(int i=0;i<nums.length;i++){
            if(freq[nums[i]+30000]==1){
                return nums[i];
            }

        }
        return 0;    
    }
}