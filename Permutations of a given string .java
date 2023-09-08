class Solution {
    public List<String> find_permutation(String S) {
        List<String> result = new ArrayList<>();
        char[] chars = S.toCharArray();
        Arrays.sort(chars); // Sort the characters in the input string
        
        boolean[] used = new boolean[S.length()];
        StringBuilder currentPermutation = new StringBuilder();
        
        generatePermutations(chars, used, currentPermutation, result);
        
        return result;
    }
    
    private void generatePermutations(char[] chars, boolean[] used, StringBuilder currentPermutation, List<String> result) {
        if (currentPermutation.length() == chars.length) {
            result.add(currentPermutation.toString());
            return;
        }
        
        for (int i = 0; i < chars.length; i++) {
            if (!used[i]) {
                // Avoid duplicates by skipping characters that are the same as the previous character
                if (i > 0 && chars[i] == chars[i - 1] && !used[i - 1]) {
                    continue;
                }
                
                used[i] = true;
                currentPermutation.append(chars[i]);
                
                generatePermutations(chars, used, currentPermutation, result);
                
                used[i] = false;
                currentPermutation.deleteCharAt(currentPermutation.length() - 1);
            }
        }
    }
}
