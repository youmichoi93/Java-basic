public class EnumExam {  // final 상수코드
    public static final String MALE="MALE";
    public static final String FEMALE="FEMALE";
    public static void main(String[] args) { //Static한 필드는 객체생성없이 사용가능
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;//그래서 바로 클래스명에 바로 접근 가능.
        //gender 가 두 가지 값만 대응하도록 값 부여



        //(1) gender1 = "boy"; // boy는 스트링이기에 오류 발생은 안 되지만 원하는 결과값은 안 나옴.
        

        Gender gender2; //Gender자체가 자료형이되어 선언가능.
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
        gender2 = "boy";   //(2) 열거형 선언 후 MALE과 FEMALE이 아닌 다른 것을 넣을경우 오류발생.
        

    }
}

enum Gender{  //따라서 열거형 선언. Enum 이름은 클래스 명명 규칙을 따르며, 세부 항목의 이름은 모두 대문자를 사용
    MALE,FEMALE;
}
