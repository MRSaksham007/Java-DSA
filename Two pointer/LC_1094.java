class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] passengers = new int[1001];
        for (int[] trip : trips) {
            int num = trip[0];
            int start = trip[1];
            int end = trip[2];
            passengers[start] += num;
            passengers[end] -= num;
        }
        int current = 0;
        for (int i = 0; i < 1001; i++) {
            current += passengers[i];
            if (current > capacity) {
                return false;
            }
        }
        return true;
    }
}