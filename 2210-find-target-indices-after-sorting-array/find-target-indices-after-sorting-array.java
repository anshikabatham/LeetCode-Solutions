import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int smallerCount = 0;
        int freq = 0;

        // Count how many numbers are smaller and how many match the target
        for (int num : nums) {
            if (num < target) {
                smallerCount++;
            } else if (num == target) {
                freq++;
            }
        }

        // Build the consecutive index list
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < freq; i++) {
            result.add(smallerCount + i);
        }

        return result;
    }
}