package inflearn.yalco.java_study.sec05.chap02.ex01;

public class Slime {
    //  이미 기초값이 설정되어 있어서 생성자가 필요없음
    double hp = 50;
    int attack = 8;
    double defense = 0.2;

    void attack (Slime enemy) {
        // 💡 다른 슬라임의 인스턴스를 인자로 받음
        //  참조 자료형이라 hp 값이 변경됨
        enemy.hp -= attack * (1 - enemy.defense);
    }
}
