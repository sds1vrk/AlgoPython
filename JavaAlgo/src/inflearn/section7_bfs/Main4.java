package inflearn.section7_bfs;
import java.util.*;
class Node4 {
    Node4 lt;
    Node4 rt;
    int val=0;

    Node4(int val) {
        lt=rt=null;
        this.val=val;
    }
}


public class Main4 {
    Node4 node4;

    public int bfs(int l,Node4 node4) {
        Queue<Node4> queue=new LinkedList<>();
        queue.add(node4);

        while(!queue.isEmpty()) {
            int size=queue.size();
            for (int i=0;i<size;i++) {
                Node4 node=queue.poll();

                // 말단 노드
                if (node.lt==null && node.rt==null) {
                    return l;
                }
                queue.add(node4.lt);
                queue.add(node4.rt);
            }
            l++;
        }

        return 1;
    }


    public static void main(String[] args) {
        Main4 main4 =new Main4();
        main4.node4=new Node4(1);
        main4.node4.lt=new Node4(2);
        main4.node4.rt=new Node4(3);

        main4.node4.lt.lt=new Node4(4);
        main4.node4.lt.rt=new Node4(5);

        int l=0;
        System.out.println(main4.bfs(l,main4.node4));

    }

}
