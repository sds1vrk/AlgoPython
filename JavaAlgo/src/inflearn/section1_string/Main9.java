package inflearn.section1_string;

import java.util.*;

public class Main9 {

    public int solution(String str) {

        String ans="";
        // 1. char []로 변경
        char []temp=str.toCharArray();

        // 2. 한글자씩 비교해서 숫자이면 ans에 더해줌
        for (char s:temp) {
            if (Character.isDigit(s)) {
                ans+=s;
            }
        }
        System.out.println("출력:"+ans);

        // 3. answer -> int로 변경  ans(str) -> answer(int)로 변경
        int answer=Integer.parseInt(ans);
        System.out.println("answer:"+answer);

        return answer;

    }


    public static void main(String[] args) {
        Main9 main =new Main9();
        Scanner scan=new Scanner(System.in);

        System.out.println(main.solution(scan.next()));
    }
}
