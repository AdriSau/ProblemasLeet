package Solved;

import java.util.LinkedList;

public class L_3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }
        LinkedList <Character> lista = new LinkedList<>();
        int max = Integer.MIN_VALUE, act = 0, conserv;
        for (int i = 0; i < s.length(); i++) {
            if (!lista.contains(s.charAt(i))){
                act++;
                lista.add(s.charAt(i));

            }else{
                if (lista.indexOf(s.charAt(i)) == act-1){
                    act = 1;
                    lista = new LinkedList<>();
                    lista.add(s.charAt(i));
                }else{
                    conserv = act - 1 - lista.indexOf(s.charAt(i));
                    act = conserv + 1;
                    lista = copia(lista.indexOf(s.charAt(i))+1,lista);
                    lista.add(s.charAt(i));
                }

            }
            if(act > max){
                max = act;
            }
        }
        return max;
    }
    private LinkedList<Character> copia (int desde , LinkedList<Character> listaOriginal){
        LinkedList <Character> list = new LinkedList<>();
        for (int i = desde; i < listaOriginal.size(); i++) {
            list.add(listaOriginal.get(i));
        }
        return list;
    }

    /*public static void main(String[] args) {
        L_3 exe = new L_3();
        System.out.println(exe.lengthOfLongestSubstring("aabaab!bb"));
    }*/
}
