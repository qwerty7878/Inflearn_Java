package inflearn.yalco.java_study.sec06.chap02.pkg4;

import inflearn.yalco.java_study.sec06.chap02.pkg1.Parent;
import inflearn.yalco.java_study.sec06.chap02.pkg3.*; // ⭐️ 와일드카드

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent();

        //  ⭐️ 패키지가 다른 동명의 클래스들을 불러올 경우
        inflearn.yalco.java_study.sec06.chap02.pkg1.Child child1 = new inflearn.yalco.java_study.sec06.chap02.pkg1.Child();
        inflearn.yalco.java_study.sec06.chap02.pkg2.Child child2 = new inflearn.yalco.java_study.sec06.chap02.pkg2.Child();

        Cls1 cls1 = new Cls1();
        Cls2 cls2 = new Cls2();
        Cls3 cls3 = new Cls3();
    }
}
