package inflearn.section8_dfs_bfs활용;
// 합이 같은 부분집합
// dfs
// 포함한다 안한다로 넓힘
// 1 3 5 6 7 10 -> 여기선 10까지 다 들어가는것을 의미
// 끝나는 조건은 언제까지? -> level이 다 다르면 끝, level은
// 입력 값
// 6 (개수)
// 1 3 5 6 7 10

import java.util.*;
public class 합이같은부분집합 {
    static int n;
    static int arr[]; // 해당 노드 방문 여부는 필요 없음. -> OX로 나누는 것이기 때문에 나누어짐
    static String answer="NO";
    static int sum;
    static boolean flag=false;

    public void dfs(int l, int hap) {

        if (flag) return;
        if (l==n) { // 헷갈리면 1개만 사용할때를 생각해보자
            if ((sum-hap)==hap) { // 전체 토탈에서 빼준다. /2로 하면 합이 125같은 홀수 일때 문제, 125/2==62가 되어버림
                answer="YES";
                flag=true;
            }
        }
        else {
            // 사용한다
            dfs(l+1,hap+arr[l+1]); //여기가 잘못, 누적하면 안됨, hap은 이미 누적되어 있는 값임
            dfs(l+1,hap);// 사용안한다
        }
    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        n=scan.nextInt();
        sum=0;
        arr=new int [n+1];
        for (int i=1;i<=n;i++) {
            int k=scan.nextInt();
            sum+=k;
            arr[i]=k;
        }
//        System.out.println(sum);

        // 절반으로 나눈값으로 같아지면 됨
        // 16으로 맞추면 됨

        합이같은부분집합 test=new 합이같은부분집합();
        test.dfs(0,0);
        System.out.println(answer);


//        ArrayList<Integer> arrayList=new ArrayList<>();


    }
}
