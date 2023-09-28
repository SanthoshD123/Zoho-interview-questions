class Solution {
    static String longestPalin(String S) {
        if (S == null || S.length() == 0) {
            return "";
        }

        StringBuilder modifiedString = new StringBuilder();
        modifiedString.append('#');
        for (char c : S.toCharArray()) {
            modifiedString.append(c);
            modifiedString.append('#');
        }

        int n = modifiedString.length();
        int[] P = new int[n];
        int C = 0;
        int R = 0;
        int maxLen = 0;
        int maxCenter = 0;

        for (int i = 0; i < n; i++) {
            int mirror = 2 * C - i;

            if (i < R) {
                P[i] = Math.min(R - i, P[mirror]);
            }

            int a = i + (1 + P[i]);
            int b = i - (1 + P[i]);

            while (a < n && b >= 0 && modifiedString.charAt(a) == modifiedString.charAt(b)) {
                P[i]++;
                a++;
                b--;
            }

            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }

            if (P[i] > maxLen) {
                maxLen = P[i];
                maxCenter = i;
            }
        }

        int start = (maxCenter - maxLen) / 2;
        int end = start + maxLen;
        return S.substring(start, end);
    }
}
