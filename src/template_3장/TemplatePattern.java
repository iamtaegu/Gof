package template_3장;

public class TemplatePattern {
    
    public static void doPattern() {
        /*
         * 1. 'H'를 가진 CharDisplay 인스턴스를 만듬
         * 2. "Hello, world."를 가진 StringDisplay 인스턴스를 만듬 
         */
        
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, world.");

        /*
         * 3. 상속한 display 메소드 호출 
         *  - d1, d2 모두 AbstractDisplay의 하위 클래스의 인스턴스이므로
         * 4. 실제 동작은 인스턴스 구현체에서 정해짐 
         */

        d1.display();
        d2.display();
    }

}
