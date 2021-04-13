//abstract은 리턴형 앞에 적어줌
public abstract class Bird { //추상클래스는 부모클래스는 가능 but 객체는 될 수없음
    public abstract void sing();     //장점: 비들기, 참새등 비슷한 것을 만들때 추상클래스를 부모로해서 상속시키면됨.
    public void fly() {
        System.out.println("flyyyyy");
    }

}


// 추상 클래스를 상속한 클래스는 추상 클래스가 가진 추상 메서드를 반드시 구현해야함. 하나라도 구현하지 않으면 그 클래스도 추상 클래스가됨.

// 메서드 안에 아무런 내용이 없더라도 {} 중괄호를 열고 닫으면, 컴파일러는 메서드를 구현했다고 판단