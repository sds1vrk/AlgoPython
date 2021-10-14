package inflearn.section5_stackQueue;

// 이슈
// 괄호문제는 스택을 보통 이용
// 첫번째 값을 먼저 넣고 다음 인덱스부터 비교
// 스택에 홀로 ) 남으면 -> 바로 NO임 : 이 경우를 괄호 문제에서 항상 생각해야 함.
// 그렇지 않으면
//     스택의 값 (peek)과 새로 들어온 값이 다르면 - pop()
//         스택에서 뺄때는 항상 스택이 존재하는지 확인한다! (if문으로 확인)
//     같으면 그냥 - push()


import java.util.*;

public class Main1 {

    public String solution(String str) {
        String answer="NO";

        // String -> str[]
        String []strArr=str.split("");

        Stack<String>stack=new Stack();
        // 첫번째 값을 넣어준다.
        stack.push(strArr[0]);

        // 하나씩 접근
        for (int i=1;i< strArr.length;i++) {

            // 스택에 홀로 남은게 )이면 종료 -> 더이상 못닫기 때문에
            if (stack.size()==1 && stack.peek().equals(")")) {
                break;
            }

            else {
                // 만약 스택이 비어져있지 않고 스택에 있는거하고 새로 들어온값하고 다르면 -> 스택에서 빼기
                if (!stack.isEmpty() && !stack.peek().equals(strArr[i])) {
                    stack.pop();
                }
                // 같으면 스택에 더하기
                else {
                    stack.push(strArr[i]);
                }
            }
        }

        // 비워져있으면 YES
        if (stack.isEmpty()) {
            answer="YES";
        }


        return answer;

    }


    public String solution2(String str) {
        String answer="NO";

        // String -> str[]
        String []strArr=str.split("");

        Stack<String>stack=new Stack();

        for (String ss:strArr) {
            if (ss.equals("(")) {
                stack.push(ss);
            }
            else {
                // 닫혀진 괄호가 들어와서
                if (stack.isEmpty()) {
                    return "NO";
                }
                else {
                    stack.pop();
                }
            }
        }


        // 비워져있으면 YES
        if (stack.isEmpty()) {
            answer="YES";
        }

        return answer;
    }



    public static void main(String[] args) {
        Main1 main=new Main1();
        Scanner scan=new Scanner(System.in);
        String str=scan.next();

//        System.out.println(main.solution(str));

        System.out.println(main.solution2(str));

    }
}
