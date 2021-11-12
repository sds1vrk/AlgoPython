package inflearn.section7_dfs;
import java.util.*;
public class 인접행렬 {
    static int arr[][];
    static int check[];
    static int answer;

    public void dfs(int node,int n) {

        if (node==n) { // 종료 조건
            answer++;
        }

        // for문은 맞는것 같은데
        else {
            for (int i=1;i<=n;i++) {
                // 도착했으면 종료
                // 종료 조건이 이상한데?!
                if (arr[node][i]==1 && check[i]==0) { // 여기가 틀렸었음, 다음으로 가야 할 노드이기 때문에 check[i]=0으로 해야됨
                    check[i]=1; // 다음으로 가야 할 노드를 방문처리
                    dfs(i,n); // 다음 노드 (노드, 최종 목적지)
                    check[i]=0; // 다 방문 후에는 다시 체크 풀어줌
                }
            }
        }

    }

    public static void main(String[] args) {
        인접행렬 m1=new 인접행렬();

        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt(); //5 (노드)
        int m=scan.nextInt(); //9 (간선)
//        arr[][]=new int[n+1][n+1]; // 각각을 숫자로 표현하기 위해 +1로 증가
        arr=new int[n+1][n+1];
        for (int i=0;i<m;i++) {
            int a=scan.nextInt();
            int b=scan.nextInt();
            arr[a][b]=1;
        }

//        for (int i=1;i<arr.length;i++) {
//            for (int j=1;j<arr.length;j++) {
//                System.out.print(arr[i][j]);
//            }
//            System.out.println();
//        }

        // 방문 리스트는 노드를 적어준다.
        check=new int[n+1];
        answer=0;

        // 첫번째 방문했다고 여기서 미리 해주기
        check[1]=1;
        m1.dfs(1,n);
        System.out.println(answer);




    }

}
