package inflearn.yalco.java_study.sec05.chap06.ex03;

import inflearn.yalco.java_study.sec05.chap01.ex03.YalcoChicken;
import inflearn.yalco.java_study.sec05.chap05.ex02.Button;
import inflearn.yalco.java_study.sec05.chap05.ex02.ShutDownButton;
import inflearn.yalco.java_study.sec05.chap05.ex03.FireSlime;

public class Main {
    public static void main(String[] args) {

        //  object는 모든 클래스의 최고 조상임
        Object obj1 = new Object();

        //  ⭐️ IDE의 안내대로 다른 패키지의 클래스 임포트
        //  💡 해당 클래스의 생성자가 public 이어야 함
        Object obj2 = new YalcoChicken(3, "판교");
        Object obj3 = new ShutDownButton();
        Object obj4 = new FireSlime();

        //  원시 자료형들도 Object의 인스턴스로... - 이후 자세히 배울 것(원시자료형들이 암시적 변환된 것)
        Object obj5 = true;
        Object obj6 = 1;
        Object obj7 = "Hello";

        //  ⭐️ 모든 자료형을 포함할 수 있는 배열
        Object[] objs = {
                1, false, 3.45, '가', "안녕하세요", new Button("Space")
        };

        for (Object obj : objs) {
            System.out.println(obj);
        }
    }
}
