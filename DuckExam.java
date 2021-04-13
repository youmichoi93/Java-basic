public class DuckExam {
    public static void main(String[]args) {
        Duck duck = new Duck();
        duck.sing();
        duck.fly();

        Bird bird = new Bird();
        bird.fly(); //오류발생, bird추상 클래스는 부모로 사용가능 but객체생성 안됨.

    }
    
}
