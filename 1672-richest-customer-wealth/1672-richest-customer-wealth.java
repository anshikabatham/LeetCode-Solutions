class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxwealth=0;
        for(int i=0;i<accounts.length;i++){
            int currentcustomerwealth=0;
            for(int j=0;j<accounts[i].length;j++){
                currentcustomerwealth=currentcustomerwealth+accounts[i][j];
            }
            maxwealth =Math.max(maxwealth,currentcustomerwealth);
        }
        return maxwealth;
        
    }
}