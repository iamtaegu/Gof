package singleton_5장;

public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    // static factory method
    // factory method: 인스턴스 생성을 위한 클래스 메소드
    public static Singleton getInstance() {
        return singleton;
    }

}
