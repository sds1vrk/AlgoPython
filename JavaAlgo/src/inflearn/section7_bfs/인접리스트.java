package inflearn.section7_bfs;
// 인접리스트로 그래프 최단 거리 구하기
// 최단거리를 기록하는 곳은 dis배열을 이용한다
import java.util.*;
public class 인접리스트 {
    static ArrayList<ArrayList<Integer>>graph;
    static int check[];
    static int dis[];
    static int n;

    public void bfs(int node) {
        Queue<Integer>queue=new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            int curr=queue.poll();
            int size=queue.size();
            for (int nx:graph.get(curr)) {
                if (check[nx]==0) {
                    check[nx]=1;
                    queue.add(nx);
                    dis[nx]=dis[curr]+1; // 현재 연결된 거에 +1해주기
//                    check[nx]=0; // 최단거리는 갔던 곳을 또 안가기 때문에 이건 해주지 않는다.
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int m=scan.nextInt();

        graph=new ArrayList<>();
        for (int i=0;i<=n;i++) {
            graph.add(new ArrayList<Integer>());
        }

        for (int i=0;i<m;i++) {
            int a=scan.nextInt();
            int b=scan.nextInt();
            graph.get(a).add(b);
        }

        check=new int[n+1];
        dis=new int[n+1];


        인접리스트 bf=new 인접리스트();
        check[1]=1;
        dis[1]=0;
        bf.bfs(1);

        // 2부터 ~N까지 출력해보기
        for (int i=2;i<=n;i++) {
            System.out.println(i + ":" + dis[i]);
        }
    }
}
