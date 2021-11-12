package inflearn.section8_dfs순열조합;
import java.util.*;

public class 조합 {
    static int n;
    static int m;
    static int arr[]; // 문제 담을 배열
    static int ans[]; // 정답 담을 배열

    static ArrayList<ArrayList<Integer>> arrayList;

    void dfs(int l, int s) {
        // 출력
        ArrayList<Integer> templist=new ArrayList<>();
        if (l==m) {
            for (int i=0;i<m;i++) {
                templist.add(ans[i]);
            }
            arrayList.add(templist);
        }
        else {
            for (int i=s;i<n;i++) {
                ans[l]=arr[i];
                dfs(l+1,i+1);
            }
        }
    }

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        n =scan.nextInt(); //3
        m=scan.nextInt(); //2

        arr=new int[n]; //n개 담을 문제 담을배열 담음
        ans=new int[m]; //m개 담을 정답 배열

        for (int i=0;i<n;i++) {
            arr[i]=scan.nextInt(); //3,6,9
        }

        arrayList=new ArrayList<>();

        조합 m1=new 조합();
        m1.dfs(0,0);

        // 출력
        for (ArrayList a:arrayList) {
            for (int i=0;i<m;i++) {
                System.out.print(a.get(i)+" ");
            }
            System.out.println();
        }
    }
}
