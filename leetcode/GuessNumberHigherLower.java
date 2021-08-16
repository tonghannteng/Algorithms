//  374. Guess Number Higher or Lower

/**
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is lower than the guess number
 *			      1 if num is higher than the guess number
 *               otherwise return 0
 * int guess(int num);
 */

public class GuessNumberHigherLower extends GuessGame {

    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left < right) {
            int mid = (right - left)/2 + left;
            int r = guess(mid);
            if (r == 0) {
                return mid;
            } else if (r == 1) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
