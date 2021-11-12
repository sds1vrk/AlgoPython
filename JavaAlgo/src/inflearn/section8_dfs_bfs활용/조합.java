package inflearn.section8_dfs_bfs활용;
import java.util.*;
// 조합은 외우자
// 조합은 start를 사용한다
// 시작위치에서 다음 위치까지 간다.
public class 조합 {

    static int ans[];
    static int n,m;

    static ArrayList<ArrayList<Integer>>arrayList;

    void dfs(int l,int s) {
        if (l==m) {

            ArrayList<Integer> templist=new ArrayList<>();

            // 호출
            for (int i=0;i<m;i++) {
                System.out.print(ans[i]+" ");
                templist.add(ans[i]);
            }
            arrayList.add(templist);
            System.out.println();
        }

        else {
            for (int i=s;i<=n;i++) {
                ans[l]=i;
                dfs(l+1,i+1);
            }
        }

    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        n= scan.nextInt();
        m=scan.nextInt();
        ans=new int[m];

        arrayList=new ArrayList<>();

        조합 m1=new 조합();
        m1.dfs(0,1);


        for (int i=0;i< arrayList.size();i++) {
            System.out.println(arrayList.get(i));
        }


    }
}
