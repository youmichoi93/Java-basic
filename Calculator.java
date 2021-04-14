public interface Calculator {
    public int plus(int i, int j);
    public int multiple(int i, int j);

    
    

    default int exec(int i, int j) {
        return i + j;
    }


    public static int exec2(int i, int j) {
        return i * j; //디폴트,,, static로 해서 인터페이스에서 메소드를 변경하더라도 사용가능,
    }
}


// 인터페이스에서 static 메서드 사용시
 //인터페이스를 이용해 간단한 기능을 가진 유틸리티성 인터페이스를 만들 수 있음.