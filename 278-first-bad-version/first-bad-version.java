/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */


/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        int firstBad = n; // Variable to store the potential first bad version

        while (left <= right) {
            // Prevent potential integer overflow during mid calculation
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                firstBad = mid;   // Record the current bad version
                right = mid - 1;  // Try to find an even earlier bad version on the left
            } else {
                left = mid + 1;   // If it's good, the first bad version must be to the right
            }
        }

        return firstBad;
    }
}