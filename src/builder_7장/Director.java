package builder_7장;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    /*
     * 문서를 만드는 메소드
     * 인스턴의 builder 인스턴스에 따라
     * 문서 형식이 정해짐
     */
    public void construct() {
        builder.makeTitle("Greeting_v2");
        builder.makeString("일반적인 인사");
        builder.makeItems(new String[]{
                "How are you??",
                "Hello..!",
                "Hi..!"
        });
        builder.makeString("시간대별 인사");
        builder.makeItems(new String[]{
                "Good morning",
                "Good afternoon",
                "Good evening"
        });
        builder.close();
    }

}
