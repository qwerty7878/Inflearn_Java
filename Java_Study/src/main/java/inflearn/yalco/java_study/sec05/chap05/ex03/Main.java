package inflearn.yalco.java_study.sec05.chap05.ex03;

public class Main {
    public static void main(String[] args) {

        Slime slime = new Slime();
        FireSlime fireSlime = new FireSlime();

        slime.attack(fireSlime);
        // ⭐ 클래스가 다른데 가능한 이유 : fireslime을 slime으로 인식해서
        //  기본적으로 hp와 defense를 가지고 있다는 전제가 있기 때문에 에러 없이 실행이 가능함
        fireSlime.attack(slime);
    }
}
