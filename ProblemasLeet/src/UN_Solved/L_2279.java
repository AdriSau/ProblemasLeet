package UN_Solved;

public class L_2279 {
    //https://leetcode.com/problems/maximum-bags-with-full-capacity-of-rocks/
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int numFullBags = 0;
        int bestCandidateIndex;
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] == rocks[i]){
                numFullBags++;
            }
        }
        while (additionalRocks > 0){
            bestCandidateIndex = optimumCandidate(capacity, rocks);
            if (bestCandidateIndex >= 0 && capacity[bestCandidateIndex] - rocks[bestCandidateIndex] <= additionalRocks){
                numFullBags++;
                additionalRocks-= (capacity[bestCandidateIndex] - rocks[bestCandidateIndex]);
                rocks[bestCandidateIndex] = capacity[bestCandidateIndex];
            }else break;
        }
        return numFullBags;
    }
    private int optimumCandidate (int[] capacity, int[] rocks){
        int indexBest = -1;
        int difBest = Integer.MAX_VALUE;
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] > rocks[i] && capacity[i] - rocks[i] < difBest ){
                difBest = capacity[i] - rocks[i];
                indexBest = i;
            }
        }
        return indexBest;
    }

//    public static void main(String[] args) {
//        L_2279 exe = new L_2279();
//        int[] capacity = {2,3,4,5};
//        int[] rocks = {1,2,4,4};
//        int additionalRocks = 2;
//        System.out.println(exe.maximumBags(capacity,rocks,additionalRocks));
//    }
public static void main(String[] args) {

}
}
