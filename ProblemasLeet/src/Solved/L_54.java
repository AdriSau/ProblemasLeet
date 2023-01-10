package Solved;
import java.util.LinkedList;
import java.util.List;
//https://leetcode.com/problems/spiral-matrix/submissions/874048141/

public class L_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        int inicioX = 0, finX = matrix.length - 1 ;
        int inicioY = 0, finY = matrix[0].length - 1;
        int i;
        boolean fin = false;
        LinkedList<Integer> sol = new LinkedList<>();
        while (sol.size() < matrix.length * matrix[0].length){
            // requiere incrementar inicioX al final del bucle
            // finx --
            for (i = inicioY; i <= finY && !fin; i++) {
                sol.add(matrix[inicioY][i]);
                if (sol.size() >= matrix.length * matrix[0].length){
                    fin = true;
                    break;
                }
            }

            for (i = inicioX + 1; i <= finX - 1 && !fin; i++) {
                sol.add(matrix[i][finY]);
                if (sol.size() >= matrix.length * matrix[0].length){
                    fin = true;
                    break;
                }
            }
            for (i = finY; i >= inicioY && !fin; i--) {
                sol.add(matrix[finX][i]);
                if (sol.size() >= matrix.length * matrix[0].length){
                    fin = true;
                    break;
                }
            }
            for (i = finX - 1; i >= inicioX + 1 && !fin; i--) {
                sol.add(matrix[i][inicioY]);
                if (sol.size() >= matrix.length * matrix[0].length){
                    fin = true;
                    break;
                }
            }
            inicioX++;
            inicioY++;
            finX--;
            finY--;
        }
        return sol;
    }
}
