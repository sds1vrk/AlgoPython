// 피보나치 수열
// a[n] = a[n-1] + a[n-2]
package inflearn.section2_array;

import java.util.*;

public class Main4 {

    public ArrayList<Integer> solution(int num) {
        ArrayList<Integer> arrayList=new ArrayList<>();

        arrayList.add(1);
        arrayList.add(1);

        for (int i=2;i<num;i++) {
            int val=arrayList.get(i-1)+arrayList.get(i-2);
            arrayList.add(val);
        }

        return arrayList;

    }


    public static void main(String[] args) {
        Main4 main=new Main4();
        Scanner scan=new Scanner(System.in);

        for (int i:main.solution(scan.nextInt())) {
            System.out.print(i+" ");
        }

    }
}
