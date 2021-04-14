public class MyCalTest {

    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3,4);
        int i = cal.exec(5,6);
        System.out.println(i);

        Calculator.exec2(3,4);//인터페이스에서 메소드 변경(exec2)추가 하였음, cal.exec2가 아니라 인터페이스명.메소드명 해야함.

    }

    
}
