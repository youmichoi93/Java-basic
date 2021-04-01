public class ifexam {
    public static void main(String args[]) {
        String a= "hello";
        String b= "java";
        String c= "hello";
        String d= new String("hello");
        //new String 이름이 같은 새로운 객체 hello생김 ,a랑 d랑 같지 않음.(둘의 id는 다름)
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a == c);  //a 와 c는 같지만
        System.out.println(a == d); //a 와 d는 다르다
        System.out.println(a.equals(d)); //하지만 글자 자체는 a와 d는 'hello'로 같다.
        //글자 자체를 비교할땐 .equals를 사용

        System.out.println(System.identityHashCode(a));  //주소값 확인
        System.out.println(System.identityHashCode(d)); //둘이 다른 주소로 찍힘.





    }
}
