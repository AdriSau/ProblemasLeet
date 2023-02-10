package UN_Solved;

public class L_278 {
    /*----------------------------------------------Intento 1 -----------------------------------------*/
//    public boolean isBadVersion(int version);
//    public int firstBadVersion(int n) {
//        for (int i = n; i >= 0; i--) {
//            if(!isBadVersion(i)){
//                return i+1;
//            }
//        }
//        return 0;
//    }
    /*----------------------------------------------Intento 2 -----------------------------------------*/
//public class Solution extends VersionControl {
//    public int firstBadVersion(int n) {
//        return aux(0,n+1);
//    }
//    private int aux (int io, int n){
//        if (io == n){
//            return io;
//        }else if (io +1 == n){
//            if (isBadVersion(i)){
//                return io;
//            }else return n;
//        }else{
//            int k = (io + n) / 2;
//            if (isBadVersion(i)){
//                return aux(io,k);
//            }else return  aux(k,n);
//        }
//    }
//}

    public int firstBadVersion(int n) {
        int nn = n;
        int io = 1;
        int k;
        while (io != nn && io + 1  != nn){
            k = (io + nn) / 2;
            if (isBadVersion(k)){
                nn = k;
            }else {
                io = k;
            }

        }
        if (io == nn){
            return io;
        }else{
            if (isBadVersion(io)){
                return io;
            }else return nn;
        }

    }
        public boolean isBadVersion(int selec){
            int malaVer = 4;
            if (selec >= malaVer){
                return true;
            }else return false;
        }

    public static void main(String[] args) {
        L_278 exe = new L_278();
        int n = 5;
        System.out.println(exe.firstBadVersion(n));
    }


}
