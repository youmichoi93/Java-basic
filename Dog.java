public class Dog extends Animal {
    public void sleep(){
        System.out.println(this.name+" zzz ");
    } 

  public static void main(String[]args) {  
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();
        //부모 기능에서 더 추가하여 자식만 가지는 기능임(sleep메소드) 따라서 자식이 더 크다
    }
}

//IS-A관계 dog은 animal의 하위개념.개는 동물이다
//Animal dog = new Dog(); 개로 만든 객체는 동물 자료형이다
// Dog dog = new Animal(); 컴파일 오류, 부모클래스로 만든 객체는 자식 클래스의 자료형으로 쓸 수 없다