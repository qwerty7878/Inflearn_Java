package inflearn.yalco.java_study.sec05.chap02.ex03;

public class ChickenMenu {
    String name;
    int price;
    String cook = "fry";

    ChickenMenu (String name, int price) {
        this.name = name;
        this.price = price;
    }

    // 인자의 갯수차이 - 오버라이딩 (요리의 방식을 따로 지정하는지 안하는지)
    ChickenMenu (String name, int price, String cook) {
        this.name = name;
        this.price = price;
        this.cook = cook;
    }
}
