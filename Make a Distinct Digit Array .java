

class Solution {
    public int[] common_digits(int[] nums) {
        // Initialize a set to store distinct digits
        Set<Integer> digitSet = new HashSet<>();

        // Iterate through each number in the array
        for (int num : nums) {
            // Convert the number to a string to iterate through its digits
            for (char digitChar : String.valueOf(num).toCharArray()) {
                // Add each digit to the set
                int digit = Character.getNumericValue(digitChar);
                digitSet.add(digit);
            }
        }

        // Convert the set to an array and sort it in ascending order
        int[] result = new int[digitSet.size()];
        int index = 0;
        for (int digit : digitSet) {
            result[index++] = digit;
        }
        Arrays.sort(result);

        return result;
    }
}
