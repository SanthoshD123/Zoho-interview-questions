class Solution {
    public static int wordBreak(String A, ArrayList<String> B) {
        int n = A.length();
        int[] dp = new int[n + 1];
        Set<String> dictionary = new HashSet<>(B);

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] == 1 && dictionary.contains(A.substring(j, i))) {
                    dp[i] = 1;
                    break;
                }
            }
        }

        return dp[n];
    }
}
