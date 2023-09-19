class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }

        int result = 0;
        int prevValue = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            char c = str.charAt(i);
            int value = getValue(c);

            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }

            prevValue = value;
        }

        return result;
    }

    private int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}
