package singleton_5장;

public class Singleton {

    // 클래스 필드에 인스턴스를 생성
    // 클래스가 최초 호출되는 시점에 인스턴스 생성
    private static Singleton singleton = new Singleton();

    /***
     * 생성자가 private이기 때문에 외부에서 인스턴스를 생성할 수 없음
     */
    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
    }

    // static factory method
    // factory method: 인스턴스 생성을 위한 클래스 메소드
    public static Singleton getInstance() {
        return singleton;
    }

}
