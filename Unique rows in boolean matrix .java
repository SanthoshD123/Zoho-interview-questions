class GfG {
    public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][], int r, int c) {
        ArrayList<ArrayList<Integer>> uniqueRows = new ArrayList<>();
        HashSet<ArrayList<Integer>> seenRows = new HashSet<>();

        for (int i = 0; i < r; i++) {
            ArrayList<Integer> currentRow = new ArrayList<>();
            for (int j = 0; j < c; j++) {
                currentRow.add(a[i][j]);
            }

            // If the row is not in the set, it's unique
            if (!seenRows.contains(currentRow)) {
                uniqueRows.add(currentRow);
                seenRows.add(currentRow);
            }
        }

        return uniqueRows;
    }
}
