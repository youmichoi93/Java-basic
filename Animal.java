
public class Animal {
    String name;

    public void setName(String name) {
        this.name = name;  // cat.name = "bob";
    }
    public static void main(String[] args){
        Animal cat = new Animal();
        cat.setName("bob");
        System.out.println(cat.name);

        Animal dog = new Animal();
        dog.setName("Happy");
        System.out.println(dog.name);

        Animal horse = new Animal();
        horse.setName("nabi");
        System.out.println(horse.name);

        Animal rabbit = new Animal();
        rabbit.setName("mija");
        System.out.println(rabbit.name);


    }
}
