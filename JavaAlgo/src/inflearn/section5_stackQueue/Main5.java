package inflearn.section5_stackQueue;

// 괄호 문제

import java.util.*;


public class Main5 {

    public int solution(String str) {
        int answer=0;
        Stack<Character>stack=new Stack<>();

        // String -> char[]
        char arr[]=str.toCharArray();

        for (int i=0;i<arr.length;i++) {
            char s=arr[i];
            if (s=='(') {
                stack.push(s);
            }
            // 닫는 괄호
            else {
                // 레이저냐?
                char prev=arr[i-1];
                if (prev=='(') {
                    stack.pop();
                    answer+=stack.size();
                }
                else { // 마지막 막대기냐?
                    stack.pop(); // 닫아야 하기 때문에 pop 해주고 answer에는 1을 더해준다.
                    answer+=1;
                }
            }
        }
        System.out.println(answer);
        return answer;
    }


    public static void main(String[] args) {
        Main5 main=new Main5();
        Scanner scan=new Scanner(System.in);
        String str=scan.next();

        main.solution(str);

    }
}
