package inflern_re.section1_string;
import java.util.*;
public class 가장짧은문자거리 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String s=scan.nextLine();

        String sArr[]=s.split(" ");

        String ss=sArr[0];
        String find=sArr[1];


        String []temp=ss.split("");

        int k=101;

        int []ans=new int[temp.length];


        for (int i=0;i<temp.length;i++) {

            if (temp[i].equals(find)) {
                k=i;
            }
            int val=Math.abs(i - k);
            ans[i]=val;
        }

//        System.out.println(Arrays.toString(ans));

        // 역으로 다시
        for (int j= temp.length-1;j>=0;j--) {
            if (temp[j].equals(find)) {
                k=j;
            }
            int val=Math.abs(j - k);
            if (ans[j]>val) {
                ans[j]=val;
            }
        }

//        System.out.println(Arrays.toString(ans));
        String answer="";
        for (int i=0;i<ans.length;i++) {
            answer+=ans[i]+" ";
        }

        System.out.println(answer);







    }
}
