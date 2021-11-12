package inflearn.section8_dfs_bfs활용;
import java.util.*;
// 여기선 배열 1개만 사용 (정답이 들어가는  arr 배열)
// 이유는 N이 1부터 3까지 시작으로 고정되기 때문에
// 문제를 담는 배열을 따로 만들 필요 없다.

public class 중복순열구하기 {
    static int arr[];
    static int n;
    static int m;

    public void dfs(int l) {
        // 종료
        if (l==m) {
            String temp="";
            for (int i=0;i<m;i++) {
                temp+=arr[i]+" ";
            }
            System.out.println(temp);
        }
        else {
            for (int i=1;i<=n;i++) {
                arr[l]=i;
                dfs(l+1);
            }
        }

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        n=scan.nextInt();
        m= scan.nextInt();
        arr=new int[m];
        중복순열구하기 m1=new 중복순열구하기();
        m1.dfs(0);



    }
}
