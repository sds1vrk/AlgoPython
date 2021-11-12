package inflearn.section7_dfs;

// dfs로 최단 거리 찾기

class Node2 {
    Node2 lt;
    Node2 rt;
    int val;

    Node2(int val) {
        lt=rt=null;
        this.val=val;
    }

}

public class Main7 {
    Node2 root;
    public int dfs(int L,Node2 node2) {


        // DFS는 종료 조건 잘 명시하면된다.
        if (node2.lt==null && node2.rt==null) return L; // 말단노드까지 갔다가 더이상 갈곳이 없으므로 L return
        else {
            return Math.min(dfs(L+1,node2.lt),dfs(L+1,node2.rt)); // 왼쪽 오른쪽 탐색중에 제일 작은것을 선택하면 됨
        }
    }

    public static void main(String[] args) {
        Main7 main7=new Main7();
        main7.root=new Node2(1);
        main7.root.lt=new Node2(2);
        main7.root.rt=new Node2(3);
        main7.root.lt.lt=new Node2(4);
        main7.root.lt.rt=new Node2(5);
        int level=0;
        System.out.println(main7.dfs(level,main7.root));

    }




}
