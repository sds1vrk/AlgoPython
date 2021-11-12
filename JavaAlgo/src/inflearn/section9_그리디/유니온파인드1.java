package inflearn.section9_그리디;
import java.util.*;
// 친구 인가 문제
// 유니온 파인드
// 1. n명의 친구 만큼 배열을 만든다 -> 이떄 배열은 각 번호로 한다
        //int arr[]=new int[n+1];
        //for (int i=1;i<=n;i++) {
        //    arr[i]=i;
        // }

// 2. find 메서드를 만든다
//public void find(int v) {
//    // 속해있는 집합과 현재 노드가 같으면 return
//    if (v==arr[v]) return v;
//    // 다르면 타고타고 넘어가서 배열에 저장해줘라! // 배열에 저장하면 경로압축이 된다.
//    else return arr[v]=find(arr[v]);
//}


// 3. Union 메서드를 만든다
//public void union(int a,int b) {
    // fa, fb가 의미하는것은 속해있는 집합
    //    int fa=find(a);
    //    int fb=find(b);
    // 만약 속해있는 집합이 다르면 하나로 만들어줘라!
    //    if (fa!=fb) arr[fa]=fb;
    //
//  }

public class 유니온파인드1 {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap=new HashMap<>();
        hashMap.put("asdf",hashMap.getOrDefault("asd",0)+1);
        String tesmp="asd";
        tesmp.equals("asdf");

        String[]temp={"1","23","4"};
        StringBuilder sb=new StringBuilder();

//        temp[0]

    }
}
