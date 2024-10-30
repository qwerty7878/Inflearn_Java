package inflearn.yalco.java_study.sec05.chap05.ex01;

public class Main {
    public static void main(String[] args) {
        
        YalcoChickenDT dtStore1 = new YalcoChickenDT(108, "철원");

        //  얄코치킨의 기본 기능인 홀 오더 기능도 포함하기 때문에 홀 오더 기능도 수행함
        dtStore1.takeHallOrder();

        //  드라이브 스루 기능도 수행함
        dtStore1.takeDTOrder();
        dtStore1.setDriveThruOpen(false);
        dtStore1.takeDTOrder();
    }
}
