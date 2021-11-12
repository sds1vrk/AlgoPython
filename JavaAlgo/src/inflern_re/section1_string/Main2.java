package inflern_re.section1_string;
import java.util.*;

// 소문자인지 대문자인지 확인하는 것은 Character만 존재
// 따라서 Character배열로 변환
public class Main2 {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        String ss=scan.next();
        char temp[]=ss.toCharArray();

        String ans="";

        for (int i=0;i< temp.length;i++) {
            if (Character.isLowerCase(temp[i])) {
                ans+=Character.toUpperCase(temp[i]);
            }
            else {
                ans+=Character.toLowerCase(temp[i]);
            }
        }

        System.out.println(ans);


    }
}
