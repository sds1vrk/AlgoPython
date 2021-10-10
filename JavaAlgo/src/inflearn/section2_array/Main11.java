package inflearn.section2_array;

import java.util.*;

public class Main11 {

    public int solution(int n,int [][]arr) {
        int answer=0;

        // 가장 작은 수
        int minSize=Integer.MIN_VALUE;

        // i는 n번 학생
        for (int i=0;i<n;i++) {

            // 학생이 중복되는 경우가 있으므로 hahset이용
            HashSet<Integer>hashSet=new HashSet<>();
            // 1학년 검사
            int k=arr[i][0];
            for (int j=0;j<n;j++) {
                if (k==arr[j][0]) {
                    // 자기 자신 제외
                    if (i!=j) {
                        hashSet.add(j);
                    }
                }
            }

            // 2학년 검사
            int k2=arr[i][1];
            for (int j=0;j<n;j++) {
                if (k2==arr[j][1]) {
                    // 자기 자신 제외
                    if (i!=j) {
                        hashSet.add(j);
                    }
                }
            }



            // 3학년 검사
            int k3=arr[i][2];
            for (int j=0;j<n;j++) {
                if (k3==arr[j][2]) {
                    // 자기 자신 제외
                    if (i!=j) {
                        hashSet.add(j);
                    }
                }
            }

            //4학년
            int k4=arr[i][3];
            for (int j=0;j<n;j++) {
                if (k4==arr[j][3]) {
                    // 자기 자신 제외
                    if (i!=j) {
                        hashSet.add(j);
                    }
                }
            }


            //5학년
            int k5=arr[i][4];
            for (int j=0;j<n;j++) {
                if (k5==arr[j][4]) {
                    // 자기 자신 제외
                    if (i!=j) {
                        hashSet.add(j);
                    }
                }
            }

            int ans=hashSet.size();
            if (minSize<ans) {
                answer=i;
            }


        }



        return answer;

    }


    public static void main(String[] args) {
        Main11 main=new Main11();
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int arr[][]=new int[n][n];
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j]=scan.nextInt();
            }
        }


        // 출력
        for (int i=0;i<n;i++) {
            for (int j=0;j<n;j++) {
//                System.out.print(arr[i][j]+" ");
            }
//            System.out.println();
        }

        System.out.println(main.solution(n,arr));




    }
}
