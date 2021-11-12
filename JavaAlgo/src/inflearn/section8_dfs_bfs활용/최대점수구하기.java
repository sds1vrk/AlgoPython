package inflearn.section8_dfs_bfs활용;
import java.util.*;
public class 최대점수구하기 {

    static int score[];
    static int time[];
    static int n;
    static int m;
    static int hap;

    void dfs(int l, int ts, int tt) {

        if (tt>m) {
            return;
        }
        if (l==n) {
            hap=Math.max(ts,hap);
        }
        else {
            // 문제 푼다
            dfs(l+1,ts+score[l+1],tt+time[l+1]);
            // 문제 안푼다.
            dfs(l+1,ts,tt);
        }
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();
        score=new int[n+1];
        time=new int[n+1];

        for (int i=1;i<=n;i++) {
            int sc=scan.nextInt();
            int tt=scan.nextInt();
            score[i]=sc;
            time[i]=tt;
        }
        최대점수구하기 m1=new 최대점수구하기();
        m1.dfs(0,0,0);
        System.out.println(hap);

    }
}
