package inflearn.section8_dfs활용문제;

import java.util.Scanner;
import java.util.*;
public class 섬나라아일랜드BFS {
    static int arr[][];
    static int n;
    static int dx[]={0,1,0,-1,-1,-1,1,1};
    static int dy[]={1,0,-1,0,-1,1,-1,1};

    class Point {
        int x;
        int y;
        Point(int x,int y) {
            this.x=x;
            this.y=y;
        }
    }

    void bfs(int x,int y) {
        Queue<Point>queue=new LinkedList<>();
        Point point=new Point(x,y);
        queue.add(point);

        while(!queue.isEmpty()) {
            Point k=queue.poll();
            for (int i=0;i<8;i++) {
                int nx=k.x+dx[i];
                int ny=k.y+dy[i];

                if (nx>=0 && nx<n && ny>=0 && ny<n) {
                    if (arr[nx][ny]==1) {
                        arr[nx][ny]=0;
                        Point pp=new Point(nx,ny);
                        queue.add(pp);
                    }
                }
            }
        }


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

        섬나라아일랜드BFS m1 =new 섬나라아일랜드BFS();
        int answer=0;
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                if (arr[i][j]==1) {
                    arr[i][j]=0;
                    answer++; //여기에서 더해주기 떄문에 섬하나 둥둥떠다니느것을 처리못함
                    m1.bfs(i,j);
                }
            }
        }
        System.out.println(answer);

    }

}
