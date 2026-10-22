
class Solution {
    public int maxProduct(int[] nums) {
        int max1 = 0; // Largest element
        int max2 = 0; // Second largest element

        for (int num : nums) {
            if (num > max1) {
                max2 = max1; // Previous max becomes second max
                max1 = num;  // Update new max
            } else if (num > max2) {
                max2 = num;  // Update second max if it's smaller than max1 but larger than max2
            }
        }

        return (max1 - 1) * (max2 - 1);
    }
}