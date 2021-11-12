// 누가 많이 뽑혔는지 -> 해시
// hashMap -> getOrDefault() : 찾는 키가 존재하면 해당 키의 값을 반환하고, 없으면 기본값을 반환함
// ex) hashMap.put(key,hashMap.getOrDefault(key,0)+1);

// hashMap Value 기준으로 정렬
// ArrayList의 sort를 사용하기 위해 List에 Map을 넣는다.
// Com

package inflearn.section4_hash;

import java.util.*;

public class Main1 {

    public String solution(int n,String str) {
        String answer="";


        // HashMap 이용
        HashMap<String,Integer> hashMap=new HashMap<>();

        // str -> string 배열로
        String[]strArr=str.split("");

        for (String key:strArr) {
            hashMap.put(key,hashMap.getOrDefault(key,0)+1);
        }



        // 가장 큰것 찾음
        // hashMap에 value를 기준으로 내림차순
        // List안에 Map을 넣는다.
        // Map.Entry는 -> 본래 맵에 key, value값  전체를 가진다. 이 부분을 hashMap.entrySet()을 이용해서 전체를 넣는다.
        List<Map.Entry<String,Integer>> entryList=new ArrayList<Map.Entry<String,Integer>>(hashMap.entrySet());
//        Collections.sort(entryList, new Comparator<Map.Entry<String, Integer>>() {
//            @Override
//            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        });

        // lambda를 이용한 정렬
        Collections.sort(entryList,(o1,o2)->(o2.getValue().compareTo(o1.getValue())));


        // 첫번째 인덱스를 꺼낸다?
        Map.Entry<String, Integer> stringIntegerEntry = entryList.get(0);
        answer=stringIntegerEntry.getKey();

        return answer;

    }


    public String solution2(int n,String str) {
        String answer="";


        // HashMap 이용
        HashMap<String,Integer> hashMap=new HashMap<>();

        // str -> string 배열로
        String[]strArr=str.split("");

        for (String key:strArr) {
            hashMap.put(key,hashMap.getOrDefault(key,0)+1);
        }

        int maxValue=Integer.MIN_VALUE;

        for (String s:strArr) {
            if (hashMap.get(s)>maxValue) {
                maxValue=hashMap.get(s);
                answer=s;
            }
        }

        return answer;

    }


    public static void main(String[] args) {
        Main1 main=new Main1();
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        String str=scan.next();

//        System.out.println(main.solution(n,str));

        System.out.println(main.solution2(n,str));


    }
}
