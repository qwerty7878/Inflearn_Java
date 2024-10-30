package inflearn.yalco.java_study.sec05.chap01.ex03;

public class YalcoChicken {
    int no;
    String name;

    //  ⭐ 생성자(constructor) : 인스턴스를 만드는 메소드
    //  ⭐ this : 생성될 인스턴스를 가리킴 - no와 name을 넣을 대상(store1,2,3)
    //  메소드 안에서 자신을 가리킬 필요 + 변수 명이 겹치는 것을 막기 위해서
    //  매장은 이런 형식으로 내라 라는 뜻
    public YalcoChicken (int no, String name) {
        this.no = no;
        this.name = name;
    }

    String intro () {
        //  String name = "몽고반"; // 주석해제 시 name 대체
//        YalcoChicken thisshop = this;
        return "안녕하세요, %d호 %s점입니다." // 🔴
                .formatted(no, name);
    }
}