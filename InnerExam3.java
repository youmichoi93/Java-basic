public class InnerExam3 {

    public void exec() { 
        class Cal{
            int value = 0;
            public void plus() {    //중첩클래스: 내부클래스를 메소드안에 선언
                value++;
            }

    }
        Cal cal = new Cal();  //메서드 안에서 객체 생성
        cal.plus();  //객체가 가진 메서드호출
        System.out.println(cal.value);  //메서드가 가진 value를 호출해 출력 
    }
    public static void main(String[] args) {
        InnerExam3 t = new InnerExam3();
        t.exec();

    
  }
}


//지역클래스 : 클래스를 메서드 안에서 지역변수처럼 사용할 수 있음.