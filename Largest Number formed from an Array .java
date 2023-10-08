
class Solution {
    String printLargest(String[] arr) {
        // Use lambda expression for Comparator
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Handle the case where the array contains only zeros
        if (arr[0].equals("0")) {
            return "0";
        }

        // Concatenate the sorted strings to form the result using String.join
        return String.join("", arr);
    }
}

