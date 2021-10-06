// 문제 해결
/* 시간 복잡도 : n^2
    1. 찾을려고 하는 문자의 인덱스를 arraylist에 저장
        // e의 위치를 다 저장
    2. 문자열의 인덱스를 하나씩 꺼내면서 arraylist에 저장되어 있는 것과 abs(절대값)비교 후 짧은 것 찾음
    3. 찾은 값을 배열에 저장
 */

/*
    - 알고리즘은 왼쪽의 타겟과 비교 후 오른쪽의 타겟과의 거리를 비교
    - 이떄 p값을 1000으로 설정하여 가장 e가 멀리 있다고 가정하는게 중요

    시간 복잡도 : n
    1. p를 가장 먼 값 이라고 생각 p=1000
    왼쪽부터 탐색
    찾을려고 하는 값이 target과 같으면 p를 0으로 초기화
    다르면 p를 1증가

    2. 오른쪽부터 탐색
    p=1000
    찾을려고 하는 값이 target과 같으면 p를 0으로 초기화
    다르면 p를 증가시키고 기존 왼쪽 탐색의 있는 값과 비교 (둘중 가장 작은것 선택)

 */


package inflearn.section1_string;
import java.util.*;

public class Main10 {


    public void solution1(String str) {

        String []temp=str.split(" ");
        // temp[0] -> 문자열, temp[1] -> 문자

//        int []dis=new int[temp[0].length()];
        String answer="";

        char []arr_temp=temp[0].toCharArray();
        char e=temp[1].charAt(0);


        // e의 위치 인덱스
        ArrayList<Integer>arr=new ArrayList<>();
        for (int i=0;i<arr_temp.length;i++) {
            if (arr_temp[i]==e) {
                arr.add(i);
            }
        }

        for (int i=0;i<arr_temp.length;i++) {

            int tmp=Integer.MAX_VALUE;
            for (Integer j:arr) {
                int k=Math.abs(i-j);
                if (tmp>k) {
                    tmp=k;
                }
            }
            // Int ->String
            answer+=Integer.toString(tmp)+" ";
        }
        answer=answer.trim();
        System.out.println(answer);

    }

    public void solution2(String str) {

        String []temp=str.split(" ");
        String answer="";

        char []arr_temp=temp[0].toCharArray();
        char e=temp[1].charAt(0);

        int [] ans=new int[arr_temp.length];

        // 왼쪽부터 탐색
        int p=1000; // 처음 가장 끝에 있는 target 거리라고 생각
        for (int i=0;i< arr_temp.length;i++) {

            if (arr_temp[i]==e) {
                // p를 0으로 초기화하고 arr_te
                p=0;
            }

            else {
                // p를 증가
               p++;
            }
            ans[i]=p;
        }
        // 출력
        System.out.println(Arrays.toString(ans)); //[1001, 0, 1, 2, 3, 0, 1, 2, 3, 4, 0]

        // 오른쪽부터 탐색
        p=1000;
        for (int i= arr_temp.length-1;i>=0;i--) {
            if (arr_temp[i]==e) {
                p=0;
            }
            // 다르면 p를 증가시키고 기존값과 비교한다음에 그 중 작은 값을 ans에 넣는다.
            else {
                p++;
                int val=Math.min(p,arr_temp[i]);
                ans[i]=val;
            }
        }
        System.out.println(Arrays.toString(ans));

    }


    public static void main(String[] args) {
        Main10 main =new Main10();
        Scanner scan=new Scanner(System.in);
//        main.solution1(scan.nextLine());


        main.solution2(scan.nextLine());


    }
}
