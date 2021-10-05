package inflearn.section1_string;
// 특정 문자열만 교환

/*
    알고리즘
    while (lt <rt) {

        if (lt==특수문자) lt++;
        else if (rt==특수문자) rt--;
        else -> lt rt 교환 , lt++ rt --
    }

 */

import java.util.Scanner;
import java.util.*;



public class Main5 {

    public String solution(String str) {

        String answer="";
        // String -> 인덱스 접근, 배열로 만들기
        char []temp=str.toCharArray();
        // 문자열을 비교하고 만약
        int lt =0;
        int rt=temp.length-1;

        while (lt<rt) {

            if (!Character.isAlphabetic(temp[lt]))  {
                lt++;
            }
            else if (!Character.isAlphabetic(temp[rt])) {
                rt--;
            }
            else {
                // 스왑
                char tmp=temp[lt];
                temp[lt]=temp[rt];
                temp[rt]=tmp;

                lt++;
                rt--;
            }
        }
        // char[] -> string으로 변환
        answer=String.valueOf(temp);
        return answer;
    }

    public static void main(String[] args) {
        Main5 main =new Main5();
        Scanner scan=new Scanner(System.in);
        System.out.println(main.solution(scan.next()));
    }
}
