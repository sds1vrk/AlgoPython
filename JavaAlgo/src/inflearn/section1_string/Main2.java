// 대소문자로 문자 변경

package inflearn.section1_string;
import java.util.*;

// Character 대 소문자 구분 (boolean) : Character.isLowerCase(c)

/* 아스키 코드
   대문자 : 65~90, 소문자 : 97~122 -> 두개의 차이는 32
   char는 기본적으로 숫자(아스키 코드)로 제공되기 때문에 바로 숫자랑 비교 가능
   하지만 캐스팅은 (char)로 붙여서 캐스팅하기
    for (char c:str.toCharArray()) {
        if (c>=65 && c<=90) {
            answer+=(char)(c+32);
        }
        else {
            answer+=(char)(c-32);
        }
    }

 */

public class Main2 {

    public String solution(String str) {

        String answer="";
        // 방법 1. Character.is대소문자 메소드 사용
        // 만약 소문자 -> 대문자, 대문자 -> 소문자
        for (char c:str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer+=Character.toUpperCase(c);
            }
            else {
                answer+=Character.toLowerCase(c);
            }
        }

        // 방법 2. 아스키 코드 사용
        // 대문자 : 65~90, 소문자 : 97~122 -> 두개의 차이는 32
        // char는 기본적으로 숫자(아스키 코드)로 제공되기 때문에 바로 숫자랑 비교 가능
        // 하지만 캐스팅은 (char)로 붙여서 캐스팅하기
        for (char c:str.toCharArray()) {
            if (c>=65 && c<=90) {
                answer+=(char)(c+32);
            }
            else {
                answer+=(char)(c-32);
            }
        }




        return answer;

    }


    public static void main(String[] args) {
        Main2 main =new Main2();

        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        System.out.println(main.solution(input1));
    }

}
