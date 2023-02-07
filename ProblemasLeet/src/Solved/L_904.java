package Solved;

public class L_904 {
    public int totalFruit(int[] fruits) {
        int typeA, typeB, indA = 0 , indB = 1;
        int max = Integer.MIN_VALUE, act = 0;
        if(fruits.length == 2){
            return 2;
        }else{
            typeA = fruits[0];
            typeB = fruits[1];
            act = 2;
            for (int i = 2; i < fruits.length; i++) {
                if (fruits[i] == typeA || fruits[i] == typeB){
                    act++;
                }else{
                    for (int j = i-1; j >=0 ; j--) {
                        if (j == i-1){
                            indA = i;
                            typeA = fruits[j];
                            act = 2;
                        } else if (fruits[j] == typeA) {
                            act++;
                        }else{
                            break;
                        }
                    }
                    typeB = fruits[i];
                    indB = i;
                }
                if(act > max){
                    max = act;
                }
            }
        }
        return max;
    }

   /* public static void main(String[] args) {
        L_904 exe = new L_904();
        int[] a = {1,2,1};
        System.out.println(exe.totalFruit(a));

    }*/
}
