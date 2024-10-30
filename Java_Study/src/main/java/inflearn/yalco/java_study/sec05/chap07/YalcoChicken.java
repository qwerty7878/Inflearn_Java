package inflearn.yalco.java_study.sec05.chap07;

public class YalcoChicken {
    protected static final String CREED = "우리의 튀김옷은 얄팍하다.";

    private final int no;   //  초기화 안되어있 - 생성자에선 꼭 초기화해줘야함
    public String name;

    //  ⭐️ 필수 - no가 final이고 초기화되지 않았으므로
    public YalcoChicken(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public void changeFinalFields () {
        // ⚠️ 불가 - final이 붙어있어서
//        this.no++;
    }

    //  메소드에 final이 붙어있음
    public final void fryChicken () {
        System.out.println("염지, 반죽입히기, 튀김");
    }
}
