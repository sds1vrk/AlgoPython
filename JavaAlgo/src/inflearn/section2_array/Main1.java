// 큰수 출력하기
// for문으로 앞에꺼랑 비교
// 자기보다 크면 str에 저장

package inflearn.section2_array;
import java.util.*;

public class Main1 {

    public int[] solution(int num,String[] str) {


        // Array의 첫번째 인자, string -> int
        int tmp=Integer.parseInt(str[0]);

        // 저장되는것은 동적이기 때문에 arrayList사용
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(tmp);

        // for문 돌면서 다음꺼랑 비교
        for (int i=1;i<num;i++) {
            // 앞에꺼랑 비교 [1] [0]
            int next=Integer.parseInt(str[i]);

            if (next>tmp) {
                arrayList.add(next);
            }
            tmp=next;
        }

        // arrayList -> array로 변경
        int []answer=new int[arrayList.size()];
        for (int i=0;i<arrayList.size();i++) {
            answer[i]=arrayList.get(i);
        }


        return answer;

    }


    public static void main(String[] args) {
        Main1 main=new Main1();
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        scan.nextLine(); // 개행 문자 제거
        String str=scan.nextLine();

        // 입력받은 문자열을 공백 기준으로 나눈다.
        String []test=str.split(" ");
        System.out.println(Arrays.toString(test));

        main.solution(num,test);
        // 전달받은 인자가 array이기 때문에 for문으로 받는다.
        for (int i:main.solution(num,test)) {
            System.out.print(i+" ");
        }
    }
}
