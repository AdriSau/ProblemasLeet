package Solved;

public class L_2090 {
    public int[] getAverages(int[] nums, int k) {
        int [] res = new int[nums.length];
        long aux = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - k < 0 || i + k >= nums.length ){
                res[i] = -1;
            }else{
                 aux = 0;
                for (int j = 1; j < k+1; j++) {
                    aux += nums[i+j];
                    aux += nums[i-j];
                }
                aux += nums[i];
                aux = aux / (k*2+1);
                res[i] =  (int) aux;
            }
        }
        return res;
    }

}
