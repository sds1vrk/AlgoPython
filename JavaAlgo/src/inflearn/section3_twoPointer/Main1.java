package inflearn.section3_twoPointer;
// 투 포인터 문제
// 두 배열 합치기

import java.util.*;

public class Main1 {

    public void solution(int arr_a[],int arr_b[],int n) {

        int arr_c[]=new int [n];

        ArrayList<Integer>arrayList=new ArrayList<>();

        for (int i=0;i<arr_a.length;i++) {
            arrayList.add(arr_a[i]);
        }

        for (int i=0;i<arr_b.length;i++) {
            arrayList.add(arr_b[i]);
        }

        // ArrayList 정렬
        // Collections.sort() 이용
        // 오름차순
//        Collections.sort(arrayList);
        // 내림차순
//        Collections.reverse(arrayList);
        // compare() 메소드로 비교
        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // compareTo() 정수값을 반환, o1과 o2를 비교하여 같으면 0, o1이 크면 양수, 작으면 음수
                // 이 코드는 오름차순
                // return o2.compareTo(o1)  -> 내림차순
            }
        });

        for (int i=0;i< arrayList.size();i++) {
            System.out.print(arrayList.get(i)+" ");
        }




    }


    public static void main(String[] args) {
        Main1 main=new Main1();
        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();
        int arr_a[]=new int [a];

        for (int i=0;i<a;i++) {
            arr_a[i]=scan.nextInt();
        }

        int b=scan.nextInt();
        int arr_b[]=new int [b];

        for (int i=0;i<b;i++) {
            arr_b[i]=scan.nextInt();
        }

        main.solution(arr_a,arr_b,a+b);



    }
}
