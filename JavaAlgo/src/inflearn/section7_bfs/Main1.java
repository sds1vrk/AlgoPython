package inflearn.section7_bfs;

import java.util.*;

class Node {
    Node lt,rt;
    int data;


    Node(int value) {
        data=value;
        lt=rt=null;
    }

}

public class Main1 {

    Node root;

    public void bfs(Node root) {
        Queue<Node>queue=new LinkedList<>();
        // 값을 넣는다
        queue.add(root);

        int level=0;

        while (!queue.isEmpty()) {
            System.out.print(level+" : ");
            // 큐에서 한개 뽑는다.
//            Node node=queue.poll();
            // 뽑은거 출력
            int size=queue.size();
            for (int i=0;i<size;i++) { // 여기서 주의! 큐에 들어가면서 큐 사이즈가 변하기 때문에 미리 큐 사이즈를 변수(size)에 저장한다.
//                System.out.println("queue_size"+queue.size());
                Node node=queue.poll();
                System.out.print(node.data+" ");

                // 왼쪽 오른쪽 넣기
                if (node.lt!=null)  queue.add(node.lt);
                if (node.rt!=null) queue.add(node.rt);
            }
            System.out.println();
            level++;
        }


    }


    public static void main(String[] args) {
        Main1 main=new Main1();

        // Node 생성
        main.root=new Node(1);
        main.root.lt=new Node(2);
        main.root.rt=new Node(3);
        main.root.lt.lt=new Node(4);
        main.root.lt.rt=new Node(5);

        main.root.rt.lt=new Node(6);
        main.root.rt.rt=new Node(7);

        // 이거 넣을때 주위, main.root를 넣어야 함
        main.bfs(main.root);




    }
}
