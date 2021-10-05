package inflearn.section1_string;

import java.util.Scanner;
import java.util.*;
public class Main4 {

    public String solution(String ans) {

        // 방법 1. StringBuilder의 reverse 메소드를 이용하여 단어 뒤집기
        StringBuilder sb=new StringBuilder(ans).reverse();



        // 방법 2. 첫번째 인덱스와 마지막 인덱스를 교환하기
        // - lt와 rt를 이용하여 증가, 빼기를 통해 교환

        char [] tmp=ans.toCharArray();
        int lt=0;
        int rt=tmp.length-1;  //study -> 길이는 5

        while (lt<rt) {
            // lt 인덱스, rt인덱스 교환

            char temp=tmp[lt];
            tmp[lt]=tmp[rt];
            tmp[rt]=temp;

            lt++;
            rt--;

        }

        // char -> toString
        System.out.println("tmp:"+String.valueOf(tmp));


        return sb.toString();
    }


    public static void main(String[] args) {
        Main4 main =new Main4();
        Scanner scan=new Scanner(System.in);

        int k=scan.nextInt();

        String temp[]=new String[k];

        for (int i=0;i<k;i++) {
            temp[i]=scan.next();
        }


        for (String ans:temp) {

            System.out.println(main.solution(ans));
        }

    }
}
