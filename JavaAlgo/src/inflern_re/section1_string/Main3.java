package inflern_re.section1_string;
// 문장속에서 가장 긴 단어 찾기

import java.util.*;

public class Main3 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String ss=scan.nextLine();

        // 공백을 기준으로 나누기
        String ssArr[]=ss.split(" ");
        int ans=Integer.MIN_VALUE;
        String answer="";
        for (int i=0;i< ssArr.length;i++) {
            String s=ssArr[i];

            if (s.length()>ans) {
                answer=s;
            }

        }

        System.out.println(answer);



    }
}
