package inflearn.yalco.java_study.sec05.chap01.ex01;

public class Main {
    public static void main(String[] args) {

        //  클래스를 선언하면 다른 인스턴스(객체)의 자료형이 됨
        //  인스턴스는 클래스에서 정의한 형식대로 만들어짐
        //  생성자 틀에 맞춰서 객체 생성됨
        Button button1 = new Button('1', 1, "DARK");
        Button buttonPlus = new Button('+', 3, "DARK");
        Button buttonClear = new Button('C', 2, "DARK");

        //  place 메소드 실행
        button1.place();
        buttonPlus.place();
        buttonClear.place();
    }
}
