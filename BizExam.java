public class BizExam {

    public static void main(String[] args) {
        BizService bz = new BizService();
        bz. bizMethod(10);
        try{
            bz. bizMethod(-5);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");    }
    
}


//try,catch 구문사용 후 메서드를 호.출.할 때 예외를 잘 처리하였으므로 프로그램은 그냥 종료하지 않고 예외를 처리하고, 다음 부분을 정상적으로 수행
//Checked Exception, UnChecked Exception 차이점: 각각 컴파일 시점에서 확인/런타임에서 확인
//처리여부:각각 반드시 예외처리/ 명시적으로 하지 않아도됨 (다음 것 , 프로그램 종료 정상적으로 나옴)
//트랙젝션처리 : 각각 예외 발생시 롤백하지 않음/ 롤백해야함.

//자바에서 예외는 RuntimeException을 상속하지 않고 꼭 처리해야 하는 Checked Exception과 
//반대로 명시적으로 처리하지 않아도 되는 Unchecked Exception로 구분할 수 있다.