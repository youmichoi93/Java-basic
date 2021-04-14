public class ExceptionExam3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        
        int k = divide(i, j);
        System.out.println(k);
    }    
    public static int divide(int i, int j) {
       if(j==0){
          throw new IllegalArgumentException("0으로 나눌 수 없습니다.");//(2) ->또한 try-catch-finally 사용하면 이걸 메인 메소드에 적어도됨



        //    System.out.println("두 번째 매개변수는 0이면 안 됩니다.");
        //    return 0;   //위 메세지와 0을 출력해버림,(1)따라서 직접오류발생시켜야함.
       }

        int k = i / j;
        return k;
    }
}