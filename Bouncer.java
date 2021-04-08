public class Bouncer {
    public void barkAnimal(Barkable animal) {
       animal.bark();

    //     if (animal instanceof Tiger) {       //다형성, 폴리모피즘:하나의 객체가 여러개의 자료형 타입을 가질 수 있는 것   
    //         System.out.println("roar");
    //     }else if (animal instanceof Lion) {
    //         System.out.println("grrr");
        
    // }
  }


public static void main (String[]args){
    Tiger tiger = new Tiger();
    Lion lion = new Lion();
    Bouncer bouncer = new Bouncer();
    bouncer.barkAnimal(tiger);
    bouncer.barkAnimal(lion);

 }

}