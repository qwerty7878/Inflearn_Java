package inflearn.yalco.java_study.sec05.chap01.ex02;

//  클래스 - 프렌차이즈 본사 / 인스턴스 - 매장
//  본사의 코드(본사에서 하는 일)
public class YalcoChicken {
    //  인스턴스가 가질 필드(field)들 - 각 매장의 정보들
    int no;
    String name;

    //  인스턴스가 가질 메소드 - 💡 static을 붙이지 않음
    String intro () {
        // no와 name 앞에 this를 붙인 것과 같음
        return "안녕하세요, %d호 %s점입니다."
                .formatted(no, name);
    }
}