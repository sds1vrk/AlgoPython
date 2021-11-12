package inflearn.section5_stackQueue;

import java.util.*;

public class Main4 {

    public int solution(String str) {
        int answer=0;

        Stack<Integer>stack=new Stack<>();

        // String -> Character
        char []arr=str.toCharArray();

        for (char s:arr) {

            if (Character.isDigit(s)) {
                // Character - Int로 변경해서 저장
                stack.push(Character.getNumericValue(s));
            }
            else {
                // 연산자이기 때문에 stack에서 2개 뽑기
                int temp2=stack.pop();
                int temp1=stack.pop();

                int result=0;
                // 자바에도 str 연산해주는 것이 있나?
                if (s=='+') {
                    result=temp1+temp2;
                }
                else if (s=='*') {
                    result=temp1*temp2;
                }
                else if (s=='-') {
                    result=temp1-temp2;
                }
                else {
                    result=temp1/temp2;
                }

                // 결과값을 다시 stack에 저장
                stack.push(result);

            }
        }

        // 최종적으로 stack 남는게 정답
        answer=stack.get(0);
        System.out.println(answer);









        return answer;

    }


    public static void main(String[] args) {
        Main4 main=new Main4();
        Scanner scan=new Scanner(System.in);
        String str=scan.next();

        main.solution(str);

    }
}
