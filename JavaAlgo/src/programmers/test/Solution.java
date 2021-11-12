package programmers.test;

import java.util.*;
class Solution {
    static int size=0;
    static int ck[][];
    static int dx[]={0,1};
    static int dy[]={1,0};
    // static int board[][];
    static int dis[][];
    static int answer=0;

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int board1[][]=new int[5][5];

        for (int i=0;i<5;i++) {
            for (int j=0;j<5;j++) {
                board1[i][j]=scan.nextInt();
            }
        }

        solution(board1);

    }

    public static void dfs(int x,int y,int board[][]) {

        if (x==size-1 && y==size-1) {
            //종료
            System.out.println("asdf"+dis[size-1][size-1]);
            if (answer<dis[size-1][size-1]) {
                answer=dis[size-1][size-1];
            }
        }

        for (int i=0;i<2;i++) {
            int nx=x+dx[i];
            int ny=y+dy[i];

            if (nx>=0 && nx<size && ny>=0 && ny<size) {
                if (ck[nx][ny]==0) {
                    ck[nx][ny]=1;

                     for (int a=0;a<size;a++) {
                         for (int j=0;j<size;j++) {
                             System.out.print(board[a][j]+" ");
                         }
                         System.out.println();
                     }

                     if (board[nx][ny]==0) {
                         dis[nx][ny]=dis[x][y]*-1;
                         dfs(nx,ny,board);
                         ck[nx][ny]=0;

                         dis[nx][ny]=dis[x][y]*1;
                         dfs(nx,ny,board);
                         ck[nx][ny]=0;

                     }
                     else {

                    dis[nx][ny]=dis[x][y]+board[nx][ny];
                    dfs(nx,ny,board);
                    ck[nx][ny]=0;
                     }
                }

            }
        }

    }

    public static int solution(int[][] board) {
        // this.board=board;
        size=board.length;
        System.out.println("size"+size);
        ck=new int[size][size];

        dis=new int[size][size];

        ck[0][0]=1;
        dis[0][0]=board[0][0];
        dfs(0,0,board);




        System.out.println(answer);
        return answer;
    }
}