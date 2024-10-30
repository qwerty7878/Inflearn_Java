package inflearn.yalco.java_study.sec05.chap06.ex01;

public class Main {
    public static void main(String[] args) {

        //  💡 가능 - 자식 클래스는 부모 클래스에 속함
        Button button1 = new Button("Enter");
        Button button2 = new ShutDownButton();
        Button button3 = new ToggleButton("CapsLock", true);

        //  ⚠️ 반대, 상속관계가 아닌 경우는 불가
//        ShutDownButton button4 = new Button("Enter");
//        ToggleButton button5 = new ShutDownButton();

        //  ⭐️ 편의 : 모두 Button이란 범주로 묶어 배열 등에서 사용 가능
        Button[] buttons = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button button : buttons) {
            //  ⭐️ 모든 Button들은 func 메소드를 가지므로
            button.func();
        }

        Button button = new Button("버튼");
        ToggleButton toggleButton = new ToggleButton("토글", true);
        ShutDownButton shutDownButton = new ShutDownButton();

        //  instanceof는 상속관계 여부를 확인할때 사용 - 서로 상속관계 여야만 함
        //  자식 instanceof 부모 형태일때 true 반환함

        //  true
        boolean typeCheck1 = button instanceof Button;
        boolean typeCheck2 = toggleButton instanceof Button;
        boolean typeCheck3 = shutDownButton instanceof Button;

        //  false
        boolean typeCheck4 = button instanceof ShutDownButton;
        boolean typeCheck5 = button instanceof ToggleButton;

        //  ⚠️ 컴파일 에러 - 상속관계가 아니니까
//        boolean typeCheck6 = toggleButton instanceof ShutDownButton;
//        boolean typeCheck7 = shutDownButton instanceof ToggleButton;

        Button[] buttonss = {
                new Button("Space"),
                new ToggleButton("NumLock", false),
                new ShutDownButton()
        };

        for (Button btn : buttonss) {
            if (btn instanceof ShutDownButton) continue; // ⭐️
            btn.func();
        }
    }
}
