// 카카오 크레인 뽑기
package inflearn.section5_stackQueue;

import java.util.*;
public class Main3 {

    public int solution(int n,int[][]arr,int m,int[]mArr) {
        int answer=0;

        Stack<Integer>stack=new Stack<>();


        for (int i:mArr) {
            int k=i-1; // 행을 뽑는다.

            int su=0;
            for (int j=0;j<n;j++) {
                if (arr[j][k]!=0) {
                    su=arr[j][k];
                    arr[j][k]=0;
                    break;
                }
            }

            // 뽑은거 저장
            // stack이 비어잇으면 저장

            if (su!=0) {

                if (stack.isEmpty()) {
                    stack.push(su);
                }
                else {
                    // 비워있지 않고 같으면 pop
                    if (stack.peek().equals(su)) {
                        answer+=2;
                        stack.pop();
                    }else{ // 아니면 그냥 저장
                        stack.push(su);
                    }
                }
            }
        }




        return answer;

    }


    public static void main(String[] args) {
        Main3 main=new Main3();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[][]=new int[n][n];

        // 배열에 넣기
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) { //4 3 2 1 0
                arr[i][j]=scan.nextInt();
            }
        }

        // 확인
//        for (int i=0;i<n;i++) {
//            for (int j=0;j<n;j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

        // 진행 횟수
        int m=scan.nextInt();
        int mArr[]=new int[m];

        for (int i=0;i<m;i++) {
            mArr[i]=scan.nextInt();
        }


        System.out.println(main.solution(n,arr,m,mArr));

    }
}