
public class ExceptionExam {

    public static void main(String[] args) {
        int i = 10;
        int j = 2;
        try{
            int k = i/j;
            System.out.println(k);
        }catch(Exception e) {
            System.out.println("0으로 나눌 수 없습니다."+e.toString());    
        }finally{
            System.out.println("예외와 상관없이 무조건 실행!");    
        }
        System.out.println("main end!!");
    }
}

//모든 예외 객체는 Exception 클래스를 상속받음./catch(Exception e)
//예외처리를 하므로서 오류 발생시 프로그램을 종료하지 않고 실행을 이어가게 해줌.