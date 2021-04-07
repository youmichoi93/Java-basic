public class Test2 {
    public int vartest(int a){
        a++;
        return a;
    }


    public static void main(String[] args){
        int a = 1;
        Test2 myTest = new Test2();
        a = myTest.vartest(a);
        System.out.println(a);
    }
}
