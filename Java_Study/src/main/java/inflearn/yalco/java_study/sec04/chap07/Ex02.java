package inflearn.yalco.java_study.sec04.chap07;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 프로그램이 진행하다 외부의 입력을 받거나 다운로드를 기다리기 위해 코드의 진행이 멈춤 - 동기적으로 진행
        boolean bool = sc.nextBoolean();
        int intNum = sc.nextInt();
        double dblNum = sc.nextDouble();
        // 🧪 기타 next~ 메서드들 확인해 볼 것

        System.out.println("bool: " + bool);
        System.out.println("intNum: " + intNum);
        System.out.println("dblNum: " + dblNum);

    }
}
