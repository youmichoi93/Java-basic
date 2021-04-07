public class Test {

    //1.입력과 출력이 모두 있는 메소드
    public int sum(int a, int b) {
        return a+b;   //메소드
    }

    //2.입력이 없는 메소드
    public String say(){
        return "Hi";
    }

    //3.입력은 있고 출력은 없는 메소드 (리턴이 없으면 출력이 없다)
    //리턴자료형이(퍼블릭 옆) void면 리턴문 필요없음.
    public void sum2(int a,int b) {
        System.out.println(a+"과"+b+"의 합은" +(a+b)+"입니다.") ;
    }   //나온 결과는 출력이 아니라, 여기 프린트에서 찍힌 것.

    //4.입력도 출력도 없는 메소드
    //마찬가지로 retrun문 없고 hi나온것은 찍으라해서 찍은 것일뿐 출력되지는 않음
    public void say2() {
        System.out.println("Hi") ;
    }



    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Test myTest = new Test();  //객체생성
        int c = myTest.sum(a, b);  //숫자 변수 c에 메소드를 할당

        System.out.println(c); //메소드의 결과값 출력
        String d = myTest.say();
        System.out.println(d);
        myTest.sum2(3,4);
        myTest.say2();
    }
}
