public class BusExam {

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.run();
        Bus bbang = new Bus();
        bus.bbang();

        Car car = new Car(); //부모 클래스 객체 찍기
        car.run(); // 부모클래스에 있는 함수 상속받아 호출 정상작동
        car.bbang(); //자식클래스에서 추가된 메소드는 Car객체에서 호출 오류
    }
        
}