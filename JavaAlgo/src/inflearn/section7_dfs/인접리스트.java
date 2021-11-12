package inflearn.section7_dfs;
// 인접리스트는 Arraylist를 이용

import java.util.*;
public class 인접리스트 {

    static int answer=0;
    static int n=0;
    // arraylist안에 arraylist
    // 연결된 정점을 표현하기 위해
    static ArrayList<ArrayList<Integer>> graph;
    static int[]check;

    public void dfs(int v) {
        if (v==n) {
            // 종료
            answer++;
        }
        else {
            // arraylist에 접근할때는 for each사용
            for (int nv:graph.get(v)) {
                // v번 노드와 연결된것은 nv
                if (check[nv]==0) {
                    check[nv]=1;
                    dfs(nv);
                    check[nv]=0;
                }
            }
        }

    }

    public static void main(String[] args) {
        인접리스트 m1=new 인접리스트();
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int m=scan.nextInt();

        graph=new ArrayList<>();
        //n개의 arraylist 추가
        for (int i=0;i<=n;i++) {
            graph.add(new ArrayList<>());
        }

        for (int i=1;i<=m;i++) {
            int a=scan.nextInt();
            int b=scan.nextInt();
            graph.get(a).add(b); // 1번 arraylist에 연결 정보를 넣는다.
        }
        // 첫번째 방문은 방문처리
        check=new int [n+1];
        check[1]=1;
        m1.dfs(1);
        System.out.println(answer);

    }

}
