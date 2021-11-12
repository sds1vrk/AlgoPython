package inflearn.section5_stackQueue;

import java.util.*;

public class Main6 {

    public int solution(int n, int m) {
        int answer=0;

        Queue<Integer>queue=new LinkedList<>();

        for (int i=1;i<=n;i++) {
            queue.add(i);
        }


        while (!queue.isEmpty()) {

            // m-1개 뽑아서 뒤에 넣는다. // index역할을 대신한다.
            for (int i=0;i<m-1;i++) {
                queue.offer(queue.poll());
            }

            // 마지막 꺼는 빼고 없애준다.
            queue.poll();


            // 만약 1개만 남았으면 종료 ->
            if (queue.size()==1) {
                answer=queue.poll();
            }
        }

        System.out.println(answer);


        return answer;

    }


    public static void main(String[] args) {
        Main6 main=new Main6();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int m=scan.nextInt();

        main.solution(n,m);

    }
}
