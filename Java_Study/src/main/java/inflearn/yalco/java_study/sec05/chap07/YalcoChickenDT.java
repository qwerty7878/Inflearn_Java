package inflearn.yalco.java_study.sec05.chap07;

public final class YalcoChickenDT extends YalcoChicken {
    public YalcoChickenDT(int no, String name) {
        super(no, name);
    }

    //  ⚠️ 불가 - 오버라이딩은 가능하나 수정은 불가능함(메소드에 final이 붙어있어서)
//    public void fryChicken () {
//        System.out.println("염지, 반죽입히기, 미원, 튀김");
//    }

    // 생성자 추가할 것
}
