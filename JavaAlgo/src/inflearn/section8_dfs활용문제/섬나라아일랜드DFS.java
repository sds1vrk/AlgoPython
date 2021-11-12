package inflearn.section8_dfs활용문제;

import java.util.*;
public class 섬나라아일랜드DFS {
    static int arr[][];
    static int n;
    static int dx[]={0,1,0,-1,-1,-1,1,1};
    static int dy[]={1,0,-1,0,-1,1,-1,1};

    // static 배열이 과연 안쪽에도 영향을 미칠까?! - static이기 때문에 영향을 미친다.
    // 문제: 섬하나가 둥둥떠다닌것은 어떻게 처리를 해야할까?! -> 내가 문제를 잘못읽음, 대각선까지 포함임
    void dfs(int x,int y) {
        // 더이상 갈곳이 없으면 리턴
//        if (arr[x][y]==0) {
//            return;
//        }
//        else {
            for (int i=0;i<8;i++)  {
                int nx=x+dx[i];
                int ny=y+dy[i];

                if (nx>=0 && nx<n && ny>=0 && ny<n) {
                    if (arr[nx][ny]==1) {
                        arr[nx][ny]=0;
                        dfs(nx,ny);
                    }
                }
            }
//        }




    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        arr=new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        섬나라아일랜드DFS m1=new 섬나라아일랜드DFS();
        int answer=0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (arr[i][j]==1) {
                    arr[i][j]=0;
                    answer++; //여기에서 더해주기 떄문에 섬하나 둥둥떠다니느것을 처리못함
                    m1.dfs(i,j);
//                    System.out.println("선");
                }
            }
        }

        System.out.println(answer);




    }
}
