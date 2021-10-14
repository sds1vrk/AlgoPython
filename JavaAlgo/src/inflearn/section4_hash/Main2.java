// 아나그램 -> hashMap 이용

package inflearn.section4_hash;

import java.util.*;

public class Main2 {

    public String solution(String str1,String str2) {


        // String -> String[]로 변환
        String []str1Arr=str1.split("");
        String []str2Arr=str2.split("");

        // 아나그램 -> 갯수확인
        HashMap<String,Integer>hashMap1=new HashMap<>();
        HashMap<String,Integer>hashMap2=new HashMap<>();

        // 각 갯수 더해준다
        for (String s:str1Arr) {
            hashMap1.put(s,hashMap1.getOrDefault(s,0)+1);
        }

        for (String s:str2Arr) {
            hashMap2.put(s,hashMap2.getOrDefault(s,0)+1);
        }

        String answer="YES";

        // 길이는 같음
        for (String key:hashMap1.keySet()) {
            if (hashMap2.containsKey(key) && hashMap2.get(key)==hashMap1.get(key)) {
                continue;
            }
            else {
                answer="NO";
                break;
            }
        }

        return answer;

    }


    public static void main(String[] args) {
        Main2 main=new Main2();
        Scanner scan=new Scanner(System.in);

        String str1=scan.next();
        String str2=scan.next();

        System.out.println(main.solution(str1,str2));



    }
}