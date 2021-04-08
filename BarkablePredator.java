public interface BarkablePredator extends Predator, Barkable {  
     // 두 인터페이스를 합침
    // class의 상속은 단일만 가능하지만, 인터페이스는 다중상속이 가능하다.
    
    // public String getFood();
    // public void bark();  //인터페이스는 이름만 만듦. 이 인터페이스에 물린 class들을 그 실제 class에서 상세 구현 해야함.
    
}
