class Solution {
    static int isLeap(int N) {
        // If the year is divisible by 4
        if (N % 4 == 0) {
            // If the year is not divisible by 100 or it is divisible by 400
            if (N % 100 != 0 || N % 400 == 0) {
                return 1; // Leap year
            }
        }
        
        return 0; // Not a leap year
    }
}
