package inflearn.section4_hash;

// 매출액의 종류
// 슬라이싱 윈도우 + hashMap

import java.util.*;

public class Main3 {

    public void solution(int n,int m,int []arr) {

        ArrayList<Integer>arrayList=new ArrayList<>();

        // 초기값
        for (int i=0;i<m;i++) {
            arrayList.add(arr[i]);
        }
        // 첫번째 값 확인
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int i=0;i< arrayList.size();i++) {
            hashMap.put(arrayList.get(i),hashMap.getOrDefault(arrayList.get(i),0)+1);
        }

        System.out.print(hashMap.keySet().size()+" ");

        // 슬라이싱 윈도우 for문
        // arraylist를 사용하는 이유는 인덱스 접근이 자유롭기 때문에
        for (int i=m;i<n;i++) {

            // 처음 값 빼주기
            int temp=arrayList.remove(0);
            int value=hashMap.get(temp)-1;
            hashMap.put(temp,value);

            if (value==0) {
                hashMap.remove(temp);
            }

            // 이 부분으로 인해 시간초과 발생 -> 이슈
//            hashMap=new HashMap<>();
//            for (int j=0;j< arrayList.size();j++) {
//                hashMap.put(arrayList.get(j),hashMap.getOrDefault(arrayList.get(j),0)+1);
//            }

            // 다음 값 더해주기
            int key=arr[i];
            hashMap.put(key,hashMap.getOrDefault(key,0)+1);
            arrayList.add(key);
            System.out.print(hashMap.keySet().size()+" ");

        }

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

        main.solution(n,m,arr);


    }
}
