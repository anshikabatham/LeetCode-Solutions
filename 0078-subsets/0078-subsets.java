
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int idx = 0;
        List<List<Integer>> ans = new ArrayList<>();
        f(nums, ans, new ArrayList<>(), idx);
        return ans;
    }

    public void f(int[] nums, List<List<Integer>> ans, List<Integer> num, int idx) {
        if (idx >= nums.length) {
            ans.add(new ArrayList<>(num));
            return;
        }

        num.add(nums[idx]);
        f(nums, ans, num, idx + 1);

        num.remove(num.size() - 1);
        f(nums, ans, num, idx + 1);
    }
}