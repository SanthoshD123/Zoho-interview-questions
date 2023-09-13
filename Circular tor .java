class Solution {
    // Function to find starting point where the truck can start to get through
    // the complete circle without exhausting its petrol in between.
    int tour(int petrol[], int distance[]) {
        int n = petrol.length;
        int start = 0;
        int currentPetrol = 0;
        int totalPetrol = 0;

        for (int i = 0; i < n; i++) {
            currentPetrol += petrol[i] - distance[i];
            totalPetrol += petrol[i] - distance[i];

            if (currentPetrol < 0) {
                start = i + 1;
                currentPetrol = 0;
            }
        }

        if (totalPetrol >= 0) {
            return start;
        } else {
            return -1;
        }
    }
}
