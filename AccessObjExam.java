public class AccessObjExam {

    public static void main(String[] args) {
        AccessObj obj = new AccessObj();
        System.out.println(obj.p);
        System.out.println(obj.p2);
        // System.out.println(obj.i);  // 컴파일 오류가 발생합니다.private
        System.out.println(obj.k);
    }
    
}

//public은 전부가능
//protected 동일패키지내 클래스 혹은 외부패키지 클래스 일지라도 상속받은 자식클래스에서는 접근가능
//default 해당패키지에서 가능
//private는 자기 클래스 내에서만 가능
