package UN_Solved;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class L_47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        HashMap <Integer,Integer> dic = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (dic.containsKey(nums[i])){
                dic.replace(nums[i],dic.get(nums[i])+1);
            }else {
                dic.put(nums[i], 1);
            }
        }
        return permuteUnique(nums,dic,0,new LinkedList<>(), new LinkedList<>());
    }
    private List<List<Integer>> permuteUnique(int[] nums, HashMap <Integer,Integer> dic, int posAct, List <Integer> actual, List<List <Integer>> res){
        if (posAct >= nums.length){
            return res;
        }else{
            LinkedList <Integer> visitados = new LinkedList<>();
            int c = 0;
            boolean entro = false;
            while (c < nums.length){
                entro = false;
                if (dic.get(nums[c]) > 0 && !visitados.contains(nums[c])){
                    actual.add(nums[c]);
                    entro = true;
                    visitados.add(nums[c]);
                    posAct++;
                    dic.replace(nums[c],dic.get(nums[c])-1);
                    res = Stream.concat(res.stream(), permuteUnique(nums,dic,posAct,actual,res).stream()).collect(Collectors.toList());
                }
                c++;
            }
        }

    }
}
