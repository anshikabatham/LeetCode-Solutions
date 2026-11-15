class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int i = 0; // Pointer for the last unique element placed

        for (int j = 1; j < nums.length; j++) {
            // If we find a new unique element
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j]; // Place it at the next available unique slot
            }
        }

        // Return the count of unique elements (index + 1)
        return i + 1;
    }
}