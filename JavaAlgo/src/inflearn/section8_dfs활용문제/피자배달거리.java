package inflearn.section8_dfs활용문제;
import java.util.*;

public class 피자배달거리 {
    static int n;
    static int m;
    static int arr[][];
    static int com[][];
    static int ans[][];
    static ArrayList<Point>pointArrayList;
    static ArrayList<Point>houseList;
    static ArrayList<ArrayList<Integer>>arrayList;
    static int answer=Integer.MAX_VALUE;

    void combi(int l,int s) {
        // 종료
        if (l==m) {
//            System.out.println("길이"+ans.length);
            ArrayList<Integer>templist=new ArrayList<>();

            int hap=0;
            // 집 고정
            for (int k=0;k< houseList.size();k++) {
                int hx=houseList.get(k).x;
                int hy=houseList.get(k).y;

//                System.out.println("hx:"+hx);
//                System.out.println("hy:"+hy);
                // 피자와의 최소 거리의 합을 구한다.
                int minValue=Integer.MAX_VALUE;
                for (int i=0;i<m;i++) {
                    int px=ans[i][0];
                    int py=ans[i][1];

//                    System.out.println("px:"+px);
//                    System.out.println("py:"+py);

                    int dis=Math.abs(hx-px)+Math.abs(hy-py);
                    if (dis<minValue) {
                        minValue=dis;
                    }
                }
//                System.out.println("minValue:"+minValue);
                hap+=minValue;
            }

            answer=Math.min(answer,hap);



//            arrayList.add(templist);

        }
        else {
            for (int i=s;i< pointArrayList.size();i++) {
                // 정답을 채워야 함 - 어디다가?!
                Point pp=pointArrayList.get(i);
//                System.out.println(pp.x+" "+pp.y);
                // (0,0) (0,1)
                // (1,0) (1,1)

                ans[l][0]=pp.x;
                ans[l][1]=pp.y;

                combi(l+1,i+1);
            }
        }



    }
    // static해도 되는가?!
    static class Point {
        int x,y;
        Point(int x,int y) {
            this.x=x;
            this.y=y;
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        n=scan.nextInt();
        m=scan.nextInt();
        ans=new int[m][m];

        arr=new int[n][n];
//        com=new int[n][n]; // 피자집을 담을 공간
        pointArrayList=new ArrayList<>();
        arrayList=new ArrayList<>();
        houseList=new ArrayList<>();

        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j]=scan.nextInt();
                if (arr[i][j]==2) {
                    Point point=new Point(i,j);
                    pointArrayList.add(point);
                }

                if (arr[i][j]==1) {
                    Point point=new Point(i,j);
                    houseList.add(point);
                }
            }
        }

//        for (int i=0;i< pointArrayList.size();i++) {
//            System.out.println(pointArrayList.get(i).x+" "+(pointArrayList.get(i).y));
//        }

        피자배달거리 m1=new 피자배달거리();
        m1.combi(0,0);

        // arraylist 출력하고 -> 맵에 넣기
        // 맵에 넣은 후에 집 과의 거리 구하기
//        System.out.println(arrayList.size());


        System.out.println(answer);



    }
}
