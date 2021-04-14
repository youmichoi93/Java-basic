public class InnerExam1 {
    class Cal{ //클라스안에 클라스
        int value = 0;  //필드선언
        public void plus() {   //메서드정의
            value++;
        }
    }

    public static void main(String[] args) {
        InnerExam1 t = new InnerExam1(); //inner클래스 객체 먼저 만들어야 cal클래스 객체 만들 수 있음.
        InnerExam1.Cal cal = t.new Cal();//바깥클래스타입, 내부타입
        cal.plus();
        System.out.println(cal.value);
    }
}

//인스턴스클래스 