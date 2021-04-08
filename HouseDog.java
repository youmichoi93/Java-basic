public class HouseDog extends Dog {  //생성자:클라스명과 메소드명이 동일, 리턴 자료형이 없는 메소드 
    public HouseDog(String name){  //아래 객체가 비어있으면 오류뜸, 문자 자료형 넣으라고 했기때문.
        this.setName(name);
    }


    public HouseDog(int type) {
        if (type == 1) {
            this.setName("york");
        } else if (type == 2) {
            this.setName("bulldog");
        }
    }


    public void sleep(){
      System.out.println(this.name+"zzz in house");
    //overriding: Dog에서 상속받아 sleep메소드를 사용 가능했지만 똑같은 메소드를 HouseDog에 추가했을때 손자 것이 우선이다 
    
    }
    public void sleep(int hour){
        System.out.println(this.name+"zzz in house for " + hour + "hours");

    }

    public static void main(String[] args){
        HouseDog happy = new HouseDog("happy");
        HouseDog york = new HouseDog(1); //생성자오버로딩 위에 숫자타입 입력항목이고, 1이면 york찍기
        System.out.println(happy.name);
        System.out.println(york.name);
       
       
       
       
        // System.out.println(housedog.name);

       
       
       
       
        //housedog.setName("happy");
        //housedog.sleep();      //sleep()메소드 호출
        //housedog.sleep(3);    //sleep(int hour) 메소드 호출
        //overloading :입력항목이 다른경우 같은 메소드 추가할 수 있다.

    }
    
}
