class Solution {
    int solution(int[][] land) {
        // int answer = 0;
        for (int i = 1; i < land.length; i++) {
            for (int j = 0; j < land[0].length; j++) {
                int prevMax = 0;
                for (int k = 0; k < land[0].length; k++) {
                    if (k != j) {
                        prevMax = Math.max(prevMax, land[i-1][k]);
                    }
                }
                land[i][j] += prevMax;
            }
        }
        int max = 0;
        for (int num : land[land.length - 1]) {
            max = Math.max(max, num);
        }
        return max;
    }
}