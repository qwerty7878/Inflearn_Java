package inflearn.yalco.java_study.sec05.chap06.ex01;

public class ToggleButton extends Button {
    private boolean on;

    public ToggleButton(String print, boolean on) {
        //  자식클래스의 생성자는 super로 시작해야함
        //  부모클래스의 생성자가 없으면 자식클래스에도 생성자 필요없음
        //  부모가 있어야 자식이 있으니까
        super(print);
        this.on = on;
    }

    //  this - 자신
    //  super - 부모

    @Override
    public void func () {
        super.func();
        //  super가 일반 메소드에서 사용 된 경우
        // 💡 부모에서 정의한 메소드 호출
        //  ~ 입력적용이 먼저 실행 후 자기만의 내용이 추가됨
        this.on = !this.on;
        System.out.println(
                "대문자입력: " + (this.on ? "ON" : "OFF")
        );
    }
}