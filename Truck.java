public class Truck extends Car {
    public Truck(){
        super("트럭");  //super 키워드는 자식이 부모의 메서드나 필드를 사용할 때도 쓸 수 있으므로 꼭 기억
    
        System.out.println("Truck의 기본 생성자 입니다.");

    }
    
}

//처음에는 car에 기본생성자가 있어서 truckexam 컴파일러가 자동으로 불러와졌지만,
//사실은 super();를 자동으로 호출한것이므로, 만약 부모 car에 기본생성자가 없다면 
//자식 truck 에서 super로 직접 호출해야함.
//직접호출이유: 부모객체가 생성되어야, 자식인 트럭객체도 생성되는데, 부모 생성자가 없을경우 직접호출하지 않으면 트럭클래스 자체에서 에러가남.