package inflearn.section2_array;

import java.util.*;

public class Main9 {

    public int solution(int n,int num[][]) {
        int answer=0;

        // 행 합 구하기
        for (int i=0;i<n;i++) {
            int hap=0;
            for (int j=0;j<n;j++) {
                hap+=num[i][j];
            }
            if (answer<hap) {
                answer=hap;
            }
        }
        System.out.println("answer:"+answer);

        // 열 합 구하기
        for (int i=0;i<n;i++) {
            int hap=0;
            for (int j=0;j<n;j++) {
                hap+=num[j][i];
            }
            if (answer<hap) {
                answer=hap;
            }
        }

        System.out.println("answer:"+answer);



        return answer;

    }


    public static void main(String[] args) {
        Main9 main=new Main9();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int [][]number=new int[n][n];


        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                number[i][j]=scan.nextInt();
            }
        }


        System.out.println("출력");
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(main.solution(n,number));
    }
}
