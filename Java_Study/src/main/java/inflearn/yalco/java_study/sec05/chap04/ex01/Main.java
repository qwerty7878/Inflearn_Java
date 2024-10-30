package inflearn.yalco.java_study.sec05.chap04.ex01;

public class Main {
    public static void main(String[] args) {

        SmartPhone phone = new SmartPhone();

        String pb = phone.powerButton;
        String ss = phone.sdCardSlot;
//        String cu = phone.cpu; // ⚠️ 불가
        //  cpu는 눈에 보이면 안되는거라
        //  private으로 선언한거라 smartphone 클래스에 사용이 안됨
    }
}
