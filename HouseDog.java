public class HouseDog extends Dog {
    public HouseDog(String name) {
        this.setName(name);
    }   //생성할때 자동으로 맨 처음으로 호출된다.메소드명이 클래스명과 동일 and 리턴타입 정의하지않는다.
    
    public HouseDog(int type) {
        if(type == 1){
            this.setName("york");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }

//생성자 2개 만듦(생성자 오버로딩), 타입이 문자면 위에 것, 숫자면 아래 생성자에 떨어지게 되어있음.

    
    public void sleep() {  //자식이 우선, dog의 같은 sleep메소드말고 여기에있는 함수가 구현됨
        System.out.println(this.name+" zzz in house");
    } 

    public void sleep(int hour) { 
        System.out.println(this.name+" zzz in house for " + hour + "hours");
    } 

    public void sleep(int hour,int min) { 
        System.out.println(this.name+" zzz in house for " + hour + "hours"+ " and " + min +"mins.");
    } 


    public static void main(String[] args) {
        HouseDog happy = new HouseDog("happy");
        HouseDog york = new HouseDog(1);  //animal의 기능 사용
        System.out.println(happy.name);
        System.out.println(york.name);
    
    }
}

//오버라이딩 덮어쓰는 것, 손자개념 부모클래스의 메소드를 자식클래스가 동일한 형태로 또다시 구현하는 행위 
// 메소드 오버로딩: 메소드를 추가해서 인수가 있고 없고, 인수에 따라 위치 선택




