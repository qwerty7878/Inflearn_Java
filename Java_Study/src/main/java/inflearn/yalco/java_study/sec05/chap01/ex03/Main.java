package inflearn.yalco.java_study.sec05.chap01.ex03;

public class Main {
    public static void main(String[] args) {

        //  클래스로 인스턴스를 생성 - 💡 new 연산자 + 생성자 호출
        //  본사의 방침대로 매장을 내는 것

        //  생성자가 없으면 하나하나 값을 입력해줘야함
        YalcoChicken store1 = new YalcoChicken(3, "판교");
        YalcoChicken store2 = new YalcoChicken(17, "강남");
        YalcoChicken store3 = new YalcoChicken(24, "제주");

        String[] intros = {store1.intro(), store2.intro(), store3.intro()};
    }
}
