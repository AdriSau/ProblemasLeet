package UN_Solved;

public class L_240 {
    //https://leetcode.com/problems/search-a-2d-matrix-ii/
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean res = false;
        boolean nonSquare = false;
        int lim;
        int topNumberIndex;
        if(matrix.length != matrix[0].length){
           nonSquare = true;
           lim = Math.min(matrix.length,matrix[0].length);
        }else lim = matrix.length;
        for (int i = 0; i < lim && !res; i++) {
            if (matrix[i][i] > target){
                topNumberIndex = i;
                for (int j = 0; j < topNumberIndex && !res ; j++) {
                    if (matrix[j][topNumberIndex] == target || matrix[topNumberIndex][j] == target){
                        res = true;
                    }
                }
                if (topNumberIndex+1 <= matrix.length-1 && topNumberIndex+1 <= matrix[0].length-1){
                    topNumberIndex++;
                    for (int j = 0; j < topNumberIndex && !res ; j++) {
                        if (matrix[j][topNumberIndex] == target || matrix[topNumberIndex][j] == target){
                            res = true;
                        }
                    }
                }
                break;
            }else if(matrix[i][i] == target){
                res = true;
            }
        }
        if (!res && nonSquare){
            return nonSquareSerchear(matrix,target);
        }else return res;
    }
    private boolean nonSquareSerchear(int[][] matrix, int target){
        //m.L -> filas
        //m[0].l -> columnas
        if(matrix.length > matrix[0].length){
            for (int i = 0; i < matrix.length; i++) {
                if(matrix[i][matrix[0].length-1] == target){
                    return true;
                }
            }
        }else{
            for (int i = 0; i < matrix[0].length; i++) {
                if(matrix[matrix.length-1][i] == target){
                    return true;
                }
            }
        }
        return false;
    }



}
