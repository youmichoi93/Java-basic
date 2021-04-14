public class ActionExam {
    

    public static void main(String[] args){
        Action action = new Action() {//(1)Action은 추상클래스이므로 객체생성 안 됨. 자식 클래스인 Myaction클래스로 객체생성해야함.
        @Override                     //new Action()옆에 중괄호 넣으면 생성된 이름 없는 객체를 action이라는 참조 변수가 참조하도록함.
        public void exec(){
            System.out.println("exec");
        }

       };
       action.exec(); // (2)익명클래스를 하나 만들어, 레퍼런스 변수.메서드명(), 추상클래스 한번만 사용하게 됨!

    }
}


//익명클래스 : 익명 클래스는 자식 클래스를 만들 필요없을때 사용(한번만 사용할때),
//이유: Action을 상속받는 클래스를 따로 정의하지 않아도 바로사용가능하기때문