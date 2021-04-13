public class CarExam3 {
    public static void main(String[] args) {
        Car c1 = new Car("소방차");
        Car c2 = new Car(); //생성자 오버로딩 :처음에 여기서 오류나다가 Car에서 Car생성자 만드니 오류 사라짐.
        Car c3 = new Car("구급차",1111);
    }
    
}
