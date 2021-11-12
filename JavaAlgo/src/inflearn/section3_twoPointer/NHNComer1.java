package inflearn.section3_twoPointer;
// 입력 N개 13

//13
//a
//a
//b
//b
//c
//c
//d
//d
//e
//e
//e
//f
//f

// 출력 -> 2a2b2c2d3e2f

//8
//a
//a
//b
//c
//d
//e
//f
//g
// 출력 -> 2abcdefg
import java.util.*;
public class NHNComer1 {

    public static void main(String[] args) {



        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        // nextInt는 개행이 포함되므로 nextLine할때는 scan.nextLine()을 써줘야 한다.
        scan.nextLine();
        String arr[]=new String[n];

        for (int i=0;i<n;i++) {
            arr[i]=scan.nextLine();
        }
        System.out.println(Arrays.toString(arr));

        int lt=0;
        int rt=1;

        String prev=arr[lt];
        int cnt=1;
        while (lt<n) {

            while (rt<n) {
                if (prev.equals(arr[rt])) {
                    cnt++;
                    rt++;
                }
                else {
                    prev=arr[rt];
                    break;
                }
            }
            System.out.println(cnt+arr[lt]);
            cnt=0;
            lt=rt;
        }




    }
}
