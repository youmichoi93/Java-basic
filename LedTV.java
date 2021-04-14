public class LedTV implements TV { //TV인터페이스 구현,인터페이스 TV의 기능을 모두 구현해야함.
    @Override
    public void turnOn() {
        System.out.println("켜다");
        
    }

    @Override
    public void turnOff() {
        System.out.println("끄다");
        
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨을 조절하다"); 
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("채널을 변경하다");
        
    }
    
}
