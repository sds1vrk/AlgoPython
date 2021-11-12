package inflern_re.section1_string;
import java.util.*;
public class 암호 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        String s=scan.next();

//        System.out.println(n);
//        System.out.println(s);

        s=s.replace("#","1").replace("*","0");
        String sArr[]=s.split("");


//        System.out.println(s);
        // 7자리로 나누기
        int total=s.length();
        int div=total/7;

        String answer="";

        for (int i=0;i<div;i++) {
            int start=i*7;
            int end=start+7;
            String temp="";
            for (;start<end;start++) {
                temp+=sArr[start];
            }
//            System.out.println(temp);
            int k=Integer.parseInt(temp,2);
//            System.out.println((char)k);
            answer+=(char)k;
        }
        System.out.println(answer);




    }
}
