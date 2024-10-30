package inflearn.yalco.java_study.sec05.chap09.ex02;

public class Main {
    public static void main(String[] args) {

        //`인터페이스 자체 실행가능
        FoodSafety.announcement();

        YalcoChicken store1 = new YalcoChicken();

        //  하위 호환성을 위해 기존의 코드를 수정하지 않고, 새로운 버전의 인터페이스를 적용하기 위해 default 클래스가 존재하는 것
        store1.regularInspection();
        store1.cleanKitchen();
        store1.employeeEducation();
    }
}
