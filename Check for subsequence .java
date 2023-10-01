class Solution {
    static boolean isSubSequence(String A, String B) {
        int m = A.length();
        int n = B.length();

        int i = 0, j = 0;

        while (i < m && j < n) {
            // If current characters match, move both pointers
            if (A.charAt(i) == B.charAt(j)) {
                i++;
            }
            // Move pointer in string B
            j++;
        }

        // If all characters of A were found in B in order
        return i == m;
    }
}
