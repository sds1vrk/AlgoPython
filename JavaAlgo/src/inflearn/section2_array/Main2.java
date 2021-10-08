// 보이는 학생

package inflearn.section2_array;

import java.util.*;

public class Main2 {

    public int solution(int num, String []str) {


        int value=0;

        int answer=0;

        // for문 돌면서 큰거 있으면 answer+=1 증가하고 기준 값 (value)를 인덱스로 변경
        for (int i=0;i<str.length;i++) {

            if (Integer.parseInt(str[i])>value) {
                answer++;
                value=Integer.parseInt(str[i]);
            }

        }



        return answer;

    }


    public static void main(String[] args) {
        Main2 main=new Main2();
        Scanner scan=new Scanner(System.in);

        int num=scan.nextInt();
        scan.nextLine();
        String str[]=scan.nextLine().split(" ");


        System.out.println(main.solution(num,str));
    }
}
