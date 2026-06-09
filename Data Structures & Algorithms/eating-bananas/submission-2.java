class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = 1_000_000_000;
        while (left < right){
            int k = left + (right - left) / 2;
            int totalHours = 0;
            for (int i = 0; i < piles.length; i++){
                totalHours += (piles[i] / k);
                if (piles[i] % k != 0) {
                    totalHours += 1;
                }
            }
            if (totalHours <= h ){
                right = k;
            }
            else {
                left = k + 1;
            }
        }
        return left;
    }
}
