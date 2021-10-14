package inflearn.section5_stackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Main2 {

    public String solution(String str) {

//        String strArr[]=str.split("");

        char[] charArr =str.toCharArray();
        Stack<Character>stack=new Stack<>();

        for (Character ss:charArr) {
            if (ss=='(' || Character.isAlphabetic(ss)) {
                stack.push(ss);
            }
            else {
                // 닫는 괄호면 for문으로 stack 탐색하다가 ( 찾기
                while (!stack.isEmpty()) {
                    if (stack.peek().equals('(')) {
                        // 지우고 while문 종료
                        stack.pop();
                        break;
                    }
                    // 알파벳 제거
                    stack.pop();
                }
            }
        }
        String answer="";
        // stack 남은거 확인하기
        for (char s:stack) {
            answer+=s;
        }
        return answer;
    }


    public static void main(String[] args) {
        Main2 main=new Main2();
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        System.out.println(main.solution(str));


    }
}