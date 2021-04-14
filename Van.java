public class Van extends Car {
    public void bang(){
        // super.run(); // 부모클라스의 함수를 super키워드로 호출하니 car와 van의 함수 모두 호출 됨.
        System.out.println("빵빵");
    }
    
}
