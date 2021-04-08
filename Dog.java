public class Dog extends Animal {
    public void sleep(){
        System.out.println(this.name+"zzz");
    }

    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
    }
}

//default 생성자: 생성자의 입력 항목이 없고 생성자 내부에 아무 내용없는 생성자 
//만약 클래스에 생성자가 하나도 없다면 컴파일러는 자동으로 위와같은 디폴트 생성자를 추가
//-> 따라서 HouseDog에는 생성자를 만들었기에 자동으로 생기지 않음.

// public class Dog extends Animal {
//     public Dog() {
//     }

//     public void sleep() {
//         System.out.println(this.name + " zzz");
//     }
// }