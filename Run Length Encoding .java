class GfG {
    String encode(String str) {
        StringBuilder encodedString = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                encodedString.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        // Append the last character and its count
        encodedString.append(str.charAt(str.length() - 1)).append(count);

        return encodedString.toString();
    }
}
