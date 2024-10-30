package inflearn.yalco.java_study.sec05.chap09.ex01;

//  extend는 상속, implement는 인터페이스에 사용
//  추상 클래스는 족보라고 생각 물려받는 것임
//  인터페이스는 자격증이라고 생각 다중으로 적용 가능
public class PolarBear extends Mammal implements Hunter, Swimmer {
    public PolarBear() {
        super(false);
    }

    @Override
    public void hunt() {
        System.out.println(position + ": 물범 사냥");
    }

    @Override
    public void swim() {
        System.out.println("앞발로 수영");
    }
}
