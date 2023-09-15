class Solution
{ 
    // Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
        // r=row number
        int r = 0;
        for (int i = 1; i < n; i++) {
            // Checking if r-th person knows i-th person.
            if (M[r][i] == 1) {
                M[r][r] = 1;
                r = i;
            } else {
                M[i][i] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            // Checking if i-th person can be a celebrity or not.
            if (M[i][i] == 0) {
                int flag = 0;
                // Iterating in the i-th column to check whether everyone knows i-th person or not.
                for (int j = 0; j < n; j++) {
                    // Checking if M[j][i] is not a diagonal element and if j-th person knows i-th person.
                    if (j != i && M[j][i] == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag == 0)
                    return i;
            }
        }
        return -1;
    }
}
