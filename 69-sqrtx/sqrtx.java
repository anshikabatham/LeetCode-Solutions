class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        long left = 1;
        long right = x;
        long ans = 0;

        while (left <= right) {
            long mid = left + (right - left) / 2;

            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                ans = mid; // Store potential answer and search right for a closer match
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return (int) ans;
    }
}