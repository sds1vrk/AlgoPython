package inflearn.section8_dfs활용문제;
import java.util.*;
public class 토마토 {
    static int n;
    static int m;
    static int arr[][];
    static int dis[][];
    static Queue<Point>queue;

    static int dx[]={0,1,0,-1};
    static int dy[]={1,0,-1,0};


    static class Point {
        int x;
        int y;

        Point(int x,int y) {
            this.x=x;
            this.y=y;
        }

    }

    void bfs() {
        // 토마토 진행하기
        // 큐에 이미 담아있음


        while (!queue.isEmpty()) {
            int size= queue.size();

            for (int i=0;i<size;i++) {

                // 큐 한개 꺼냄
                Point k=queue.poll();

                for (int j=0;j<4;j++) {
                    int nx=k.x+dx[j];
                    int ny=k.y+dy[j];

                    // m이 행 4 n이 열 6
//                    System.out.println("nx:"+nx);
//                    System.out.println("ny"+ny);
                    if (nx>=0 && nx<n && ny>=0 && ny<m) {
                        if (arr[nx][ny]==0) {
                            // DIS에 일수 기록하기
                            if (dis[nx][ny]>=0) { // -1을 제외하기 위해서
                                dis[nx][ny]=dis[k.x][k.y]+1;
                            }

                            // 갔던곳은 1로 처리
                            arr[nx][ny]=1;
                            Point p=new Point(nx,ny);
                            queue.add(p); // queue에 신 좌표 넣기

                        }
                    }
                }
            }

        }



    }


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        m=scan.nextInt();
        n=scan.nextInt();
        arr=new int[n][m];

        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                arr[i][j]=scan.nextInt();
            }
        }

        queue=new LinkedList<>();
        // DIS 초기값 세팅하기
        dis=new int[n][m];
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (arr[i][j]==-1 || arr[i][j]==1) {
                    dis[i][j]=arr[i][j];
                }
            }
        }
        // 다 익은 토마토인지 미리 검사하기
        boolean check=false;
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                if (arr[i][j]==0) {
                    check=true;
                }
            }
        }

        // 다 안익은 토마토가 있다.
        if (!check) {
            System.out.println(1);
        }
        else {

            // 큐에 익은 토마토 넣기
            for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
                    if (arr[i][j]==1) {
                        Point point=new Point(i,j);
                        queue.add(point);
                    }
                }
            }

            // BFS진행하기
            토마토 m1=new 토마토();
            m1.bfs();
            // 익지못한 토마토가 존재한다. -> -1 return
            boolean check2=false;
            int maxValue=Integer.MIN_VALUE;
            for (int i=0;i<n;i++) {
                for (int j=0;j<m;j++) {
//                    System.out.print(dis[i][j]+" ");
                    if (dis[i][j]==0) {
                        check2=true;
                    }
                    if (dis[i][j]>=1) {
                        if (maxValue<dis[i][j]) {
                            maxValue=dis[i][j];
                        }
                    }

                }
            }
            if (check2) {
                System.out.println(-1);
            }
            else {
                System.out.println(maxValue-1);
            }


        }






    }
}
