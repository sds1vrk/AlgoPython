package inflearn.section8_dfs활용문제;
import java.util.*;
public class 미로탐색하기BFS {
    static int ck[][]; // 굳이 필요할까?! 필요하네, 이유는 더이상 못가기 위해서 갔던길을
    static int arr[][];
    static int n;
    static int answer=0;

    static int dx[]={0,1,0,-1};
    static int dy[]={1,0,-1,0};

    // dis 추가
    static int dis[][];

    class Point {
        int x;
        int y;

        Point(int x,int y) {
            this.x=x;
            this.y=y;
        }
    }

    public void bfs(int x,int y) {

        Queue<Point> queue=new LinkedList<>();
        Point point=new Point(x,y);
        queue.add(point);


        while(!queue.isEmpty()) {
            int size= queue.size();
            // 큐사이즈 만큼 돌음
            for (int i=0;i<size;i++) {
                Point pq=queue.poll();
                int xx=pq.x;
                int yy=pq.y;
                for (int j=0;j<4;j++) {
                    int nx=xx+dx[j];
                    int ny=yy+dy[j];

                    if (nx>=0 && nx<=6 && ny>=0 && ny<=6 && arr[nx][ny]==0) {
                        if (ck[nx][ny]==0) { // 이것때문에 큐에 더 못더함
                            ck[nx][ny]=1;
                            Point pp=new Point(nx,ny);
                            queue.add(pp);
                            dis[nx][ny]=dis[xx][yy]+1;
                        }

                    }


                }
            }
//            answer++;
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
        dis=new int[7][7];


        ck[0][0]=1;
        미로탐색하기BFS m1=new 미로탐색하기BFS();
        m1.bfs(0,0);
//        System.out.println(answer);


        for (int i=0;i<7;i++) {
            for (int j=0;j<7;j++) {
//                dis[i][j];
                System.out.print(dis[i][j]+" ");

            }
            System.out.println();
        }




    }

}
