package UN_Solved;

import Auxiliar.Node;

import java.util.HashMap;
import java.util.LinkedList;

//true im left
//false im right
public class L_116 {
    public Node connect(Node root) {
        if (root == null || root.left == null){
            return root;
        }else{
            Node sol = root;
            int selected = 1;
            LinkedList <Node> lista = new LinkedList<>();
            int pos = 1;
            root.next = null;
            lista.add(root);
            lista.add(root.left);
            lista.add(root.right);
            Node aux;
            while (pos < lista.size()){
                aux = lista.get(pos);
                if (aux.left != null){
                    lista.add(aux.left);
                    lista.add(aux.right);
                }
                if (pos == selected-1 || pos == lista.size()-1){
                    lista.get(pos).next = null;
                    selected = selected + (selected * 2);
                }else  lista.get(pos).next = lista.get(pos+1);

                pos++;
            }
            return sol;
        }


    }

//    public static void main(String[] args) {
//        L_116 exe = new L_116();
//        Node root = new Node(1);
//        Node dos = new Node(2);
//        Node tres = new Node(3);
//        root.setLeft(dos);
//        root.setRight(tres);
//        Node cuatro = new Node(4);
//        Node cinco = new Node(5);
//        dos.setLeft(cuatro);
//        dos.setRight(cinco);
//        Node seis = new Node(6);
//        Node siete = new Node(7);
//        tres.setLeft(seis);
//        tres.setRight(siete);
//        exe.connect(root);
//    }
}
