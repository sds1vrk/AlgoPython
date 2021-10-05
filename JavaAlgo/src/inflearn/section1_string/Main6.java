package inflearn.section1_string;
// 알고리즘
// 중복 제거
// index 접근
// 첫번째 글자, 해당 글자의 인덱스, indexOf(char) 첫번재로 언제 나오는지
// ex) ksekkset
//     01234567
//    char    i   indexOf
//      k     0     0
//      s     1     1
//      e     2     2
//      k     3     0
//      k     4     0
//      s     5     1
//      e     6     2
//      t     7     7
// 같을때만 더한다. 다르면 이미 나온수이기 때문에

import java.util.Scanner;

public class Main6 {

    public String solution(String str) {
        String answer="";

        for (int i=0;i<str.length();i++) {
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if (i==str.indexOf(str.charAt(i))) {
                answer+=str.charAt(i);
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Main6 main =new Main6();
        Scanner scan=new Scanner(System.in);
        System.out.println(main.solution(scan.next()));
    }
}
