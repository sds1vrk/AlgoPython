package inflearn.section9_그리디;

import java.util.*;

class Point{
    int x=0;
    int y=0;

    Point(int x,int y) {
        this.x=x;
        this.y=y;
    }

}

public class 회의실배정 {

    public void solution(int n, ArrayList<Point>arrayList) {

//        for (int i=0;i< arrayList.size();i++) {
//            Point point=arrayList.get(i);
//            System.out.println(point.x+" "+point.y);
//        }

        Collections.sort(arrayList, new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                int a1=o1.y;
                int a2=o2.y;

//                if (a1>a2) {
//                    // 같으면 x,y 끼리 비교
//                    return 1;
//                }
//                else if (a1<a2) {
//                    return -1;
//                }
//                else {
//                    if (o1.x>o1.x) {
//                        return 1;
//                    }
//                    else {
//                        return -1;
//                    }
//                }
                if (a1==a2) {
                    return o1.x-o2.x;
                }
                else {
                    return o1.y-o2.y; // 첫번째께 더 크면 음수
                }


            }
        });

//        for (int i=0;i< arrayList.size();i++) {
//            Point point=arrayList.get(i);
//            System.out.println(point.x+" "+point.y);
//        }

        // 첫번째부터 확인 고고씽
        Point point=arrayList.get(0);
        int end= point.y;
        int answer=1;
        for (int i=1;i< arrayList.size();i++) {
            int start=arrayList.get(i).x;

            if (end<=start) {
                answer++;
                end=arrayList.get(i).y;
            }
        }
        System.out.println(answer);

    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

        int arr[][]=new int[n][2];

        ArrayList<Point>arrayList=new ArrayList<>();

        for (int i=0;i<n;i++) {
            int x=0;
            int y=0;
            x=scan.nextInt();
            y= scan.nextInt();
            Point point=new Point(x,y);
            arrayList.add(point);
        }


        회의실배정 m1=new 회의실배정();
        m1.solution(n,arrayList);




    }
}
