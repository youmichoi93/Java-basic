public class MyClass2 {
    public int plus (int x, int y){
    return x+y; //정수 두개 받아 두 정수를 더한 뒤 리턴하는 메소드
    }

    public int plus (int x, int y, int z){
        return x+y+z; //정수 세개 받아 새 정수를 더한 뒤 리턴하는 메소드
    }

    public String plus (String x, String y){
        return x+y; // 두 문자열을 받아 더한 뒤 리턴하는 메소드
    }

    
}

// 메소드 오버로딩 : 3메소드 모두,하는 역할이 같음. 따라서 메소드명을 똑같이 할 수 있음.
//주의: 자료형과 매개변수  , 1번 2번 처럼 자료형 같고 매개변수 다르면 ok, 1,3번 처럼 매개변수 같지만 자료형이 다르게 때문에 ok, 
//반.드.시 자료형이 달라야함(매개변수명이 다르다고 해서 다르다고 판별하지 않음.)