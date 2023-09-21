class Solution {
    public int CountWays(String str) {
        int MOD = 1000000007;
        int n = str.length();
        long[] dp = new long[n + 1];

        dp[0] = 1;
        dp[1] = (str.charAt(0) == '0') ? 0 : 1;

        for (int i = 2; i <= n; i++) {
            int oneDigit = Integer.parseInt(str.substring(i - 1, i));
            int twoDigits = Integer.parseInt(str.substring(i - 2, i));

            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
                dp[i] %= MOD;
            }

            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
                dp[i] %= MOD;
            }
        }

        return (int) dp[n];
    }
}
