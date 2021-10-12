package inflearn.section3_twoPointer;


import java.util.*;

public class Main5 {

    public int solution(int n) {
        int answer=0;
        int lt=1;
        int rt=2;

        int k=lt;
        while (lt<n && rt<n) {
            k+=rt;

            if (k==n) {
                answer+=1;
                lt++;
                k=lt;
                rt=lt+1;
            }

            else if (k<n) {
                rt+=1;
            }
            // 초과되면 lt를 1칸 이동
            else {
                lt++;
                k=lt;
                rt=lt+1;
            }
        }


        return answer;

    }


    public static void main(String[] args) {
        Main5 main=new Main5();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        System.out.println(main.solution(n));

    }
}
