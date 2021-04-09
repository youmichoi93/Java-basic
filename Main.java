import java.util.Scanner;

public class Main {
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       System.out.println("숫자입력: ");
       int a;
       a = input.nextInt();
       String b = (a==1)? "st": (a==2)? "nd" : (a==3)? "rd":"th";

        System.out.println(a + "의 서수는 " +a+b + "입니다.");
    
    }
}
