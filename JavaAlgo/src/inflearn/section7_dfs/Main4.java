package inflearn.section7_dfs;
// 피보나치 수열
// a(n-2) + a(n-1) = a(n)
//1 1 2 3 5 8 13
import java.util.*;

public class Main4 {

    static int arr[];

    // 첫번쨰는 0임으로 1개를 더한 값을 배열로 만든다.


    public int dfs(int n) {
        // 종료 조건
        if (n==1 || n==2) return 1;
        else {
            return dfs(n-1)+dfs(n-2);
        }
    }

    // 개선된 dfs
    // 이미 나온 값을 배열에 기록하면서, 기록된값은 다시 계산 안하게 하기
    public int dfs2(int n) {
        //
        if (arr[n]!=0) {
            return arr[n];
        }

        // 종료 조건
        if (n==1 || n==2) return arr[n]=1;
        else {
            arr[n]=dfs(n-1)+dfs(n-2);
            return arr[n];
        }
    }



    public int solution(int n) {


        int answer=0;

//        System.out.println(dfs(n));
        // 하나씩 출력
//        for (int i=1;i<=n;i++) {
//            System.out.print(dfs(i)+" ");
//        }

        // 개선된 dfs
        for (int i=1;i<=n;i++) {
            System.out.print(dfs(i)+" ");
        }

        return answer;
    }


    public static void main(String[] args) {
        Main4 main=new Main4();
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        // 배열 개수만큼
        arr=new int[n+1];
        main.solution(n);


    }
}
