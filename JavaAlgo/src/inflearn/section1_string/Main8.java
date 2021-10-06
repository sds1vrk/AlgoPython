package inflearn.section1_string;

// 유효한 팰린드롬- 앞에서 읽을때나 뒤에서 읽을떄나 같은 문자열
// 입력 -> found7, time: study; Yduts; emit, 7Dnuof -> 알파벳만 비교

import java.util.*;

public class Main8 {

    public String solution(String str) {
        String answer="YES";

        // 1. 대문자로 변경
        str=str.toUpperCase();

        // 2. 특수문자 정규 표현식을 이용해서 제거
        str=str.replaceAll("[^A-Z]","");
//        System.out.println("str:"+str);

        // 3. stringBuilder의 reverse를 이용해서 문자 확인
        StringBuilder sb=new StringBuilder(str).reverse();

        String reverse_sb=sb.toString();

        if (!str.equals(reverse_sb)) {
            answer="NO";
        }


        return answer;

    }


    public static void main(String[] args) {
        Main8 main =new Main8();
        Scanner scan=new Scanner(System.in);

        System.out.println(main.solution(scan.nextLine()));
    }
}
