/*class Solution {
    static String crossPattern(String S) {
        int size = S.length();
        int k = size;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;i++){
                if(i==j){
                    System.out.print(S.charAt(i)+" ");
                    if(i==size/2){
                        --k;
                    }
                }else if(i+j==size-1){
                    System.out.print(S.charAt(--k)+" ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/
class Solution {
    static String crossPattern(String S) {
        int size = S.length();
        int k = size;
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    result.append(S.charAt(i)).append(" ");
                    if (i == size / 2) {
                        --k;
                    }
                } else if (i + j == size - 1) {
                    result.append(S.charAt(--k)).append(" ");
                } else {
                    result.append("  ");  // Adjusted the number of spaces
                }
            }
            result.append("\n");
        }

        return result.toString();
    }
}
