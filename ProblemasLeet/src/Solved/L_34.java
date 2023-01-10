package Solved;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/?envType=study-plan&id=algorithm-ii
public class L_34 {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0){
            return new int[] {-1,-1};
        }else return new int[] {buscarInicio(nums,target,0,nums.length-1),buscarFinal(nums,target,0,nums.length-1)};

    }
    private int buscarInicio (int[] nums, int target, int io, int n){
        if(io == n){
            if (nums[io] == target){
                if (io == 0){
                    return io;
                }else if (nums[io-1] != target){
                    return io;
                }else return -1;
            }else return -1;
        }else if (io + 1 == n ) {
            if(nums[io] == target){
                if (io == 0){
                    return io;
                }else if (nums[io-1] != target){
                    return io;
                }else return -1;
            }else if (nums[n] == target) {
                return n;
            }else return -1;
        }else{
            int k = (io+n)/2;
            if(nums[k] == target){
                 return buscarInicio(nums,target,io,k);
            }else if (nums[k] > target){
                return buscarInicio(nums,target,io,k);
            }else  return buscarInicio(nums,target,k,n);
        }
    }
    private int buscarFinal (int[] nums, int target, int io, int n){
        if(io == n){
            if (nums[n] == target){
                if (n == nums.length-1){
                    return n;
                }else if (nums[n+1] != target){
                    return n;
                }else return -1;
            }else return -1;
        }else if (io + 1 == n ) {
            if(nums[n] == target){
                if (n == nums.length-1){
                    return n;
                }else if (nums[n+1] != target){
                    return n;
                }else return -1;
            }else if (nums[io] == target) {
                return io;
            }else return -1;
        }else{
            int k = (io+n)/2;
            if(nums[k] == target){
                return buscarFinal(nums,target,k,n);
            }else if (nums[k] > target){
                return buscarFinal(nums,target,io,k);
            }else  return buscarFinal(nums,target,k,n);
        }
    }
}
