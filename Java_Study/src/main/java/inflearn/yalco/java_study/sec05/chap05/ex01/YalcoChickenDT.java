package inflearn.yalco.java_study.sec05.chap05.ex01;

//  얄코 치킨의 기능은 포함하지만 드라이브스루 기능이 추가된 것
//  중복을 최소화하기 위해서 - 필드와 메소드는 포함되어있다는 뜻
//  추가된 내용만 기입
//  자회사라고 생각하면 편함
public class YalcoChickenDT extends YalcoChicken {
    private boolean driveThruOpen = true;

    public YalcoChickenDT(int no, String name) {
        super(no, name); // 다음 예제에서 다룰 것
    }

    public void setDriveThruOpen(boolean driveThruOpen) {
        this.driveThruOpen = driveThruOpen;
    }

    public void takeDTOrder () {
        System.out.printf(
                "%d호 %s점 드라이브스루 주문 %s%n",
                no, name,
                (driveThruOpen ? "받음" : "불가")
        );
    }
}
