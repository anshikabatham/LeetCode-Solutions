
import java.util.TreeSet;

class Solution {
    public int thirdMax(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int num : nums) {
            set.add(num);
            if (set.size() > 3) {
                set.pollFirst(); // Removes the smallest element, keeping only top 3
            }
        }
        
        // If we have 3 or more distinct numbers, the third max is the first element in the set
        // Otherwise, the maximum is the last element in the set
        return set.size() == 3 ? set.first() : set.last();
    }
}