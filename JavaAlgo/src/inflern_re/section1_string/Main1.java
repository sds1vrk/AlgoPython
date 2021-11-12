package inflern_re.section1_string;

import java.util.*;
public class Main1 {

    public static void main(String[] args) {
        // 개수
        // 소문자로 변경
        Scanner scan=new Scanner(System.in);
        String s=scan.next().toLowerCase();
        String find=scan.next();



        // 소문자로 변경
        String []sArr=s.split("");

        int answ=0;
        for (int i=0;i<sArr.length;i++) {
            if (sArr[i].equals(find)) {
                answ++;
            }
        }


        System.out.println(answ);


    }


}
