package inflearn.section2_array;

import java.util.*;

public class Main7 {

    public int solution(int num, String []str) {
        int answer=0;

//        System.out.println("string"+Arrays.toString(str));

        int lt=0;
        int rt=num-1;

        while (lt<=rt) {
            // 초기값은 0
            int tmp=0;
            for (int i=lt;i<=rt;i++) {
                if (str[i].equals("1")) {
                    tmp++;
                }
                else {
                    break;
                }
            }
            // tmp가 0이면 한칸 증가 해야됨 (핵심)
            if (tmp==0) {
                lt+=1;
            }
            else {
                lt+=tmp;
            }

//            System.out.println("tmp:"+tmp);
            int sum=0;
            for (int i=1;i<=tmp;i++) {
                sum+=i;
            }
            answer+=sum;

        }
        return answer;

    }
    // 강사님 코드
    // cnt를 0으로 초기화
    // str배열의 값이 1일때만 cnt 증가하고 answer에 더해줌
    // 만약 0이면 cnt를 0으로 초기화
    public int solution2(int num, String []str) {
        int answer=0;
        int cnt=0;

        for (int i=0;i<num;i++) {
            if (str.equals("1")) {
                cnt++;
                answer+=cnt;
            }
            // 여기가 핵심, str이 0이면 0으로 초기화
            else {
                cnt=0;
            }


        }

        return answer;
    }


    public static void main(String[] args) {
        Main7 main=new Main7();
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.nextLine();
        String []str=scan.nextLine().split(" ");


        System.out.println(main.solution(num,str));
        System.out.println(main.solution2(num,str));
    }
}
