class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; // Pointer for the position of valid elements

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }

        // 'i' represents the new length of the array with all instances of 'val' removed
        return i;
    }
}