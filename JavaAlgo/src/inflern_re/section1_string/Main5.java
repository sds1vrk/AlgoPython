package inflern_re.section1_string;
import java.util.*;
public class Main5 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String s=scan.next();
        char []temp=s.toCharArray();

        int lt=0;
        int rt=s.length()-1;

        for (int i=0;i<s.length();i++) {

            if (Character.isAlphabetic(temp[i])) {
                char tmp;
                tmp=temp[i];
                // 뒤집어야 됨 뒤에꺼 중에 알파벳인거 찾기
                for (int j=rt;j>=0;j--) {
                    if (Character.isAlphabetic(temp[j])) {
                        char bb=temp[j];
                        temp[i]=bb;
                        temp[j]=tmp;
                        rt=j-1;
                        break;
                    }
                }

            }

            // 이 조건을 써줘야지 멈춤
            if (i>=rt) {
                break;
            }

        }

        System.out.println(String.valueOf(temp));


    }

}
