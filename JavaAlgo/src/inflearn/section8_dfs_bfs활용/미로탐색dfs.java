package inflearn.section8_dfs_bfs활용;
import java.util.*;
// 처음생각은 ck배열에 1로 해줬음
// 방문 노드를 갔으면 1로처리

// 2가지 방법이 있음
// 1. check 방문한 배열을 만들어서 체크하는 방법
// 2. map에 직접 방문할 경우 1로 만들고 풀 경우 0으로 만드는 경우


public class 미로탐색dfs {

    static int arr[][];
    static int ck[][];
    static int answer=0;

    static int dx[]={0,1,0,-1};
    static int dy[]={1,0,-1,0};

    void dfs(int x,int y) {

//        if (x<0 || y<0 || x>6 || y>6) {
//            return;
//        }

        if (x==6 && y==6) {
            // 종료
            answer++;
        }
        else {
            for (int i=0;i<4;i++) {
                int nx=x+dx[i];
                int ny=y+dy[i];


                if (nx>=0 && nx<=6 && ny>=0 && ny<=6) {
                    if (arr[nx][ny]==0 && ck[nx][ny]==0) { //이 부분이 틀렸었음. arr[nx][ny]가 0인 경우에 그리고 방문하지 않는 경우에라는 조건 추가
                        // 기존에는 if (ck[nx][ny]==0) 이렇게만 있으니 문제가 발생
                        ck[nx][ny]=1;
                        dfs(nx,ny);
                        ck[nx][ny]=0;
                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        arr=new int[7][7];
        ck=new int[7][7];
        for (int i=0;i<7;i++) {
            for (int j=0;j<7;j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        for (int i=0;i<7;i++) {
            for (int j=0;j<7;j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        미로탐색dfs m1=new 미로탐색dfs();
//        ck[0][0]=1; //여기서 해줘서 더이상 못돌아옴... -> 돌아올 필요가 없지, 아래로 가면되는데!

        ck[0][0]=1;
        m1.dfs(0,0);
        System.out.println(answer);



    }
}
