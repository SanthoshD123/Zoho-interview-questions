class Solution {
    public String reverse(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            // Move the left pointer to the right until an alphabet character is found
            while (left < right && !Character.isLetter(chars[left])) {
                left++;
            }

            // Move the right pointer to the left until an alphabet character is found
            while (left < right && !Character.isLetter(chars[right])) {
                right--;
            }

            // Swap the characters at the left and right pointers
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
    }
}
