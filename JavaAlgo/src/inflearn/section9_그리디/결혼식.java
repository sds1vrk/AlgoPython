package inflearn.section9_그리디;
import java.util.*;
class Point1 {
    int x;
    int y;
    Point1 (int x,int y) {
        this.x=x;
        this.y=y;
    }
}

public class 결혼식 {

    public void solution(int n, ArrayList<Point1>arrayList) {
        // 정렬
//        Collections.sort(arrayList, new Comparator<Point1>() {
//            @Override
//            public int compare(Point1 o1, Point1 o2) {
//                return 0;
//            }
//        });

        Collections.sort(arrayList,new Comparator<Point1>() {
            @Override
            public int compare(Point1 o1, Point1 o2) {
                if (o2.y==o1.y) {
                    return o2.x-o1.x;
                }
                else {
                    return o2.y-o1.y;
                }
            }
        });

        for (int i=0;i< arrayList.size();i++) {
            Point1 pp=arrayList.get(i);
            System.out.println(pp.x+" "+pp.y);
        }

        int maxValue=Integer.MIN_VALUE;
        for (int i=0;i< arrayList.size();i++) {
            int answer=1;
            int start=arrayList.get(i).x;
            int end=arrayList.get(i).y;
            for (int j=i+1;j<arrayList.size();j++) {
                int start2=arrayList.get(j).x;
                int end2=arrayList.get(j).y;

                if (end>start2 && start>start2) {
                    answer++;
                }
                else {
                    break;
                }
            }

            if (maxValue<answer) {
                maxValue=answer;
            }

        }
        System.out.println(maxValue);

    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();

//        int arr[][]=new int[n][2];

        ArrayList<Point1>arrayList=new ArrayList<>();

        for (int i=0;i<n;i++) {
            int x=0;
            int y=0;
            x=scan.nextInt();
            y= scan.nextInt();
            Point1 point=new Point1(x,y);
            arrayList.add(point);
        }

        String test="23";
//        test.replace("")

                int k=2;
                String a=Integer.toString(2);

        결혼식 m1=new 결혼식();
        m1.solution(n,arrayList);

    }
}
