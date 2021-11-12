package fasoo;

import java.util.HashMap;

public class test {
    public static void main(String[] args) {

        String test="aabbccddeefasdfabc";

        // replace 사용
        String result1=test.replace("abc","5");
        System.out.println(result1); //aabbccddeefasdf5

        // replaceAll 사용
        String result2=test.replaceAll("[a,b,c]","5"); // [a,b,c]는 정규식 표현 : 안에 들어간 모든 문자
        System.out.println(result2); //555555ddeef5sdf555

        // 만약 replace로 555555ddeef5sdf555로 나타내려면 너무 지저분함
        String result3=test.replace("a","5").replace("b","5").replace("c","5");
        System.out.println(result3); //555555ddeef5sdf555

        // replaceAll 정규식 표현 [^0-9]
        // 숫자가 아닌것은 전부 공백으로 바꿔라
        String test2="!@#$0022!#$$%asdfasdf1234";
        String result4=test2.replaceAll("[^0-9]","");
        System.out.println(result4); //00221234

        HashMap<String,Integer>hashMap=new HashMap<>();
        hashMap.put("sadf",23);
//        hashMap.containsKey()


    }

}
