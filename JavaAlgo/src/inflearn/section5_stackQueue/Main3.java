// 카카오 크레인 뽑기
package inflearn.section5_stackQueue;

import java.util.*;
public class Main3 {

    public int solution() {
        int answer=0;
        return answer;

    }


    public static void main(String[] args) {
        Main3 main=new Main3();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[][]=new int[n][n];

        // 배열에 넣기
        for (int i=n-1;i>=0;i--) {
            for (int j=0;j<n;j++) { //4 3 2 1 0
                arr[i][j]=scan.nextInt();
            }
        }

        // 확인
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }




    }
}