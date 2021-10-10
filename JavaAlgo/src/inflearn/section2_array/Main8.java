package inflearn.section2_array;

import java.util.*;

public class Main8 {

    public void solution(int n, int []number) {

        // number -> 내림차순 정렬 -> 안됨
//        Arrays.sort(number,Collections.reverseOrder());

        int answer[]=new int[number.length];

//        String str="";
        // for문 돌면서 for -> 처음부터 끝까지 검색, 자기보다 크거나 같으면 +1 증가
        for (int i=0;i<number.length;i++) {
            int k=number[i];
            int temp=0;
            for (int j=0;j< number.length;j++) {
                if (k<=number[j]) {
                    temp++;
                }
            }
            answer[i]=temp;
            System.out.print(answer[i]+" ");
        }




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
