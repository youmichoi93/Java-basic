public class Car { //Bus를 상속해주는 부모 메서드
    public Car(String name){
        System.out.println("Car의 name 생성자 입니다.");
    }
}
    
    
    
    
    // public void run(){
    //     System.out.println("run");
   

//         // 형 + 필드명
//         String name;
//         int number;    

//         public Car(String name) {
//             this.name = name;
//         }
//         public Car(){
//             this.name = "이름없음";
//             this.number = 0;
//       }

//         public Car(String name, int number) {
//             this.name = name;
//             this.number =number;
//    }

// }
  
   
  
  
  
  
  
  
  
  
  
  
  
  
//     //형 + 필드명
//     String name;
//     int number;

//     public Car(String name){ //리턴형이 없으니 생성자임, 자동차들의 이름을 붙히기 위하여 name을 매개변수로함.
//         this.name = name;  
//         //처음에 name = n; 으로 매개변수 설정했으나 명확하게 하기위하여 name로 바꿨는데 소방차 이름 안 찍히고 null나옴.
//         //따라서 this(객체 자신을 참조하는 키워드)를 앞에 넣어서 다시 소방차 나옴
//     }
// }