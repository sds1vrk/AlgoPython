package inflearn.section1_string;

import java.util.*;

public class Main11 {

    public String solution(String str) {
        String answer="";

        int lt=0;
        int rt=str.length();

        // 배열로 변환
        char []temp=str.toCharArray();

        while (lt<rt) {
            int tmp=1;
            char val=temp[lt];

            for (int i=lt+1;i<rt;i++) {
                if (val==temp[i]) {
                    tmp++;
                }
                else {
                    break;
                }
            }
//            System.out.println("tmp:"+tmp);
            // Integer -> string
            String data=""+val;
            if (tmp!=1) {
                data+=Integer.toString(tmp);
            }
            answer+=data;
            lt=lt+tmp;
        }

        return answer;

    }


    public static void main(String[] args) {
        Main11 main =new Main11();
        Scanner scan=new Scanner(System.in);

        System.out.println(main.solution(scan.next()));
    }
}
