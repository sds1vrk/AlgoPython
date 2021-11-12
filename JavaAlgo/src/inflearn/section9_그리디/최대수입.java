package inflearn.section9_그리디;

// 알게 된점..
// priority큐를 사용할떄는 안에 될수 있으면 Integer값만 넣도록 하자
// 그리고 반드시 !Empty를 사용하자

// 2중 for문 돌때 변수 j를 바깥으로 빼놓놓고 break를 걸면 다시 돌아갈때 증가안한 상태로 된다!


import java.util.*;

class Fee {
    int date;
    int fee;
    Fee(int date, int fee) {
        this.date=date;
        this.fee=fee;
    }
}

public class 최대수입 {

    public void solution(int n, ArrayList<Fee>arrayList) {

        // pq에는 클래스를 못넣는구나!
        PriorityQueue<Integer>priorityQueue=new PriorityQueue<>(Collections.reverseOrder());
        int maxDate=arrayList.get(0).date;
//        System.out.println("maxDate"+maxDate);
        int answer=0;

        // 3일차에 먼저 진행해서 역순으로 하면 1일차에 큰게 와도 할 수 있다.
        int j=0;
        for (int i=maxDate;i>=1;i--) {

            // j를 바깥에 뺴놓아서 처음부터 안돌게 하는것도 중요
            for ( ;j< arrayList.size();j++) {
                int nextDate=arrayList.get(j).date;
                if (i>nextDate) {
//                    System.out.println("j"+j);
                    break;
                }
                else {
                    // 어떻게 50을 넣을수가 있찌?! // 아.. break에 걸리고 멈추면서 j는 그냥 고정이 되는구나.. (증가안하고..)
//                    System.out.println(arrayList.get(j).fee);
                    priorityQueue.add(arrayList.get(j).fee);
                }
            }

            if (!priorityQueue.isEmpty()) {
                answer+=priorityQueue.poll();
            }
        }





        System.out.println(answer);
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        ArrayList<Fee> arrayList=new ArrayList<>();

        for (int k=0;k<n;k++) {
            int fee=scanner.nextInt();
            int date= scanner.nextInt();
            Fee m1=new Fee(date,fee);
            arrayList.add(m1);
        }

        // ArrayList 정렬, date날짜 역순으로
        Collections.sort(arrayList, new Comparator<Fee>() {
            @Override
            public int compare(Fee o1, Fee o2) {
                return o2.date-o1.date;
            }
        });

//        for (int i=0;i< arrayList.size();i++) {
//            Fee fee= arrayList.get(i);
//            System.out.println(fee.date+" "+fee.fee);
//        }

        최대수입 m1=new 최대수입();
        m1.solution(n,arrayList);

    }
}
