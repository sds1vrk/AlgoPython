package inflearn.section5_stackQueue;


// 이슈
// 필수 과목은 반드시 이수해야 한다라는 조건 꼭 사용하기

import java.util.*;

public class Main7 {

    public String solution(String ans,String str) {
        String answer="YES";

        String []ansArr=ans.split("");
        String []strArr=str.split("");

        Queue<String>ansQueue=new LinkedList<>();
        Queue<String>strQueue=new LinkedList<>();

        for (String s:ansArr) {
            ansQueue.offer(s);
        }

        for (String s:strArr) {
            strQueue.offer(s);
        }

        while (!strQueue.isEmpty()) {

            String temp=strQueue.poll();
            if (ansQueue.contains(temp)) {
                String ansTemp=ansQueue.peek();
                if (ansTemp.equals(temp)) {
                    ansQueue.poll();
                }
                else {
                    return "NO";
                }
            }
        }

        if (!ansQueue.isEmpty()) {
            answer= "NO";
        }


        return answer;
    }


    public static void main(String[] args) {
        Main7 main=new Main7();
        Scanner scan=new Scanner(System.in);

        String ans=scan.next();
        String str=scan.next();


        System.out.println(main.solution(ans,str));


    }
}
