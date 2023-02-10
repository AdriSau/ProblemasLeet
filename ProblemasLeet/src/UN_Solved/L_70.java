package UN_Solved;

import java.util.List;

public class L_70 {
    public int climbStairs(int n) {
        Entero res = new Entero(0);
        aux(res, n);
        return res.valor;
    }
    private void aux (Entero res, int n){
        if (n == 0){
            res.valor = res.valor+1;
        }else if (n > 0){
            int c = 1;
            while (c >= 0){
                if (c == 0){
                    aux(res,n-1);
                }else{
                    aux(res,n-2);
                }
//                if (c==0){
//                    n++;
//                }else n+=2;
                c--;
            }
        }
    }
    public class Entero{
        int valor;

        public Entero(int valor) {
            this.valor = valor;
        }

    }
}
