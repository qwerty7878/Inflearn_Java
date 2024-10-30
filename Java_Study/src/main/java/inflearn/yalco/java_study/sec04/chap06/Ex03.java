package inflearn.yalco.java_study.sec04.chap06;

public class Ex03 {
    public static void main(String[] args) {

        upTo5(0);
        upTo5(2);
        upTo5(4);

        int fact1 = factorial(1);
        int fact2 = factorial(2);
        int fact3 = factorial(3);
        int fact4 = factorial(4);
        int fact5 = factorial(5);
    }

    //  재귀는 난해함
    //  반복이 계속되면 완료될때까지 중간에 호출된 재귀들도 메모리를 차지함(스택 오버플로우가 발생)
    //  꼬리 재귀 최적화 - for문으로 바꿔질 수 있는 재귀
    static void upTo5 (int start) {
        System.out.println(start);
        if (start < 5) {
            upTo5(++start);
        } else {
            System.out.println("-- 종료 --");
        }
    }
    static int factorial (int num) {
        return num == 0 ? 1 : num * factorial(--num);
    }
}
