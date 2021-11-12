package inflearn.section8_dfs_bfs활용;

import java.util.*;

// 나올수 있는 경우의수를 구하고 이를 통해 맨 위에 순열을 추측하기
// 이항계수 : 컴비네이션을 이용
public class 수열추측하기 {
    static int []b,p,ch; //b는 이항계수가 들어갈 공간, p는 순열이 들어갈 공간, ch는 순열의 체크를 하기 위해 필요
    static int dx[][];
    static int n;
    static int ans;

    int combi(int n,int r) {
       if (dx[n][r]>0) return dx[n][r];
        if (n==r || r==0) return 1;
        else {
            return dx[n][r]=combi(n-1,r)+combi(n-1,r-1);
        }

    }
    static boolean flag=false;
    void dfs(int l,int sum) {
        if (flag) return;

        if (l==n) {
//            System.out.println("여기");
            if (sum==ans) {
//                System.out.println("여기22");
                // p 출력
                flag=true;
                for (int i=0;i< p.length;i++) {
                    System.out.print(p[i]);
                }
                System.out.println();
            }
        }
        else {
            for (int i=1;i<=n;i++) {
                if (ch[i]==0) {
                    ch[i]=1;
                    p[l]=i;
//                    System.out.println(sum+(p[l]*b[l]));
                    dfs(l+1,sum+(p[l]*b[l]));
                    ch[i]=0;
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        ans=scan.nextInt();
        b=new int[n];
        p=new int[n];
        ch=new int[n+1]; // 1부터 들어가기 때문에 +1

//        System.out.println("ans:"+ans);

        dx=new int [35][35]; //메모제이션은 충분히 만들어준다.
        수열추측하기 m1=new 수열추측하기();
        for (int i=0;i<n;i++) {
            b[i]=m1.combi(n-1,i);
        }

//        for (int i=0;i<n;i++) {
//            System.out.println(b[i]);
//        }

        m1.dfs(0,0);



    }


}
