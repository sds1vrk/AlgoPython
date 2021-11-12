package inflearn.section7_bfs;
// 송아지 찾기 문제 BFS - 레벨 별 탐색


import java.util.*;

public class Main2 {

    // 전역변수
    static int n;
    static int m;
    int arr[]=new int[10001];
    int dx[]={-1,1,5};

    public int solution(int n) {

        Queue<Integer> queue=new LinkedList<>();
        int level=0;
        queue.add(n);
        // 처음 방문 -> 1로 처리 (방문 처리)
        arr[n]=1;

        while (!queue.isEmpty()) {

            int size=queue.size();
            for (int i=0;i<size;i++) {

                int k=queue.poll();
//                arr[k]=1; // 처음 갑

                if (k==m) {
                    return level;
                }
                else {
                    for (int j=0;j<dx.length;j++) {
                        int nx=k+dx[j];
                        // 큐에 넣기
                        if (nx>=1 && nx<=10000  && arr[nx]==0) { // 방문하지 않았으면
                            arr[nx]=1; // 넣고 방문 처리
                            queue.add(nx);
                        }
                    }
                }
            }
            level++;
        }


        int answer=0;
        return answer;

    }


    public static void main(String[] args) {
        Main2 main=new Main2();
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();
        System.out.println(main.solution(n));



    }
}
