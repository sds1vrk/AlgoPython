// 소수 구하기 (에라토스테네스 체) 1~N까지의 소수 개수 구하기
// 에라토스테네스

package inflearn.section2_array;
import java.util.*;

public class Main5 {

    public int solution(int num) {
        int answer=0;

        int []ch=new int[num+1];


        for (int i=2;i<=num;i++) {
            if (ch[i]==0) {
                answer++; // 소수

                // 소수확인
//                System.out.print(i+" ");

                // 나머지는 1로 변경하기
                for (int j=i;j<=num;j=j+i) {
                    ch[j]=1;
                }
            }
        }



        return answer;

    }


    public static void main(String[] args) {
        Main5 main=new Main5();
        Scanner scan=new Scanner(System.in);

        System.out.println(main.solution(scan.nextInt()));
    }
}
