package inflearn.section7_dfs;
// 재귀함수로 이진 값 출력

import java.util.Scanner;

public class Main2 {

    public void dfs(int n) {
        // 종료 조건
        if (n==0) return;

        else {
            dfs(n/2);
            System.out.print(n%2+" ");
        }

    }

    public int solution(int n) {

        dfs(n);

        int answer=0;
        return answer;

    }


    public static void main(String[] args) {
        Main2 main=new Main2();
        Scanner scan=new Scanner(System.in);


        int n=scan.nextInt();
        main.solution(n);

    }
}
