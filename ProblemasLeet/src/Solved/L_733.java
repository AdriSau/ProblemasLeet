package Solved;

public class L_733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (color == image[sr][sc]){
            return image;
        }else{
            colorPetition(image,sr,sc,color,image[sr][sc]);
        }
        return image;
    }
    private void colorPetition (int[][] image, int x, int y, int color, int originalColor){
        if (x >= 0 && x < image.length && y >= 0 && y < image[0].length){
            if (image[x][y] == originalColor){
                image[x][y] = color;
                colorPetition(image,x+1,y,color,originalColor);
                colorPetition(image,x,y+1,color,originalColor);
                colorPetition(image,x-1,y,color,originalColor);
                colorPetition(image,x,y-1,color,originalColor);
            }
        }
    }

}
