package UN_Solved;

public class L_190 {
    public int reverseBits(int n) {
        String lista = Integer.toBinaryString(n);
        for (int i = 0; i < 32-lista.length(); i++) {
           lista = "0" + lista;
        }
        int suma = 0;
        for (int i = 0; i < lista.length() ;i++) {
            if(lista.charAt(i) == '1'){
                suma+=Math.pow(2,lista.length()-1-i);
            }
        }
        return suma;
    }

    public static void main(String[] args) {
        int n = 43261596;
        System.out.println(Integer.toBinaryString(43261596) + "lomngitud" + Integer.toBinaryString(43261596).length() );

    }
}
