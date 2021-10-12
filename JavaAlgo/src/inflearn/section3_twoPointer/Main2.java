package inflearn.section3_twoPointer;


import java.util.*;

public class Main2 {

    public void solution(int arr[],int brr[]) {
        // 풀이 방법
        // 1. sort
        // 각 배열의 lt ,rt 를 구함
        // 2중 while 문

        Arrays.sort(arr);
        Arrays.sort(brr);


        int lt=0;
        int rt=arr.length-1;

        int b_lt=0;
        int b_rt=brr.length-1;

        ArrayList<Integer>arrayList=new ArrayList<>();

        while (lt<=rt) {

            int k1=arr[lt];

            while (b_lt<=b_rt) {

                if (k1<brr[b_lt]) {
                    lt++;
                    break;
                }
                else if (k1==brr[b_lt]) {
                    // 둘다 증가
                    lt++;
                    b_lt++;

                    //save
                    arrayList.add(k1);
                    break;
                }
                else {
                    b_lt++;
                }

                // 문제는 lt가 더이상 증가가 없어서 무한 for문 돌음 -> lt를 증가시켜야됨
                if (b_lt==b_rt) {
                    lt++;
                }
            }
        }

//        System.out.println(arrayList.toString());
        for (int i=0;i< arrayList.size();i++) {
            System.out.print(arrayList.get(i)+" ");
        }
    }


    // 강사님 풀이 방법
//     while 문 1개만 씀
//     1. 두 배열 정렬
//     2. 핵심 포인트는 while 문 종료시키는 조건 -> 둘중 하나만 lt가 넘어도 종료 while (p1<n && p2<m) -> 이걸 생각
//     3. 1 2 3 4 5
//        2 3 4 5
//     brr이 크면 arr의 위치 1 증가
//     arr이 크면 brr의 위치 1 증가
    public void solution2(int n,int m,int arr[],int brr[]) {

        // 정렬
        Arrays.sort(arr);
        Arrays.sort(brr);

        int p1=0;
        int p2=0;

        ArrayList<Integer>arraylist=new ArrayList<>();

        // 둘중 한개만 만족해도 종료
        while (p1<n && p2<m) {
            // 같으면 둘자 p1, p2 증가
            if (arr[p1]==brr[p2]) {
                arraylist.add(arr[p1]);
                p1++;
                p2++;
            }

            else if (arr[p1]>brr[p2]) {
                p2++;
            }
            else {
                p1++;
            }
        }
        for (int i=0;i< arraylist.size();i++) {
            System.out.print(arraylist.get(i)+" ");
        }


    }


    public static void main(String[] args) {
        Main2 main=new Main2();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr_a[]=new int[n];
        for (int i=0;i< n;i++) {
            arr_a[i]=scan.nextInt();
        }

        int m=scan.nextInt();
        int arr_b[]=new int[m];
        for (int i=0;i<m;i++) {
            arr_b[i]=scan.nextInt();
        }


//        main.solution(arr_a,arr_b);
        main.solution2(n,m,arr_a,arr_b);



    }
}
