import jdk.javadoc.internal.doclets.formats.html.resources.standard;

public class TruckExam {
    public static void main (String[]args){
       
        Truck t = new Truck();

    }
    
}

//truck의 객체를 만들고 실행했는데 truck의 기본생성자 뿐만아니라
//car의 기본 생성자까지 호출됨, 게다가 먼저 출력됨.

//이유: 자식인 truck을 인스턴트화하면,즉  Truck truck = new Truck(); 했을때 메모리가 올라가면서 부모님car객체도 같이 인스턴스화됨.
//또한 car객체가 먼저 있어야 자식 객체도 생성되니까 부모클래스가 먼저나오는 것.