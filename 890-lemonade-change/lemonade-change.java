
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fiveCount = 0;
        int tenCount = 0;

        for (int bill : bills) {
            if (bill == 5) {
                fiveCount++;
            } else if (bill == 10) {
                if (fiveCount > 0) {
                    fiveCount--;
                    tenCount++;
                } else {
                    return false; // Can't give change
                }
            } else { // bill == 20
                // Greedily try to give $10 + $5 first
                if (tenCount > 0 && fiveCount > 0) {
                    tenCount--;
                    fiveCount--;
                } 
                // Otherwise, try to give three $5 bills
                else if (fiveCount >= 3) {
                    fiveCount -= 3;
                } else {
                    return false; // Can't give change
                }
            }
        }

        return true;
    }
}