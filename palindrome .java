class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int original = n;
        int reversed = 0;
        
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        
        if (original == reversed) {
            return "Yes";
        } else {
            return "No";
        }
    }
}
