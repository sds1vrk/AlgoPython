package inflearn.section8_dfs순열조합;
import java.util.*;
// 12345 // 5C2-> 2개 선택 -> 5는 뽑혔다고 가정 4C1+ 5가 안뽑혔을때 4C2
// nCr= n-1Cr-1 + n-1Cr
public class 조합의경우의수 {

    static int n; // n개중에
    static int r;  // 뽑을 개수
    static int dy[][]; // 메모제이션을 기록하기 위한 2차원 배열
    static ArrayList<ArrayList<Integer>> arrayList;


    public int combi(int n, int r) {

        // 메모제이션을 이용해서 이미 수가 차있다면 그대로 사용
        if (dy[n][r]>0) return dy[n][r];

        // nC0=1, nCn=1이기 때문에 종료 조건
        if (r==0 || n==r) return 1;

        else {
//            return combi(n-1,r-1)+combi(n-1,r);
            // 메모제이션 이용
            dy[n][r]= combi(n-1,r-1)+combi(n-1,r);
            return dy[n][r];
        }


    }


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        r=scan.nextInt();


        dy=new int[35][35]; //최대한 많이 생성

        조합의경우의수 m1=new 조합의경우의수();
        System.out.println(m1.combi(n,r));


    }

}