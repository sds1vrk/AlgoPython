package inflearn.section8_dfs_bfs활용;
import java.util.*;

class test {
    final int value;


    test() {
        this.value=10;
    }
}

public class 동전교환 {

    static int n;
    static Integer arr[];
    static int change;
    static int count=Integer.MAX_VALUE;

    public void dfs(int l, int hap) {
        // time Limit이 일어남 -> 가지치기 해서 시간을 줄일수있는 방법을 생각해보자
        // 이 조건도 넣을수 있지 않을까? 이미 앞에서 l이 나왔는데 더 들어갈 필요가 없으면 종료
        // 가지치기해야 할 것을 생각해본다.

        if (count<l) {
            return;
        }
        // 더 줄일수 있지 않을까?!


        if (hap>change)  {
            return;
        }
        else if(hap==change) {
            count=Math.min(count,l);


        }
        else {
            for (int i=0;i<n;i++) {
                dfs(l+1,hap+arr[i]);
            }

        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        arr=new Integer[n];
        for (int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }
        change=scan.nextInt();

        // 내림차순 정렬
        // 배열은 내림차순 하려면 Integer로 변경해야 한다.
        //
        Arrays.sort(arr,Collections.reverseOrder());



        동전교환 m1=new 동전교환();
        m1.dfs(0,0);
        System.out.println(count);

    }

}
