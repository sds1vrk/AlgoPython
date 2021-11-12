package inflern_re.section1_string;
import java.util.*;

// replaceAll 정규식

public class Main8 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String s=scan.nextLine();

        // 소문자로 변경
        s=s.toLowerCase();
//        System.out.println(s);
        // replaceAll
        s=s.replaceAll("[^a-z]","");

//        System.out.println(s);

        StringBuilder sb=new StringBuilder(s).reverse();

        String next=sb.toString();
        String answer="YES";
        if (!s.equals(next)) {
            answer="NO";
        }

        System.out.println(answer);


    }

}
