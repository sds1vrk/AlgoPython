package fasoo;
import java.util.*;
public class nhn {
    static int n;
    static int arr[][];
    static int ck[][];

    static int dx[]={0,1,0,-1};
    static int dy[]={1,0,-1,0};
    static int answer=0;

    public void dfs(int x,int y) {

        if (arr[x][y]==0) {
            return;
        }
        else {
            for (int i=0;i<4;i++) {
                int nx=x+dx[i];
                int ny=y+dy[i];

                if (nx>=0 && nx<n && ny>=0 && ny<n) {
                    if (arr[nx][ny]==1 && ck[nx][ny]==0) {
                        answer++;
                        ck[nx][ny]=1;
                        dfs(nx,ny);

                    }
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        arr=new int[n][n];
        ck=new int[n][n];

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j]=scan.nextInt();
            }
        }
        nhn m1=new nhn();

        ArrayList<Integer>arrayList=new ArrayList<>();

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {

                answer=0; // 초기값은 0으로 전역변수로 설정
                if (arr[i][j]==1 && ck[i][j]==0)  {  // 1인 경우에만 돌게 만들었음
                    answer++;
                    ck[i][j]=1;
                    m1.dfs(i,j);
//                    if (answer>1) {  // 홀로 떨어져있는 아일랜드도 있기 때문에 이렇게 하면 안되고 ck배열에서 0인경우에만 돌게 만들었음.
                        arrayList.add(answer);
//                        System.out.println(answer);
//                    }
                }
            }
        }

        Collections.sort(arrayList);
        int size= arrayList.size();

        System.out.println(size);
        if (size==0) {
            System.out.println(0);
        }
        else {
            for (int i=0;i< arrayList.size();i++) {
                System.out.print(arrayList.get(i)+" ");
            }
        }






    }
}
