package inflearn.yalco.java_study.sec06.chap01;

public class Ex04 {

    public static void main(String[] args) {
        new Ex04().printKings();
    }

    String king = "사자";
    //  인스턴스의 필드임

    void printKings () {
        String king = "여우"; // 💡 그럼 이건 뭔가요??
        //  메소드 안에 선언된 변수임

        //  ⭐️ 인스턴스의 필드는 다른 영역으로 간주
        System.out.printf(
                "인스턴스의 왕은 %s, 블록의 왕은 %s%n",
                this.king, king
        );
    }
}
