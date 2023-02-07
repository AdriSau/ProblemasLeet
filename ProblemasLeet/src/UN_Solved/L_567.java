/*package UN_Solved;

import java.util.HashMap;

*//*public class L_567 {
    public boolean checkInclusion(String s1, String s2) {
        HashMap <Character, Integer> map = new HashMap<>();
        inicializador(s1,map);
        int act = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (map.containsValue(s2.charAt(i))){
                if (map.get(s2.charAt(i)) == 0){
                    //
                }else{
                    map.replace(s2.charAt(i), map.get(s2.charAt(i)), map.get(s2.charAt(i))-1);
                    act++;
                }
                if(act == s1.length()){
                    return true;
                }
            }else{
                act =0;
                inicializador(s1,map);
            }
        }

    }
    private void inicializador (String s1, HashMap <Character, Integer> map){
        for (int i = 0; i < s1.length(); i++) {
            if (map.containsKey(s1.charAt(i))){
                map.replace(s1.charAt(i), map.get(s1.charAt(i)),map.get(s1.charAt(i))+1);
            }else map.put(s1.charAt(i), 1);
        }
    }
}
*/