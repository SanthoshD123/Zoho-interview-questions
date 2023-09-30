class Solution {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int i;
        for(i=0;i<n-1;i++){
            if(a[i]!=b[i]){
                return i;
            }
        }
        return i;
    }
}
