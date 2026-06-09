class Solution {
    public int totalFruit(int[] fruits) {
        int maxTrees = 0;
        for (int i = 0; i < fruits.length; i++) {
            int[] types = new int[] {-1, -1};
            for (int j = i; j < fruits.length; j++) {
                if (types[0] == -1) types[0] = fruits[j];
                else if (types[0] != fruits[j] && types[1] == -1) types[1] = fruits[j];
                else if (types[0] != fruits[j] && types[1] != fruits[j]) break;
                maxTrees = Math.max(maxTrees, j - i + 1);
            }
        }
        return maxTrees;
    }
}