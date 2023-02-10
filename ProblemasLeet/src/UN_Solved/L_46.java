package UN_Solved;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class L_46 {
    public List<List<Integer>> permute(int[] nums) {
        AuxiliarObject total = new AuxiliarObject();
        aux(nums,new LinkedList<>(),total, 0);
        return total.lista;
    }
    private void aux(int[] nums, List <Integer> res ,AuxiliarObject total, int pos){
        if (pos == nums.length){
            total.añadir(res);
        }else{
            boolean entro = false;
            Integer aux;
            int c = nums.length-1;
            while (c >= 0){
                entro = false;
                aux = nums[c];
                if (!res.contains(aux)){
                    res.add(aux);
                    entro = true;
                    pos++;
                    aux(nums,res,total,pos);
                }
                if (entro){
                    res.remove(aux);
                    pos--;
                }
                c--;

            }
        }

    }
    public class AuxiliarObject{
        List<List<Integer>> lista;

        public AuxiliarObject() {
            lista = new LinkedList<>();
        }
        private void añadir (List añadir){
            lista.add(añadir);
        }

    }

//    public static void main(String[] args) {
//        L_46 exe = new L_46();
//        int[] nums = {1,2,3};
//        exe.permute(nums);
//    }
}
