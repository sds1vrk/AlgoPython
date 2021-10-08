package inflearn.section2_array;

import java.util.*;

public class Main3 {

    public void solution(int num,String []a,String []b) {
        for (int i=0;i<num;i++) {
            String answer="";
            if (a[i].equals(b[i])) {
                answer="D";
            }

            else if (a[i].equals("1")) {
                if (b[i].equals("2")) {
                    answer="B";
                }
                else if(b[i].equals("3")) {
                    answer="A";
                }
            }

            else if (a[i].equals("2")) {
                if (b[i].equals("1")) {
                    answer="A";
                }
                else if(b[i].equals("3")) {
                    answer="B";
                }
            }


            else if (a[i].equals("3")) {
                if (b[i].equals("1")) {
                    answer="B";
                }
                else if(b[i].equals("2")) {
                    answer="A";
                }
            }

            System.out.println(answer);


        }

        System.out.println("================");
        // 강사님 A를 기준으로 A가 이길수 있는 경우를 확인

        for (int i=0;i<num;i++) {
            String answer="";
            if (a[i].equals(b[i])) answer+="D";

            else if (a[i].equals("1") && b[i].equals("3")) answer+="A";
            else if (a[i].equals("2") && b[i].equals("1")) answer+="A";
            else if (a[i].equals("3") && b[i].equals("2")) answer+="A";

            else answer+="B";

        }







    }


    public static void main(String[] args) {
        Main3 main=new Main3();
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.nextLine();//개행 제거
        String []a=scan.nextLine().split(" ");
        String []b=scan.nextLine().split(" ");

        main.solution(num,a,b);
    }
}
