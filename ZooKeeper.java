public class ZooKeeper {
    public void feed(Predator predator){    //인터페이스를 물려버린다.
        System.out.println("feed " + predator.getFood());
    }

    public static void main(String[]args) {  
        ZooKeeper zookeeper = new ZooKeeper();
        Tiger tiger= new Tiger();
        Lion lion = new Lion();
        Cro cro = new Cro();

        zookeeper.feed(tiger);
        zookeeper.feed(lion);
        zookeeper.feed(cro);
       

    }

}



