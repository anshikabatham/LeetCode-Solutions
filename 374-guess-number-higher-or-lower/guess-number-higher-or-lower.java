/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;

        while (left <= right) {
            // Prevent potential integer overflow
            int mid = left + (right - left) / 2;
            int res = guess(mid);

            if (res == 0) {
                return mid; // Found the correct number
            } else if (res < 0) {
                right = mid - 1; // Our guess is too high, search the left half
            } else {
                left = mid + 1;  // Our guess is too low, search the right half
            }
        }

        return -1; // Should never be reached if constraints are met
    }
}