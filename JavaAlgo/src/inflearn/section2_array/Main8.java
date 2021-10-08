package inflearn.section2_array;

import java.util.*;

public class Main8 {

    public void solution(int n, int []number) {

        // number -> 오름차순 정렬
        Arrays.sort(number,Collections.reverseOrder());



    }


    public static void main(String[] args) {
        Main8 main=new Main8();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int number[]=new int[n];
        for (int i=0;i<n;i++) {
            number[i]=scan.nextInt();
        }

        main.solution(n,number);

    }
}
