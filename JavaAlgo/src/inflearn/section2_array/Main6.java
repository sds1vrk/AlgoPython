// 뒤집은 소수
// 뒤집었을때 소수이면 그 소수를 출력
// 단 910을 뒤집으면 19로 숫자화
package inflearn.section2_array;
import java.util.*;

public class Main6 {
    public void isPrime(int num) {
        boolean answer=true;

        if (num==1) {
            answer=false;
        }

        for (int i=2;i<num;i++) {
            if (num%i==0) {
                answer=false;
            }
        }

        if (answer) {
            System.out.print(num+" ");
        }

    }

    public void solution(int num,String arr[]) {


        for (int i=0;i<num;i++) {
            // 뒤집은 숫자
            StringBuilder sb=new StringBuilder(arr[i]).reverse();
            int val=Integer.parseInt(sb.toString());

            isPrime(val);


        }


    }


    public static void main(String[] args) {
        Main6 main=new Main6();
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.nextLine();
        String arr[]=scan.nextLine().split(" ");


        main.solution(num,arr);

    }
}
