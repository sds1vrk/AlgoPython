package inflearn.section2_array;

import java.util.*;

public class Main10 {

    public int solution(int n,int [][]arr) {
        int answer=0;

        // 상하좌우 살피기 // 1부터 n까지
        int dx[]={-1,0,1,0};
        int dy[]={0,-1,0,1};

        ArrayList<Integer>arrayList=new ArrayList<>();

        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n;j++) {
                int temp=arr[i][j];

                // 4방향 탐색
                boolean check=true;
//                System.out.println("temp"+temp);
                for (int k=0;k<4;k++) {
//                    System.out.println("dx,dy"+dx[k]+" "+dy[k]);
//                    System.out.println("kk"+arr[i+dx[k]][j+dy[k]]);
                    int aa=arr[i+dx[k]][j+dy[k]];
                    if (temp<=aa) { // temp보다 크거나 같다면 봉우리 아님 (역으로 생각해야됨)
                        // 문제가 temp가 상하좌우보다 크다면 봉우리, 시간 줄이기 위해 반대로 생각 : temp보다 크거나 같다면 봉우리가 아님
//                        System.out.println("aa:"+aa+"temp:"+temp);
                        check=false;
                        break;
                    }
                }
//                System.out.println(" ");
                if (check) {
                    answer+=1;
                    arrayList.add(temp);
                }

            }
        }
//        System.out.println(answer);

//        System.out.println(arrayList.toString());



        return answer;

    }


    public static void main(String[] args) {
        Main10 main=new Main10();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        // n+2로 한 이유?!
        // n이 5면 -> new int[5][5] -> 25개?! // 전체 개수는 7*7 =49개
        // 이유는 위 행 아래행 추가되었기 때문에
        int arr[][]=new int[n+2][n+2];

//        System.out.println("arr SIZE"+arr.length);



        for (int i=1;i<=n;i++) {
            for (int j=1;j<=n;j++) {
                arr[i][j]=scan.nextInt();
            }
        }

        for (int i=0;i<=n+1;i++) {
            for (int j=0;j<=n+1;j++) {
//                System.out.print(arr[i][j]);
            }
//            System.out.println();
        }


        System.out.println(main.solution(n,arr));
    }
}
