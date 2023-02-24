package UN_Solved;

public class L_540 {

        public int singleNonDuplicate(int[] nums) {
            return aux(nums,0, nums.length - 1);

        }
        private int aux(int[] v, int o, int n){
            int res;
            if (o==n){
                res = v[o];
            }else{
                int k = (n+o)/2;
                if ((k % 2==0 )||(k % 2!=0)){
                    if((v[k+1] == v[k])){
                        res = aux(v,o,k-1);
                    }else if(v[k-1] == v[k]){
                        res = aux(v,k+1,n);
                    }else res = v[k];
                }else{
                    if(v[k-1] == v[k]){
                        res = aux(v,k+1,n);
                    }else if(v[k+1] == v[k]){
                        res = aux(v,o,k-1);
                    }else res =v[k];
                }

            }
            return res;
        }

    public static void main(String[] args) {
            L_540 exe = new L_540();
       int [] nums = {1,1,2,3,3,4,4,8,8};
        int n = 2;
        System.out.println(exe.singleNonDuplicate(nums));
    }

}
