package inflearn.section8_dfs순열조합;

import java.util.*;

public class 수열추측하기 {

    // 이항 개수 (combi)
    static int bin[][]; //메모제이션
    static int b[]; //이항개수를 저장하는 곳 3C0 , 3C1, 3C2, 3C3을 저장하는 곳

    static int n;
    static int f;

    // 순열
    static int ans[];
    static int[] check;




    int combi(int n,int r) {
        if (bin[n][r]>0) return bin[n][r];
        if (n==r || r==0)  return 1;
        else {
            bin[n][r]=combi(n-1,r-1)+combi(n-1,r);
            return bin[n][r];
        }

    }

    void dfs(int l,int sum) {
        // 출력
        if (l==n) {
            if (sum==f) {

                // 이 수열이 정답
                for (int i=0;i<n;i++) {
                    System.out.print(ans[i]+" ");
                }
                System.out.println();
            }
            else return;
        }
        else {
            for (int i=1;i<=n;i++) {
                if (check[i]==0) {
                    check[i]=1;
                    ans[l]=i;
                    dfs(l+1,sum+ans[l]*b[l]);
                    check[i]=0;
                }
            }
        }


    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        f=scan.nextInt();

        bin=new int[35][35]; // 최대한 크게
        b=new int[n+1];
        // 3C0, 3C1, 3C2, 3C3을 구해야 됨
        수열추측하기 m1=new 수열추측하기();
        for (int i=0;i<n;i++) {
            b[i]=m1.combi(n-1,i); // 수열을 추측할때는 이항 개수는 3C0 + 3C1 +3C2 +3C3 이기 때문에 1개 적게해서 만들어줌
//            System.out.println(m1.combi(n-1,i));
        }

        // 순열
        check=new int[n+1]; // 1부터 시작하므로 +1개 잡음
        ans=new int[n+1];

        m1.dfs(0,0);

    }
}
