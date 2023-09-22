class Solution {
    String reverseWords(String S) {
        StringBuilder result = new StringBuilder();
        StringBuilder currentWord = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == '.') {
                // Handle dots by reversing the current word and appending it
                String reversedWord = currentWord.reverse().toString();
                result.append(reversedWord).append('.');
                currentWord.setLength(0); // Reset the current word
            } else {
                // Add characters to the current word
                currentWord.append(c);
            }
        }

        // Append the last word (no dot after it)
        String reversedWord = currentWord.reverse().toString();
        result.append(reversedWord);

        return result.toString();
    }
}
