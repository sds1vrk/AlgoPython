package fasoo;
// 가장 큰 수 만들기
// 배열의 경우에는
// Arrays.sort(배열, new Comparator<String>() {
//    @Override
//    public int compare(String o1,String o2) {
//        return (o2+o1).compareTo(o1+o2);
//     }

import java.util.*;
public class nhnTest2 {
    static int n;
    static String arr[];
    static ArrayList<Integer>arrayList;

    public void solution(String arr[]) {

        String ss="test";
        char vv='E';
        ss.toLowerCase();
        char []temp=ss.toCharArray();
//        Integer[]tt=new Integer[3];
//        Arrays.sort(temp,Collections.reverseOrder());

//        Collections.sort(temp,Collections.reverseOrder());


        String answer="";
        answer+=ss.charAt(0);
        StringBuilder sb=new StringBuilder();
        char s='2';
//        Character.getNumericValue()

//        arrayList.co
//        arrayList.removeAll()

        Integer.valueOf(1);
        // 가장 큰 수 구하기
        System.out.println(Arrays.toString(arr));
        // arr : [2, 9, 10, 21, 24]
       Arrays.sort(arr, new Comparator<String>() {
           @Override
           public int compare(String o1, String o2) {
//               System.out.println("test1");
               System.out.println("o1: "+o1+" o2: "+o2);
//               System.out.println("o2+o1: "+o2+o1);
               int k=(o2+o1).compareTo(o1+o2);  // 아스키 코드의 차이를 return 함
               System.out.println("k:"+k);
               return k; // 내림차순 정렬
           }
       });

       String maxAns="";
       for (int i=0;i<arr.length;i++) {
           maxAns+=arr[i];
       }
        System.out.println("max: "+maxAns);

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//               System.out.println("test1");
                System.out.println("o1: "+o1+" o2: "+o2);
//               System.out.println("o2+o1: "+o2+o1);
                int k=(o1+o2).compareTo(o2+o1);  // 아스키 코드의 차이를 return 함
                System.out.println("k:"+k);
                return k; // 오름차순 정렬
                // 92 29 -> 92를 뒤로 보냄
            }
        });

        String minAns="";
        for (int i=0;i<arr.length;i++) {
            minAns+=arr[i];
        }
        System.out.println("min "+minAns);

        int ans=0;
        ans=Integer.parseInt(maxAns)+Integer.parseInt(minAns);
        System.out.println(ans);







    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        n=scan.nextInt();
        scan.nextLine();
//        scan.nextInt();
//        arr=new int[n];
        String temp="";
        temp=scan.nextLine();

        arr=temp.split(" ");



        arrayList=new ArrayList<>();

        nhnTest2 m1=new nhnTest2();
        m1.solution(arr);


    }
}
