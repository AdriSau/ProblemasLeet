package Solved;

import java.util.HashMap;
import java.util.LinkedList;

public class L_695 {
    public int maxAreaOfIsland(int[][] grid) {
        boolean[][] islands = new boolean[grid.length][grid[0].length];
        int act, max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0 && !islands[i][j]){
                    act = islandFinder(grid,islands,i,j);
                    if (act > max){
                        max = act;
                    }
                }
            }

        }
        return max;
    }
    private int islandFinder (int[][] grid, boolean[][] islands, int x, int y){
        int res = 0;
        if (x >= 0 && x < grid.length && y >= 0 && y < grid[0].length && grid[x][y] != 0 && !islands[x][y]){
            islands[x][y] = true;
            res++;
            if (x+1 >= 0 && x+1 < grid.length && y >= 0 && y < grid[0].length && grid[x+1][y] != 0 && !islands[x+1][y]){
                res+=islandFinder(grid,islands,x+1,y);
            }
            if (x >= 0 && x < grid.length && y+1 >= 0 && y+1 < grid[0].length && grid[x][y+1] != 0 && !islands[x][y+1]){
                res+=islandFinder(grid,islands,x,y+1);
            }
            if (x >= 0 && x < grid.length && y-1 >= 0 && y-1 < grid[0].length && grid[x][y-1] != 0 && !islands[x][y-1]){
                res+=islandFinder(grid,islands,x,y-1);
            }
            if (x-1 >= 0 && x-1 < grid.length && y >= 0 && y < grid[0].length && grid[x-1][y] != 0 && !islands[x-1][y]){
                res+=islandFinder(grid,islands,x-1,y);
            }
            return  res;
        }else return 0;
    }
}
