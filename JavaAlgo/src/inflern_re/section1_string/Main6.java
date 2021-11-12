package inflern_re.section1_string;

// 중복 문자 제거
import java.util.*;
public class Main6 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.next();

        char []temp=s.toCharArray();

        String answer="";
        for (int i=0;i<temp.length;i++) {
            int k=s.indexOf(temp[i]);

            if (k==i) {
                answer+=temp[i];
            }
        }

        System.out.println(answer);

    }
}
