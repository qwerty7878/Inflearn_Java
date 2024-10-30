package inflearn.yalco.java_study.sec05.chap01.ex01;

public class Button {

    //  버튼 자체의 기능들
    //  어떤 각인
    char print;
    //  공백은 몇칸?
    int space;
    //  일반 모드, 다크 모드
    String mode;

    Button (char print, int space, String mode) {
        this.print = print;
        this.space = space;
        this.mode = mode;
    }

    //  포맷 출력 메소드
    void place () {
        System.out.printf(
                "표시: %c, 공간: %s, 모드: %s%n",
                print,space, mode
        );
    }
}
