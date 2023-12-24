package UN_Solved;

public class L_486 {
    public boolean predictTheWinner(int[] nums) {
        int iLow = 0, iHigh = nums.length-1,p1 = 0,p2 = 0;
        boolean turn = true;
        while(iLow != iHigh || iLow < iHigh ){
            // Evaluo si hay segunda jugada
            if(iHigh-iLow >= 3){
                 if(nums[iLow]+ Math.max(Math.min(nums[iLow+1],nums[iHigh]),nums[iHigh-1]) >= Math.max(nums[iLow+1],nums[iHigh]) + Math.min(Math.min(nums[iLow+1],nums[iHigh]),nums[iHigh-1])){
                   if (turn){
                       p1+=nums[iLow];
                   }else{
                       p2+=nums[iLow];
                   }
                   iLow++;
                 }else{
                     if (turn){
                         p1+=nums[iHigh];
                     }else{
                         p2+=nums[iHigh];
                     }
                     iHigh--;
                 }
            }else { // si no hay segunda jugada cojo el maximo
                if(nums[iLow] >= nums[iHigh]){
                    if (turn){
                        p1+=nums[iLow];
                    }else{
                        p2+=nums[iLow];
                    }
                    iLow++;
                }else{
                    if (turn){
                        p1+=nums[iHigh];
                    }else{
                        p2+=nums[iHigh];
                    }
                    iHigh--;
                }
            }
            if (turn){
                turn = false;
            }else turn = true;

        }
        if(iLow == iHigh){
            p1+=nums[iLow];
        }
        if(p1>=p2){
            return true;
        }else return false;
    }
}
