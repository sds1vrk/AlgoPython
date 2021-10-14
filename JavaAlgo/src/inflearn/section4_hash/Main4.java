//  모든 아나그램 찾기
// 슬라이싱 윈도우 + hash
// hash를 쓰는 이유는 개수를 찾아 -> 아나그램을 찾기 위해 사용
// 두개의 hashMap이 같은지 비교 -> hashMap1.eqauls(hasMap2) -> 복잡하게 check 해줄 필요 없다.

// 알게 된점 : 두개의 해시맵 비교


package inflearn.section4_hash;

import java.util.*;

public class Main4 {


    public int solution(String str, String ans) {
        int answer=0;

        // 슬라이싱 윈도우 -> 초기값 설정
        // String -> String []
        String strArr[]=str.split("");
        String ansArr[]=ans.split("");

        int size=ans.length();

        // arraylist에 넣기, 인덱스 접근하기 위해
        // 초기값 3개만 들어감
        // 초기값 -> 아나그램인지 검사
        HashMap<String,Integer>hashMap=new HashMap<>();
        HashMap<String,Integer>ansMap=new HashMap<>();
        ArrayList<String>arrayList=new ArrayList<>();
        for (int i=0;i<size;i++) {
            arrayList.add(strArr[i]);
            hashMap.put(strArr[i],hashMap.getOrDefault(strArr[i],0)+1);
            ansMap.put(ansArr[i],ansMap.getOrDefault(ansArr[i],0)+1);
        }

        // 초기값 hashMap과 ansHashMap 비교 -> eqauls로 비교 가능
        if (hashMap.equals(ansMap)) {
            answer++;
        }

        // 슬라이싱 윈도우 -> for 문 이용
        for (int i=size;i<str.length();i++) {
            // 초기값 삭제
            String temp=arrayList.remove(0);
            int value=hashMap.get(temp)-1;
            // 0이면 hashMap에서 지우기
            if (value==0) {
                hashMap.remove(temp);
            }
            else {
                // 만약 그렇지 않으면 지운값 -> Map에 넣기
                hashMap.put(temp,value);
            }

            // 자동으로 줄일수 있는 방법이 있는가?
            // hashMap.put으로 넣지 말고?!


            // 다음값을 더해준다.
            String key=strArr[i];
            arrayList.add(key);
            // hashMap에도 더해준다
            hashMap.put(key,hashMap.getOrDefault(key,0)+1);

            // 아나그램 비교
            if (hashMap.equals(ansMap)) {
                answer++;
            }

        }
        return answer;

    }


    // 두번째 방법 -> 처음 2개만 더해주고 +1 -> 비교
    // 투포인터 + 슬라이싱 윈도우를 사용
    public int solution2(String str, String ans) {
        int answer=0;
        String []strArr=str.split("");
        String []ansArr=ans.split((""));
        HashMap<String,Integer>hashMap=new HashMap<>();
        HashMap<String,Integer>ansMap=new HashMap<>();

        for (String s:ansArr) {
            ansMap.put(s,ansMap.getOrDefault(s,0)+1);
        }

        // 초기에 슬라이싱 윈도우는 ans보다 1개 작은것 까지만 넣어줌
        for (int i=0;i< ansArr.length-1;i++) {
            hashMap.put(strArr[i],hashMap.getOrDefault(strArr[i],0)+1);
        }

        // 투포인터 및 슬라이싱 윈도우
        int lt=0; // lt가 가리키는 것은 삭제할 인덱스를 가르킴
        for (int rt=ansArr.length-1;rt< strArr.length;rt++) {
            // 처음 값을 넣어줌
            String key=strArr[rt];
            hashMap.put(key,hashMap.getOrDefault(key,0)+1);

            // 이 값이 ansMap이랑 같은지 비교
            if (hashMap.equals(ansMap)) {
                answer++;
            }

            // 초기 값 삭제
            int value=hashMap.get(strArr[lt])-1;
            if (value==0) {
                hashMap.remove(strArr[lt]);
            }
            else {
                hashMap.put(strArr[lt],value);
            }

            if (hashMap.equals(ansMap)) {
                answer++;
            }

            // 다음 인덱스를 위해 lt 증가
            lt++;
        }



        return answer;
    }


    public static void main(String[] args) {
        Main4 main=new Main4();
        Scanner scan=new Scanner(System.in);
        String str=scan.next();
        String ans=scan.next();

//        System.out.println(main.solution(str,ans));
        System.out.println(main.solution2(str,ans));



    }
}