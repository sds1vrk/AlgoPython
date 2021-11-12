package inflearn.section8_dfs_bfs활용;
import java.util.*;
public class 바둑이승차 {

    static int sum;
    static int arr[];
    static int total;
    static int n;

    public void dfs(int l, int hap) {
        if (hap>total) return; // 이 조건을 추가해야지 빨라짐
        if (l==n) {
            if (hap<=total) {
                if (hap>sum) {
                    sum=hap;
                }
            }
        }
        else {
            // 바둑이를 태운다
            dfs(l+1,hap+arr[l+1]);
            // 바둑이를 태우지 않는다.
            dfs(l+1,hap);

        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        total=scan.nextInt();
        n=scan.nextInt();

        arr=new int[n+1];

        for (int i=1;i<=n;i++) {
            arr[i]=scan.nextInt();
        }

        바둑이승차 m1=new 바둑이승차();

        m1.dfs(0,0);
        System.out.println(sum);



    }

}
