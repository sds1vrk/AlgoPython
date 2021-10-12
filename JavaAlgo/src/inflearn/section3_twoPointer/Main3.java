package inflearn.section3_twoPointer;


import java.util.*;

public class Main3 {

    public int solution(int n,int m,int []arr) {
        int minValue=Integer.MIN_VALUE;

        int lt=0;
        int rt=n-m;

        while (lt<=rt) {
            int hap=0;
            for (int k=0;k<m;k++) {
                hap+=arr[lt+k];
            }

            if (hap>minValue) {
                minValue=hap;
            }
            lt++;
        }

        System.out.println(minValue);

        return minValue;

    }


    public int solution2(int n,int m,int []arr) {

        // 슬라이싱 윈도우
        // 밀면서 이동하는 것
        int hap=0;
        // 초기 3개 더한 값을 구한다
        for (int i=0;i<m;i++) {
            hap+=arr[i];
        }
        int answer=hap;

        // 하나씩 밀면서 증가시키고 처음 인덱스 값은 하나씩 지운다.
        for (int i=m;i<n;i++) {
            hap+=(arr[i]-arr[i-m]);

            if (answer<hap) {
                answer=hap;
            }
        }


        System.out.println(answer);

        return answer;

    }


    public static void main(String[] args) {
        Main3 main=new Main3();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();
        int arr[]=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }

//        System.out.println(Arrays.toString(arr));

//        main.solution(n,m,arr);

        main.solution2(n,m,arr);



    }
}
