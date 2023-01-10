package UN_Solved;

import Auxiliar.ListNode;

import java.util.LinkedList;
import java.util.List;
//https://leetcode.com/problems/add-two-numbers/
public class L_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int sum1 = 0, sum2 = 0;
        LinkedList<Integer> lis1 = new LinkedList<>();
        LinkedList<Integer> lis2 = new LinkedList<>();
        lis1.add(l1.val);
        lis2.add(l2.val);
        while(l1.next != null || l2.next != null ){
            if (l1.next != null){
                l1 =l1.next;
                lis1.add(l1.val);
            }
            if (l2.next != null){
                l2 =l2.next;
                lis2.add(l2.val);
            }

        }
        System.out.println("longitud de 1 es: " + lis1.size());
        System.out.println("longitud de 2 es: " + lis2.size());

        for (int i = 0; i < Math.max(lis1.size(),lis2.size()); i++) {
            if (i < lis1.size()-1){
                sum1 += (lis1.get(i) * Math.pow(10,(lis1.size()-i-1)));
            }else if(i < lis1.size()){
                sum1 += lis1.get(i);
            }
            if (i < lis2.size()-1){
                sum2 += (lis2.get(i) * Math.pow(10,(lis2.size()-i-1)));
            }else if(i < lis2.size()){
                sum2 += lis2.get(i);
            }
        }
        sum1+=sum2;
        String temp = Integer.toString(sum1);
        ListNode prev = new ListNode(temp.charAt(temp.length()-1) - '0', null);
        ListNode sol = prev;
        for (int i = temp.length()-2; i >= 0 ; i--) {
            ListNode nuevo = new ListNode( temp.charAt(i) - '0', null);
            prev.next = nuevo;
            prev = nuevo;
        }
        return sol;
       // temp.charAt(i) - '0'
    }

//    public static void main(String[] args) {
//        L_2 exe = new L_2();
//
//
//    }
}
