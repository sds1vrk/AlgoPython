package inflearn.section9_그리디;
import java.util.*;
public class 씨름선수 {
    // 완전 탐색

    public void solution(int n, int[][]arr) {

        ArrayList<Integer>arrayList=new ArrayList<>();

        for (int i=0;i<n;i++) {
            int key=arr[i][0];
            int weight=arr[i][1];

            boolean check=true;
            for (int j=0;j<n;j++) {
                int sKey=arr[j][0];
                int sWeight=arr[j][1];

                if (key==sKey && weight ==sWeight ) {
                    continue;
                }
                if (key<sKey && weight <sWeight) {
                    check=false;
                    break;
                }
            }

            if (check) {
//                System.out.println(key+""+weight);
                arrayList.add(i);
            }
        }
        System.out.println(arrayList.size());

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();

        int arr[][]=new int[n][2];

        for (int i=0;i<n;i++) {
            for (int j=0;j<2;j++) {
                arr[i][j]=scan.nextInt();
            }
        }

//        for (int i=0;i<n;i++) {
//            System.out.println(arr[i][0]+" "+arr[i][1]);
//        }

        씨름선수 m1=new 씨름선수();
        m1.solution(n,arr);



    }

}
