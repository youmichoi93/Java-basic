public class ConstantExam {
    public static void main(String[] args){
        // int i;
        // i = 10;
        // i = 5;  //변수는 i가 10->5로 바뀌는 것을 확인.
        // System.out.println(i);



        // final int J; //But상수는 변수 변경이 안 됨.J가 5가 되지 않고 오류발생
        // J = 10;
        // J = 5;
        // System.out.println(J); //상수, 대문자로 변수
        

        final double PI = 3.14159;
        int radius = 3;
        double result = radius *2*PI;
        System.out.println(result);
         //여러 번 같은 값을 입력하면서 숫자를 틀리지 않도록 계속 신경 써야함. 따라서 상수 PI설정
    
    
    
    }
}
