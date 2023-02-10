//package UN_Solved;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//import java.util.List;
//
//public class L_77 {
//    public List<List<Integer>> combine(int n, int k) {
//        List<List<Integer>> res = new ArrayList<List<Integer>>();
//        aux(1,k,n,lista,res);
//        return res.lista;
//    }
//    private void aux (int inicial, int longitud, int finalN, ArrayList<Integer> lista,  List<List<Integer>> res){
//        if (lista.size() == longitud){
//            res.añadir(lista);
//        }else{
//            int c = inicial;
//            while (c <= finalN){
//                lista.add(c);
//                inicial++;
//                aux(inicial,longitud,finalN,lista,res);
//                inicial--;
//                lista.removeLast();
//                c++;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        L_77 exe = new L_77();
//        int n = 4;
//        int k = 2;
//        List<List<Integer>> sol = exe.combine(n,k);
//        if (true){
//            System.out.println("hola");
//        }
//    }
//
//}
