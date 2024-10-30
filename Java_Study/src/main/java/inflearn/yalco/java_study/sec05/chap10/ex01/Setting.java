package inflearn.yalco.java_study.sec05.chap10.ex01;

public class Setting {
    private int volume = 5;

    public int getVolume() {
        return volume;
    }
    public void incVolume() { volume++; }
    public void decVolume() { volume--; }
}

// 싱글턴을 쓰는 이유 - 프로그램 상 특정 인스턴스가 딱 하나만 있어야 할 때