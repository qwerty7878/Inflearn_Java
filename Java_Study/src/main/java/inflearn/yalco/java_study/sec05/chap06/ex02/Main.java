package inflearn.yalco.java_study.sec05.chap06.ex02;

//  특정 자식의 인스턴스여야만 기능을 수행하도록 하는 경
public class Main {
    public static void main(String[] args) {

        System.out.println("\n- - - - -\n");

        YalcoChicken ycStores[] = {
                new YalcoChicken(3, "판교"),
                new YalcoChicken(17, "강남"),
                new YalcoChickenDT(108, "철원"),

        };

        for (YalcoChicken store : ycStores) {
            if (store instanceof YalcoChickenDT) {
                //  ⭐️ 자식 클래스의 기능을 사용하려면 명시적 타입 변환
                ((YalcoChickenDT) store).takeDTOrder();
                //  단순 YalcoChicken에는 takeDTOrder라는 기능이 구현되어 있지 않음
                //  여러 자료형들을 조상 것으로 묶어서 사용하는 경우임
            } else {
                store.takeHallOrder();
            }
        }
    }
}
