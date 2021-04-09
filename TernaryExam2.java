import java.util.Calendar;

public class TernaryExam2 {
    public static void main (String[] args){
        int hour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        String ampm;
        ampm = (hour < 12)? "오전":"오후" ;
        System.out.println("현재 시간은" + hour + "시이고," + ampm + "입니다."); 


    }
    
}
