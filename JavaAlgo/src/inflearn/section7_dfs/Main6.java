package inflearn.section7_dfs;

import java.util.*;

class Node {
    int data;
    Node lt,rt;

    public Node(int val) {
        data=val;
        lt=rt=null;
    }

}


public class Main6 {
    Node root;

    public void dfs(Node root) {
        if (root==null) return; // 종료조건
        else {
            // 전위 순회 - 먼저 중간에 있는거 출력하고 왼쪽부터 끝까지 재귀로 호출한다음에 null 값이면 스택에서 pop
            System.out.println(root.data);
            dfs(root.lt);
            dfs(root.rt);

            // 중위 순회 - 왼쪽부터 쭉 들어가다가 null이면 종료하고 데이터 출력 후
//            dfs(root.lt);
//            System.out.println(root.data);
//            dfs(root.rt);
//
//            // 후위 순회
//            dfs(root.lt);
//            dfs(root.rt);
//            System.out.println(root.data);

        }


    }




    public static void main(String[] args) {
        Main6 main=new Main6();

        main.root=new Node(1);
        main.root.lt=new Node(2);
        main.root.rt=new Node(3);
        main.root.lt.lt=new Node(4);
        main.root.lt.rt=new Node(5);
        main.root.rt.lt=new Node(6);
        main.root.rt.rt=new Node(7);

        Scanner scan=new Scanner(System.in);

    }
}