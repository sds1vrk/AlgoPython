package inflearn.section7_dfs;
import java.util.*;
// 재귀함수
// 자연수 N이 입력되면 -> 재귀함수를 이용하여 1~N까지 출력

// 뭐가 먼저 출력되는지 확인하자!

public class Main1 {

    // 재귀함수
    public void dfs(int n) {
        // 종료 조건
        if (n==0) return;
        else {
            // dfs 위치에 따라 -> 출력되는 순서가 다르다.

//            1.  1-2-3-4-5 출력 (출력 후 호출)
//            dfs(n-1);
//            System.out.print(n+" ");

//           2. 5-4-3-2-1 출력  (선 출력 후 호출)
            System.out.println(n+" ");
            dfs(n-1);

            System.out.print(n+" ");
            dfs(n-1);

        }
    }



    public int solution(int n) {
        int answer=0;
        dfs(n);
        return answer;
    }


    public static void main(String[] args) {
        Main1 main=new Main1();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        main.solution(n);

    }
}
