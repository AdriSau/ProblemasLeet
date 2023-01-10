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
}
