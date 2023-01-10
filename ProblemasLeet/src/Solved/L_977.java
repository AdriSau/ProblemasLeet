package Solved;

import java.util.Arrays;
import java.util.stream.IntStream;

public class L_977 {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i],2);
        }
        IntStream stream = Arrays.stream(nums).sorted();
        return stream.toArray();
    }

//    public static void main(String[] args) {
//        L_977 exe = new L_977();
//        int[] nums = {-4,-1,0,3,1};
//        exe.sortedSquares(nums);
//    }
}
