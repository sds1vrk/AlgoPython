package inflearn.section8_dfs순열조합;
import java.lang.reflect.Array;
import java.util.*;


public class 중복순열 {
    static int arr[];
    static int ans[];

    static int n;
    static int m;

    static ArrayList<ArrayList<Integer>>arraylist;


    void dfs(int l) {
        if (l==m) {
            // 출력
            ArrayList<Integer>templist= new ArrayList<>();
            for (int i=0;i<m;i++) {
                templist.add(ans[i]);
            }
            arraylist.add(templist);


        }
        else{
            for (int i=0;i<n;i++) {
                ans[l]=arr[i];
                dfs(l+1);
            }
        }
    }


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        n=scan.nextInt();
        m=scan.nextInt();

        arr=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }

        ans=new int[m];
        arraylist=new ArrayList<>();

        중복순열 m1=new 중복순열();

        m1.dfs(0);


        // 정답 출력하는 arraylist

        for (int i=0;i< arraylist.size();i++) {
            System.out.println(arraylist.get(i));
        }


    }
}
