public class VariableScopeExam {
    int globalScope = 10; //클라스의 변수지만 sopeTest메소드에서도 사용가능함.
    static int staticVal = 7;

    public void scopeTest(int value){  
        int localScope = 20; //scopeTest메소드 안에서 선언했으므로 당연히 사용 가능.

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value); //scopeTest 메소드 블록 밖에 있지만, 메소드의 선언부에 위치 하므로 사용가능.
        

    }

    public void scopeTest2 (int value2){  //변수의 사용범위(scope)테스트용 함수
        System.out.println(globalScope); //클라스 변수라 여전히 사용가능
        System.out.println(localScope); //컴파일러 오류
        System.out.println(value); //컴파일러 오류 -> 다른 함수의 변수임.
        
    }

    public static void main(String[] args){
        System.out.println(staticVal);  //메인에서 globalScope포함 세 변수 모두 안 됬었는데, static키워드를 붙힌 변수는 객체생성없이 프린트 됨
        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);//v1는 인스턴트 생선될시 globalScope값을 저장하는 공간을 별개로 하나 만듦.
        //static한 메소드에서 static하지 않은 변수 globalScope을 사용하기위하여 객체생성 후 변수v1에 점을 찍어 접근함.
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v2.globalScope);

        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal); // 50이 아니라 100나옴, 이유는 staticVal은 클래스 변수로 한 공간만 있기때문에 서로 공유.
        System.out.println(v2.staticVal);  // 인스턴스를 생성할때 생선된 인스턴스변수는 (globalScope) 각자 따로 공간있음.

    }
}