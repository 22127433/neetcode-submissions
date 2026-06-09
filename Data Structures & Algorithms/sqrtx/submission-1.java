class Solution {
    public int mySqrt(int x) {
        int i = 0;
        while (i < x){
            i++;
            if (i > x / i){
                i--;
                break;
            }
            else if (i == x / i){
                break;
            }
        }
        return i;
    }
}