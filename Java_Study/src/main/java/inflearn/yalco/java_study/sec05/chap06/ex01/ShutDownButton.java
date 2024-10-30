package inflearn.yalco.java_study.sec05.chap06.ex01;

//  상속은 다중으로 사용 가능함
public class ShutDownButton extends Button {
    public ShutDownButton () {
        super("ShutDown");
        //  super가 생성자에서 사용되는 경우
        // 💡 부모의 생성자 호출
        //  Button("ShutDown")과 동일
    }

    //  💡 부모의 메소드를 override
    //  부모의 메소드명이랑 같아야함 - 물려받았지만 내용이 다름(알아서 할게요)
    @Override
    public void func () {
        System.out.println("프로그램 종료");
    }
}
