package Solved;

import java.util.HashMap;

public class L_189 {
    public void rotate(int[] nums, int k) {
        HashMap<Integer,Integer> quitados = new HashMap<>();
        int colocar, targetNumber;
        for (int i = 0; i < nums.length; i++) {
            targetNumber = i + k;
            if (targetNumber > nums.length-1){
                while(targetNumber > nums.length-1) {
                    targetNumber -= (nums.length);
                }
            }
            // elijo al que tengo que colocar
            if (quitados.containsKey(i)){
                colocar = quitados.get(i);
            }else{ colocar = nums[i];}

            //mapeo al que quito
            quitados.put(targetNumber,nums[targetNumber]);
            //hago el cambio
            nums[targetNumber] = colocar;
        }
    }
}
