package inflearn.section7_dfs;
import java.util.*;

public class Main3 {

    public int dfs(int n) {

        if (n==1) return 1;

        else {
            return n*dfs(n-1);
        }


    }

    public int solution(int n) {
        int answer=0;

        dfs(n);
        // 최종적으로 dfs(5)를 return 받는다.
        //              5*dfs(4)
//                            4*dfs(3)
//                                    3*dfs(2)
//                                            2*dfs(1)



        return answer;

    }


    public static void main(String[] args) {
        Main3 main=new Main3();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        main.solution(n);

    }
}
