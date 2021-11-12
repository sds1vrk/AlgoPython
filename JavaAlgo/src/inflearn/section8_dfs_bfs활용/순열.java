package inflearn.section8_dfs_bfs활용;
// DFS로 순열구하기
// 순열이란 3P2
// 369
// 3 6
// 3 9
// 6 3
// 6 9
// 9 3
// 9 6

// 총 3개의 배열을 이용
// 문제가 들어가는 arr 배열 arr =new int[3];
// 사용여부를 결정하는 check 배열 check=new int[3];
// 정답을 담는 ans배열  ans=new int[2];

// 중복순열과는 다르게 check 배열이 더 들어간다! (for문에서 더이상 뻗지 못하게 하기 위해)
//

import java.util.*;
public class 순열 {
    static int n;
    static int m;
    static int arr[];

    static int check[];
    static int ans[];

    void dfs(int l) {
        if (l==m) {
            for (int i=0;i<m;i++) {
                System.out.print(ans[i]);
            }
            System.out.println();
        }
        else {
            // dfs for문으로
            for (int i=0;i<n;i++) {

                if (check[i]==0) {
                    check[i]=1; // 사용한것은 1로 처리 -> 다시 사용못하게
                    ans[l]=arr[i]; // 정답에 l이 들어감
                    dfs(l+1);
                    check[i]=0; // 다 사용했으면 0으로 풀어줌
                }

            }


        }


    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();

        arr=new int[n];
        check=new int[n];
        ans =new int[m];

        for (int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }
        순열 m1=new 순열();
        m1.dfs(0);












    }
}
