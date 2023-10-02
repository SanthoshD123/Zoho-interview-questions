class Solution {
    ArrayList<Integer> findSum(int a[], int b[]) {
        int maxLength = Math.max(a.length, b.length) + 1;
        int[] result = new int[maxLength];

        int carry = 0;
        int i = a.length - 1;
        int j = b.length - 1;
        int index = maxLength - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a[i];
                i--;
            }

            if (j >= 0) {
                sum += b[j];
                j--;
            }

            result[index] = sum % 10;
            carry = sum / 10;

            index--;
        }

        // Skip leading zeros
        int start = 0;
        while (start < maxLength - 1 && result[start] == 0) {
            start++;
        }

        ArrayList<Integer> resultList = new ArrayList<>();
        for (int k = start; k < maxLength; k++) {
            resultList.add(result[k]);
        }

        return resultList;
    }
}
---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  //try this simpler one but not all testcase will pass
  import java.util.ArrayList;

class Solution {
    ArrayList<Integer> findSum(int a[], int b[]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int carry = 0;
        int i = a.length - 1;
        int j = b.length - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a[i];
                i--;
            }

            if (j >= 0) {
                sum += b[j];
                j--;
            }

            result.add(0, sum % 10);
            carry = sum / 10;
        }

        return result;
    }
}
