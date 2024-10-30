package inflearn.yalco.java_study.sec05.chap07;

public class Main {
    public static void main(String[] args) {

        String ycCreed = YalcoChicken.CREED;
//        YalcoChicken.CREED = "우리의 튀김옷은 바삭하다"; // ⚠️ 불가 - final로 선언되어 있어서

        final YalcoChicken store1 = new YalcoChicken(3, "판교");
        //  인스턴스를 담는 변수를 final로 선언함

        //  ⚠️ 불가 - 인스턴스 값의 변경이 불가능해짐 - final로 선언했기 때문
//        store1 = new YalcoChicken(17, "강남");
        //  💡 요소(내용) 변경은 가능
        store1.name = "선릉";
    }
}
