package inflearn.section4_hash;

// 트리 셋
// 중복 제거 + 순서대로 정렬해서 나열해줌
// TreeSet<Integer>treeSet=new TreeSet<>(); // 오름차순 정렬
// TreeSet<Integer>treeSet=new TreeSet<>(Collections.reverseOrder()); // 내림차순
// TreeSet 인덱스 접근
// 첫번째와 마지막 인덱스만 접근 가능
//treeSet.first();
//treeSet.last();

// n개 중에 3개 선택하여 합 구하는 방법 -> 3중 for문을 이용 (굳이 dfs 할 필요 없음)

import java.util.*;

public class Main5 {

    public int solution(int n,int m,int arr[]) {
        int answer=-1;

//        TreeSet<Integer>treeSet=new TreeSet<>(); // 오름차순 정렬
        TreeSet<Integer>treeSet=new TreeSet<>(Collections.reverseOrder()); // 내림차순

        // nPr 구하기 -> r중 for문을 돌면 됨
        for (int i=0;i<n;i++) {
            for (int j=i+1;j<n;j++) {
                for (int k=j+1;k<n;k++) {
                    int hap=arr[i]+arr[j]+arr[k];
                    treeSet.add(hap);
                }
            }
        }

        // TreeSet은 기본적으로 인덱스가 없기 때문에 -> forEach를 통해서 값을 뽑아야 함
        int i=0;
        for (Integer s:treeSet) {
            i++;
            if (i==m) {
                answer=s;
            }
        }
        return answer;

    }


    public static void main(String[] args) {
        Main5 main=new Main5();
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int m=scan.nextInt();

        int arr[]=new int[n];
        for (int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }

        System.out.println(main.solution(n,m,arr));




    }
}
