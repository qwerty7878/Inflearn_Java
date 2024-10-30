package inflearn.yalco.java_study.sec05.chap08.ex01;

public abstract class YalcoGroup {
    //  추상클래스는 병상에 누운 부모(자체적으로 인스턴스 생성 불가) - 추상클래스로 상속받은 자식만이 인스턴스를 생성해 사용가능
    //  어떤 클래스의 기능을 덜어낸 것이라고 생각하는게 편함
    protected static final String CREED = "우리의 %s 얄팍하다";

    //  💡 클래스 메소드는 abstract 불가
    //  abstract static String getCreed ();

    protected final int no;
    protected final String name;

    public YalcoGroup(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public String intro () {
        return "%d호 %s점입니다.".formatted(no, name);
    }
    //  이후 다른 패키지에서의 실습을 위해 public으로
    public abstract void takeOrder ();
    //  추상메소드  - 스스로 선언만하고 구현은 안함
    //  물려받은 자식이 구현 - 만약 구현을 안하면 오류 발생
    //  어차피 자식에서 쓰라고 만들어져 있어서 public을 안써도 상관없음
}
