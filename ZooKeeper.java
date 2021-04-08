   public class ZooKeeper {
    public void feed(Predator predator){
        System.out.println("feed " + predator.getFood());
    }

    

    // public void feed(Tiger tiger){   //Tiger tiger : Tiger class로 찍어낸 무엇
    //     System.out.println("feed apple");
    // }  


    // public void feed(Lion lion){
    //     System.out.println("feed banana");  //1>메소드 오버로딩: 입력값의 자료형 타입이 다를경우 but 메소드명이 동일할때 
    // }
    
    

    public static void main(String[] args){
        ZooKeeper zooKeeper = new ZooKeeper();
        Tiger tiger = new Tiger();
        Lion lion = new Lion();
        Leo leo = new Leo();
        zooKeeper.feed(tiger);  //2>feed메소드가 두개, 객체를 던짐으로써 어느것을 실행할지 선택
        zooKeeper.feed(lion);
        zooKeeper.feed(leo);    
    }
}




