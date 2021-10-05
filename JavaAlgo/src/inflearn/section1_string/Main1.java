// 문자 찾기
// String 입력 : scanner.next()
// String char 접근 (인덱스로 접근) : str.chartAt(0)
// String 대,소문자로 변경 : str.toUpperCase(),  str.toLowerCase()
// char 대,소문자로 변경 : Character.toUpperCase(c)

/*
     for-each 전체는 string 안됨 -> 따라서 배열이나 arrayList등으로 변경해야 됨
     for (char x:str.toCharArray()) {
                if (x==t) {
                    answer+=1;
                }
            }
 */

// string -> array로 변경 : str.toCharArray()


package inflearn.section1_string;
import java.util.*;


public class Main1 {

    public int solution(String str, char t) {

        str=str.toUpperCase();

        t=Character.toUpperCase(t);

        int answer=0;

        // 방법 1
//        for (int i=0;i<str.length();i++) {
//            if (t==str.charAt(i)) {
//                answer+=1;
//            }
//        }

        // 방법 2 for-each
        // for-each 전체는 string 안됨 -> 따라서 배열이나 arrayList등으로 변경해야 됨
        // string -> array로 변경 : str.toCharArray()
        for (char x:str.toCharArray()) {
            if (x==t) {
                answer+=1;
            }
        }



        return answer;

    }

    public static void main(String[] args){

        Main1 main1=new Main1();


        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);


        System.out.println(main1.solution(input1,input2));

    }
}

