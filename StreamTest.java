import java.util.Scanner;


public class StreamTest {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int num;
        String name;

        System.out.println("번호를 입력하세요.");
        num = sc.nextInt();
        System.out.println("이름을 입력하세요");
        name = sc.next();

        System.out.printf("%d번 후보 %s.", num,name);
        



        sc.close();     
  }
}
