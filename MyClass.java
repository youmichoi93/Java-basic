public class MyClass {
    // public 리턴형 메서드명 (매개변수들) { 필요한 기능 구현 }
    public void method1() {
        System.out.println("m1이 실행됨..");
    }
    
    public void method2(int x) {
        System.out.println(x +"을 이용한 m2 실행");
    }
    
    public int method3() {
        System.out.println("m3 실행");
        return 10;
    }
    
    public void method4(int x, int y) {
        System.out.println(x + y + "m4 실행");
    }
    
    public int method5(int y) {
        System.out.println(y + "이용한 m5 실행");
        return y*2; 
    }
}