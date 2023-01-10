package Solved;

public class L_167 {
    public int[] twoSum(int[] numbers, int target){
        int i = 0, comp;
        while( i < numbers.length){
            comp = findComp(numbers,target-numbers[i],i+1,numbers.length-1);
            if (comp != Integer.MIN_VALUE && numbers[comp] + numbers[i] == target){
                return new int[] {i+1,comp+1};
            }
            i++;
        }
        return new int[2];
    }
    private int findComp(int[] numbers, int subTarget, int io, int n){
        if (io >= numbers.length){
            return Integer.MIN_VALUE;
        }else if (io == n){
            if (numbers[io] == subTarget){
                return io;
            }else return Integer.MIN_VALUE;
        }else if (io + 1 == n){
            if (numbers[io] == subTarget){
                return io;
            }else if(numbers[n] == subTarget){
                return n;
            }else return Integer.MIN_VALUE;
        }else{
            int k = (io+n) / 2;
            if (numbers[k] == subTarget){
                return k;
            }else if (numbers[k] > subTarget){
                return findComp(numbers,subTarget,io,k);
            }else return findComp(numbers,subTarget,k,n);
        }
    }
}
