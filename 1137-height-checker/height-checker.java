import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        // Create a sorted copy of the original array
        int[] expected = heights.clone();
        Arrays.sort(expected);
        
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i]) {
                count++;
            }
        }
        
        return count;
    }
}