package fasoo;

public class Test2 {

    public static void main(String[] args) {

        TT tt=new TT();
        tt.test();


    }
}

class TT {
    int var=10;

    void test() {
        int var=20;
        System.out.println(var); // 20
        System.out.println(this.var); //10
    }

}