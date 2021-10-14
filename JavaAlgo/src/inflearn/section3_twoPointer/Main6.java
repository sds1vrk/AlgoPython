package inflearn.section3_twoPointer;


import java.util.*;

public class Main6 {

    public int solution(int n,int m, int arr[]) {
        int answer=1;

        int mm=m; // 다시 초기화해서 쓰기 위해 임시 저장

        int lt=0;
        int rt=0;

        // String은 저장값이 누적되기 때문에 StringBuilder 이용
        StringBuilder sb=new StringBuilder();

        while (lt<n && rt<n) {
            int k=arr[rt];
            // int -> String

            if (k==0) {
                // 주어진 m이 남아있으면
                 if (m>0) {
                    k=1;
                    sb.append(Integer.toString(k));
                    m--;
                    rt++;

                } // 주어진 m을 다 써버리면
                else {
                    lt+=1;
                    rt=lt;
                   // sb초기화
                    sb=new StringBuilder();
                    m=mm;
                }
            }
            else { // k==1이면 계속 저장
                rt++;
                sb.append(Integer.toString(k));
            }

            // 길이가 큰지 확인
            if (sb.length()>answer) {
                answer=sb.length();
            }
        }

        System.out.println(answer);

        return answer;

    }


    public static void main(String[] args) {
        Main6 main=new Main6();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();

        int arr[]=new int [n];

        for (int i=0;i<arr.length;i++) {
            arr[i]=scan.nextInt();
        }

        main.solution(n,k,arr);



    }
}
