package inflearn.section3_twoPointer;

// 연속 부분 수열
// while 1개로 끝남
// 이슈는 k를 초기화 시켜야 됨
// 합친 값이 m보다 크거나 같으면 무조건 k는 0으로 초기화

import java.util.*;

public class Main4 {

    public int solution(int n,int m, int arr[]) {
        int answer=0;

        int lt=0;
        int rt=0;
        int k=0;
        while (lt<n && rt<n) {

            k+=arr[rt];

            if (k<m) {
                rt++;
            }
            else if (k==m) { // 같으면 답 증가, lt를 1증가, rt와 lt위치를 같게 하고 k값은 0으로 초기화
                answer+=1;
                lt++;
                rt=lt;
                k=0;
            }

            // 너무 크면 k를 lt의 위치를 한칸 이동 후 초기화, rt
            else {
                k=0;
                lt++;
                rt=lt;
            }
        }


        return answer;

    }


    public static void main(String[] args) {
        Main4 main=new Main4();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();

        int arr[]=new int[n];

        for (int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }

        System.out.println(main.solution(n,m,arr));




    }
}
