// 문장 속 단어 찾기
// 띄어쓰기가 있는 입력 : scan.nextLine()
// 공백 구분자로 str -> 배열로 만들기 : str.split("구분자")
// String []temp =str.split(" ");

// 배열 값 String으로 한번에 확인하기 : Arrays.toString(array)
// 가장 작은 int 값 : int min=Integer.MIN_VALUE;

// 방법 1. split()으로 배열 만들기
// 방법 2. indexOf()와 subString을 이용하기
/*
// indexOf는 특정 인덱스를 찾고 몇번째 인덱스인지 확인할 수 있음 (따라서 while문 조건은 -1을 붙여서 많이 사용)
    int idx=0;
        while ((idx=str.indexOf(" "))!=-1) {
            String temp2=str.substring(0,idx); //substring은 마지막 인덱스 -1까지
            str=str.substring(idx+1);
        }
 */



package inflearn.section1_string;
import java.util.*;


public class Main3 {

    public String solution(String str) {
        String answer="";

        // 방법 1. str.split()
        // 공백 구분자로 단어 쪼개기
//        String []temp =str.split(" ");
        // 배열 값 출력
//        System.out.println(Arrays.toString(temp));

//        int ans=0;
//        int ans=Integer.MIN_VALUE;
//        for (String s:temp) {
//            if (ans<s.length()) {
//                ans=s.length();
//                answer=s;
//            }
//        }
//
//        str+=str+" ";

        // 방법2. indexOf, subString()
        /* indexOf
            indexOf는 특정 문자열 찾기, 없을때는 -1 return (인덱스가 -가 있는 경우는 없기 때문에)
            보통 idx, while 문과 많이 사용되며, 문자열 내의 특정 부분을 추출하기 위해 사용

            int idx=0;
            while ((idx=str.indexOf(" "))!=-1) {
                String temp2=str.substring(0,idx); //substring은 마지막 인덱스 -1까지
                 str=str.substring(idx+1);
             }
         */

        // it is time to study -> 공백이 되기 전까지 it / is / time / to
//         0123456789...

        int ans=Integer.MIN_VALUE;

        int idx=0;

        System.out.println("idx:"+str.indexOf(" ")); // 2 (공백문자 2 인덱스 발견)
        // 공백문자 찾기
        // 주의 점은 마지막 study 뒤에는 " "가 없기 때문에 확인은 못함 -> 따라서 마지막 꺼를 추가하기 위해 공백문자를 넣는다.
        // 마지막꺼는 공백문자가 없다.
        str=str+" ";
        // while을 사용하여 더 이상 없으면 종료
        while ((idx=str.indexOf(" "))!=-1) {
            System.out.println("idx"+idx);
            String temp2=str.substring(0,idx); //substring은 마지막 인덱스 -1까지

            if (idx>ans) {
                answer=temp2;
            }

            // 다시 str은 다음 꺼로
            // it is time to study -> is time to study -> time to study -> to study
            str=str.substring(idx+1);

        }


        System.out.println("answer"+answer);

        return answer;

    }


    public static void main(String[] args) {
        Main3 main =new Main3();
        Scanner scan=new Scanner(System.in);
        // 띄어쓰기가 있는 문자열은 nextLine()으로 받기
        String str=scan.nextLine();
        System.out.println(main.solution(str));
    }
}

//it is time to study