class Solution {
    public boolean hasAlternatingBits(int n) {
        int prevBit = -1;

        while (n > 0) {
            int currentBit = n & 1; // Get the last bit
            
            if (currentBit == prevBit) {
                return false; // Two adjacent bits are the same
            }
            
            prevBit = currentBit;
            n >>= 1; // Shift right to check the next bit
        }

        return true;
    }
}