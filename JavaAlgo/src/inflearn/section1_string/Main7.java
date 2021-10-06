package inflearn.section1_string;
// 회문 문자열 - 앞에서 읽을때나 뒤에서 읽을때나 같은 문자열
// lt, rt로 인덱스로 비교
// 1. 같으면 lt++, rt--
// 2. 다르면 while 문 answer=NO로 변경후 break

import java.util.*;
public class Main7 {

    public String solution(String str) {
        String answer="YES";

        str=str.toUpperCase();
        char []arr_temp=str.toCharArray();

        int lt=0;
        int rt=arr_temp.length-1;

        while (lt<rt) {
            // 1. 만약 lt rt랑 같으면 둘다 -1
            if (arr_temp[lt]==arr_temp[rt]) {
                lt++;
                rt--;
            }

            // 2. 다르면 break 하고 answer NO로 변경
            else {
                answer="NO";
                break;
            }
        }

        return answer;

    }


    public static void main(String[] args) {
        Main7 main =new Main7();
        Scanner scan=new Scanner(System.in);

        System.out.println(main.solution(scan.next()));
    }
}
