class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
         List<Integer> luckyNumbers = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;

        // Her satırdaki minimum elemanları bul
        int[] rowMin = new int[m];
        for (int i = 0; i < m; i++) {
            int min = matrix[i][0];
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            rowMin[i] = min;
        }

        // Bu minimum elemanların bulundukları sütunlarda maksimum olup olmadığını kontrol et
        for (int j = 0; j < n; j++) {
            int maxInCol = matrix[0][j];
            for (int i = 1; i < m; i++) {
                if (matrix[i][j] > maxInCol) {
                    maxInCol = matrix[i][j];
                }
            }
            for (int i = 0; i < m; i++) {
                if (rowMin[i] == maxInCol) {
                    luckyNumbers.add(rowMin[i]);
                }
            }
        }

        return luckyNumbers;
    }
}