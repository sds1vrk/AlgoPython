package inflearn.section5_stackQueue;


import java.util.*;

class Patient {
    int idx;
    int value;

    public Patient(int idx, int value) {
        this.idx = idx;
        this.value = value;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}


public class Main8 {

    public int solution(int n, int idx, int[]arr) {
        int answer=0;

        // Queue에 저장할때 idx하고 그 값을 저장하자
        Queue<Patient>queue=new LinkedList<>();

        for (int i=0;i<arr.length;i++) {
            Patient patient=new Patient(i,arr[i]);
            queue.offer(patient);
        }

        while (!queue.isEmpty()) {
            Patient patient=queue.poll();
            int idxx=patient.getIdx();
            int values=patient.getValue();

            // 다시 for문 돌아서 만약 큰게 있으면
            boolean check=true;
            int next_idx=0;
            int next_value=0;
            for (Patient p1:queue) {
                next_idx=p1.getIdx();
                next_value=p1.getValue();

                if (values<next_value) {
                    check=false;
                    queue.add(patient);
                    break;
                }
            }
            // 출력
            if (check) {
                answer++;
                if (idx==idxx) {
                    break;
                }
            }
        }
        System.out.println(answer);
        return answer;

    }


    public static void main(String[] args) {
        Main8 main=new Main8();
        Scanner scan=new Scanner(System.in);

        int n=scan.nextInt();
        int idx=scan.nextInt();

        int arr[]=new int[n];

        for (int i=0;i<n;i++) {
            arr[i]=scan.nextInt();
        }

        main.solution(n,idx,arr);


    }
}
