package inflern_re.section1_string;
import java.util.*;

// 연속된 수 찾기
// 2중 for문을 사용하자
public class 문자열압축 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();
        String ss[]=s.split("");
        int lt=0;
        int rt=s.length();

        String answer="";
        while (lt<rt) {
            String prev=ss[lt];
            int idx=1;

            int i=lt+1;
            for (;i<rt;i++) {
                String next=ss[i];
                if (prev.equals(next)) {
                    idx++;
                }
                else {
                    break;
                }
            }

            lt=i;

            // idx 저장
            answer+=prev;
            if (idx!=1)  {
                answer+=String.valueOf(idx);
            }


        }

        System.out.println(answer);


    }
}
