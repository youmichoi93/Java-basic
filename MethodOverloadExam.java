public class MethodOverloadExam { //MyClass2 함수를 테스트하기 위해 만든 클라스


    public static void main(String[]args){
        MyClass2 m = new MyClass2(); //클라스를 생성함

        System.out.println(m.plus(4, 5));
        System.out.println(m.plus(4, 6, 7));
        System.out.println(m.plus("hello", "world"));

    }
    
}
