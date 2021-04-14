
public class InnerExam2 {
    static class Cal{ //(1)클라스안에 클라스 (Static 필드추가함)
      int value = 0;  
      public void plus() {   
            value++;
     }
 }
    public static void main(String[] args){
        InnerExam2.Cal cal = new InnerExam2.Cal(); //(2)innerExam1과 달리 바로 객체 생성없이 바로 cal클래스의 객체 생성가능
        cal.plus();
        System.out.println(cal.value); //cal이 가진 필드에 (int value)에 접근해 출력
    }
    
}


//static 클래스