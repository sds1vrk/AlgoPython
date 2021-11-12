package inflearn.section8_dfs_bfs활용;
import java.util.*;
// 컴비네이션 구하기
// nCr=n-1Cr-1 + n-1Cr
// 5C3=4C2+4C3 ==> 어떻게 이해하냐면 {1,2,3,4,5}가 있을때 5번이 들어간다 안들어간다로 생각
// 5번이 들어가면 4명중에 2명을 뽑는 경우 + 5번이 안들어가면 4명중에 3명을 뽄는경우의 수와 같다.


// dfs + 메모제이션 이용
// 메모제이션은 2차원 배열로 만들어서 사용 -> 이유는 2행 3열은 2C3을 기록

public class 조합의경우의수 {
    static int n;
    static int m;
    static int arr[][];

    int dfs(int n,int r) {

        // 종료 조건
        if (arr[n][r]>0) return arr[n][r];
        if (n==r || r==0) return arr[n][r]=1;
        else {
            return arr[n][r]=dfs(n-1,r-1)+dfs(n-1,r);
        }

    }


    public static void main(String[] args) {

        // 메모제이션을 최대한 많이 만들어준다.
        arr=new int[10000][10000];

        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();

        조합의경우의수 m1=new 조합의경우의수();
        System.out.println(m1.dfs(n,m));

    }
}
