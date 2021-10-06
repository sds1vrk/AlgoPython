// 암호 문제

package inflearn.section1_string;
import java.util.*;

public class Main12 {

    public String solution(int num, String str) {

//        1. '#', '*'를 1 or 0으로 변경
        char []temp=str.toCharArray();
        for (int i=0;i<temp.length;i++) {
            if (temp[i]=='#') {
                temp[i]='1';
            }
            else {
                temp[i]='0';
            }
        }

        // 출력
//        System.out.println(Arrays.toString(temp));
        String answer="";
//        2. 7개씩 문자 자르고 ss에 저장 ex) 1000011
        for (int i=0;i<num;i++) {
            String ss="";

            for (int j=0;j<7;j++) {
                ss+=temp[7*i+j];
            }
//            System.out.println("ss:"+ss);


            //3. ss를 2진법으로 변경하고 answer에 (char)로 저장
            // String -> 다시 배열로 변환
            char ans[]=ss.toCharArray();
            // String -> 2진수로 변환
            int value=0;
            int multi=6;
            for (int k=0;k<=6;k++) {
                int b=(int)Math.pow(2,multi);
                // char -> Int로 변환
               int val=Character.getNumericValue(ans[k]);
               // 출력
                value+=b*val;
                multi--;
            }

            answer+=(char)value;
        }

        return answer;

    }


    public static void main(String[] args) {
        Main12 main =new Main12();
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        String str=scan.next();

        System.out.println(main.solution(num,str));
    }
}
