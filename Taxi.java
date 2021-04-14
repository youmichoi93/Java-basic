import jdk.tools.jlink.resources.plugins;

public class Taxi implements Meter{

    public int BASE_FARE = 3000; 

    //원래 인터페이스에 있었음
    //인터페이스에 선언한 변수는 무조건 상수로 처리.
    //이렇게 선언한 변수는 실행 중에 값을 바꿀 수 없음.
    // 실행 중에 값을 바꾸고 싶다면 그걸 구현하는 클라스로 옮기기.

 
    public void start(){  
        System.out.println("운행을 시작합니다.");


    }  


    public int stop(int distance){
        int fare = BASE_FARE + distance *2;
        System.out.println("운행을 종료합니다. 요금은 " + fare + "원 입니다.");
        return fare;

    }


    
}
