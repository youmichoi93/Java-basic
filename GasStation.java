public class GasStation {

    public static void main(String[]args){

    
        GasStation gasStation = new GasStation(); // gasStation 인스턴스 생성
        Suv suv = new Suv("suv"); // suv 인스턴스 생성
        Truck truck = new Truck("Truck"); // truck 인스턴스 생성
        Bus bus = new Bus("Bus"); // bus 인스턴스 생성

     



        // gasStation에서 suv에 기름을 넣습니다.
        gasStation.fill(suv);

        // gasStation에서 truck에 기름을 넣습니다.
        gasStation.fill(truck);

        // gasStation에서 bus에 기름을 넣습니다.
        gasStation.fill(bus);
        
    }

     //Car car)하위 타입을 상위 타입으로 형변환할 때는 묵시적으로 형변환이 일어남.
        public void fill(Car car) {
        System.out.println(car.name+"에 기름을 넣습니다.");
        car.gas += 10;
        System.out.println("기름이 "+car.gas+"리터 들어있습니다.");
    }    
}
