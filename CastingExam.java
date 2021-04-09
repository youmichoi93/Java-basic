public class CastingExam {
   public static void main(String[] args) {
   long longValue = 20;
   int intValue = (int) longValue; //강제 형변환 , long이 int 보다 그릇이 크지만 long안에 int에 들어갈만큼의 양이 있으면 강제 형변환 가능.
   System.out.println(intValue);
 }
}

