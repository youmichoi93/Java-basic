public class ExceptionExam2 {



    public static void main(String[] args) {
        ExceptionExam2 d = new ExceptionExam2();
        int a = 10;
        int b = 0;

        try{
        int k = divid(a,b);
        System.out.println(k);
        }catch(ArithmeticException e){
            System.out.println(e.toString());
        }  //실행결과 예외가 발생해 프로그램을 종료하는 것이 아니라 예외를 잘 처리

    }



    //throws : 호출한 쪽에서 예외를 처리하라고 넘기는 키워드 (아래처럼 여러개 가능, 다만 Exception이라고 하면 모든 처리가능)
    public static int divid(int a, int b) throws ArithmeticException,ClassCastException{
        int k = a/b;
        return k;

    }
    
}
