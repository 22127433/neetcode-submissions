class Solution {
    private int convertToNumber(char tens, char units){
        return (tens - '0') * 10 + (units - '0');
    }
    public int countSeniors(String[] details) {
        int cnt = 0;
        for (String detail : details){
            if (convertToNumber(detail.charAt(11), detail.charAt(12)) > 60) cnt++;
        }

        return cnt;
    }
}