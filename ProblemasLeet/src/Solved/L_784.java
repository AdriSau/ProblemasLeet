package Solved;

import java.util.LinkedList;
import java.util.List;

public class L_784 {
    public List<String> letterCasePermutation(String s) {
        List<String> lista = new LinkedList<>();
        if (s.isEmpty() || s.isBlank()){
            return lista;
        }else{
            aux(s,0,lista);
        }
        return lista;

    }
    private void aux (String s, int pos, List<String> res){
        if (pos >= s.length()){
            res.add(s);
        }else if (s.charAt(pos)>= 48 && s.charAt(pos)<= 57){
            aux(s,pos+1, res);
        }else{
            int c = 1;
            while (c >= 0){
                if (c == 0){
                    StringBuilder mod = new StringBuilder(s);
                    mod.setCharAt(pos,Character.toLowerCase(s.charAt(pos)));
                    aux(mod.toString(),pos+1,res);
                }else{
                    StringBuilder mod = new StringBuilder(s);
                    mod.setCharAt(pos,Character.toUpperCase(s.charAt(pos)));
                    aux(mod.toString(),pos+1,res);
                }
                c--;
            }
        }
    }
}
