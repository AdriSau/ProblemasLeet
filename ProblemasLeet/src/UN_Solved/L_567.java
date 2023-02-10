/*package UN_Solved;

import java.util.HashMap;

*//*public class L_567 {
    public boolean checkInclusion(String s1, String s2) {
        HashMap <Character, Integer> map;
        map = inicializador(s1);
        int act = 0;
        boolean mapIsUsed = false;
        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey(s2.charAt(i))){
                if (map.get(s2.charAt(i)) == 0){
                    mapIsUsed = true;
                    act = 0;
                    map = reconstruct(s2,i,s2.charAt(i),s1,act);
                }else{
                    mapIsUsed = true;
                    map.replace(s2.charAt(i), map.get(s2.charAt(i)), map.get(s2.charAt(i))-1);
                    act++;
                }
                if(act >= s1.length()){
                    return true;
                }
            }else{
                act = 0;
                if (mapIsUsed){
                    map = inicializador(s1);
                }
                mapIsUsed = false;
            }
        }
<<<<<<< Updated upstream

=======
        return false;
>>>>>>> Stashed changes
    }
    private HashMap <Character, Integer>  inicializador (String s1){
        HashMap <Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))){
                map.replace(s1.charAt(i), map.get(s1.charAt(i)),map.get(s1.charAt(i))+1);
            }else map.put(s1.charAt(i), 1);
        }
        return map;
    }
    private HashMap <Character, Integer> reconstruct(String s2, int posIm, char rep, String s1, int act){
        HashMap <Character, Integer> map = inicializador(s1);
        map.replace(s2.charAt(posIm), map.get(s2.charAt(posIm)), map.get(s2.charAt(posIm))-1);
        act++;
        for (int i = posIm-1; i >= 0 ; i--) {
            if (s2.charAt(i) == rep && map.get(s2.charAt(i)) == 0){
                break;
            }else if(map.containsKey(s2.charAt(i)) && map.get(s2.charAt(i)) != 0){
              act++;
              map.replace(s2.charAt(i), map.get(s2.charAt(i)), map.get(s2.charAt(i))-1);
            }else break;
        }
        return map;
    }

    public static void main(String[] args) {
       L_567 exe = new L_567();
        String  s1 = "adc";
        String s2 = "dcda";
        System.out.println(exe.checkInclusion(s1,s2));

    }
}
*/