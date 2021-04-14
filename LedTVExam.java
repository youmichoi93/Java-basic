public class LedTVExam {
    public static void main (String[]args){

        TV tv = new LedTV(); //참조 변수의 타입으로 인터페이스를 사용가능(여기서는 인터페이스TV)
        tv.turnOn();
        tv.turnOff();
        tv.changeVolume(8);
        tv.changeChannel((39));
        tv.turnOff();

        //인터페이스가 가진 메소드만 사용할 수 있다.


    }
    
}
