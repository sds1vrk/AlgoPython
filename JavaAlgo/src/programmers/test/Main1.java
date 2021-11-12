package programmers.test;
import java.util.*;



public class Main1 {

     public String solution(String[] registered_list, String new_id) {


         char []ids=new_id.toCharArray();
         String en="";
         String num="";
         for (int i=0;i< ids.length;i++) {
             if (Character.isDigit(ids[i])) {
                 num+=ids[i];
             }
             else {
                 en+=ids[i];
             }
         }

         System.out.println(num);
         System.out.println(en);

         boolean check=false;

         ArrayList<String>arrayList=new ArrayList<>();

         for (String str:registered_list) {
             if (str.contains(en)) {
                 arrayList.add(str);
             }
         }
         System.out.println(arrayList);

         // arrayList중에서 숫자만 뽑아서 다시 정렬
         ArrayList<Integer> arrayList1=new ArrayList<>();
         for (String str:arrayList) {
             char temp[]=str.toCharArray();
             String tt="";

             for (int i=0;i< temp.length;i++) {
                 if (Character.isDigit(temp[i])) {
//                    arrayList1.add(Character.getNumericValue(temp[i]));
                     tt+=temp[i];
                 }
             }
             if (!tt.equals("")) arrayList1.add(Integer.parseInt(tt));

         }
         Collections.sort(arrayList1);
         System.out.println(arrayList1);

         int kk=arrayList1.get(0);
             for (int ii:arrayList1) {
                 if (kk==ii) {
                     kk+=1;
                 }
                 else {
                     break;
                 }
             }



         System.out.println("kk"+kk);





         String answer="";
         return answer;
    }





    public static void main(String[] args) {
        Main1 main =new Main1();
//        Scanner scan=new Scanner(System.in);

        String strArr[]={"card", "ace13", "ace16", "banker", "ace17", "ace14"};
        main.solution(strArr,"ace15"); //ace15

//        String strArr[]={"cow", "cow1", "cow2", "cow3", "cow4", "cow9", "cow8", "cow7", "cow6", "cow5"};
//        main.solution(strArr,"cow"); //cow10


//        String strArr[]={"bird99", "bird98", "bird101", "gotoxy"};
//        main.solution(strArr,	"bird98"); //bird100


    }
}


