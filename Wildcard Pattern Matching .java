class Solution
{
    int wildCard(String pattern, String str)
    {
        int m = str.length();
        int n = pattern.length();
        
        // Create a DP array to store the results of subproblems
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        // An empty pattern matches an empty string
        dp[0][0] = true;
        
        // Handle patterns that start with '*'
        for (int j = 1; j <= n; j++) {
            if (pattern.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }
        
        // Fill the DP array
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // If characters match or pattern has '?', take the result from the diagonal cell
                if (pattern.charAt(j - 1) == '?' || pattern.charAt(j - 1) == str.charAt(i - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                }
                // If pattern has '*', consider it as (0, 1, or more) characters
                else if (pattern.charAt(j - 1) == '*') {
                    dp[i][j] = dp[i - 1][j] || dp[i][j - 1];
                }
            }
        }
        
        // The result is in the bottom-right cell of the DP array
        return dp[m][n] ? 1 : 0;
    }
}
