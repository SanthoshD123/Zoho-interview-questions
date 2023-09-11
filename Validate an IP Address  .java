class Solution {
    public boolean isValid(String s) {
        // Check if the input string ends with a dot
        if (s.endsWith(".")) {
            return false;
        }

        // Split the input IP address into four parts based on the dot separator
        String[] parts = s.split("\\.");

        // Check if there are exactly 4 parts
        if (parts.length != 4) {
            return false;
        }

        // Check each part for validity
        for (String part : parts) {
            // Check if the part is a non-empty string consisting of digits only
            if (!part.matches("\\d+")) {
                return false;
            }

            // Parse the part as an integer
            int num = Integer.parseInt(part);

            // Check if the part is within the range [0, 255]
            if (num < 0 || num > 255) {
                return false;
            }

            // Check for leading zeros (e.g., 01, 001, etc.)
            if (part.length() > 1 && part.charAt(0) == '0') {
                return false;
            }
        }

        // If all checks pass, the IP address is valid
        return true;
    }
}
