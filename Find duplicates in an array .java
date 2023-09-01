class Solution {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                result.add(arr[i]);
                while (i < n - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}
