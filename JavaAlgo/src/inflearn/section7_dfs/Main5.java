package inflearn.section7_dfs;
// 부분 집합 구하기
// 있다. 없다로 구분하기 (가지치기)
// 필요한 개수 +1 만큼 배열로 만들고 값 넣기


import java.util.*;

public class Main5 {

    // static 전역변수
    static int n;
    static int arr[];

    public void dfs(int k) {
        // 종료
        if (k==n+1) {
            // 출력
            String temp="";
            for (int i=1;i<=n;i++) {
                // 1인것만 temp에 넣는다.
                if (arr[i]==1) {
                    temp+=i+" ";
                }
            }

            // 공집합은 제외
            if (temp.length()>0) {
                System.out.println(temp);
            }
        }
        else {
            // 있다.
            arr[k]=1;
            dfs(k+1);
            // 없다.
            arr[k]=0;
            dfs(k+1);
        }

    }

    public void solution() {

        dfs(1);

    }


    public static void main(String[] args) {
        Main5 main=new Main5();
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        arr=new int[n+1];

        main.solution();


    }
}
