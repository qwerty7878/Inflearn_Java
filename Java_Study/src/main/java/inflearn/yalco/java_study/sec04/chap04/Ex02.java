package inflearn.yalco.java_study.sec04.chap04;

public class Ex02 {
    public static void main(String[] args) {

        //  100보다 작은 3의 배수들 출력해보기

//        int i = 1;

        // ⚠️ 의도대로 작동하지 않음. 이유는?
//        while (true) {
//            //  첫 줄이 실행이 되지 않아서 증감이 이루어지지 않음
//            if (i % 3 != 0) continue;  // 🔴
//            System.out.println(i);
//
//            if (i++ == 100) break;
//        }

        int i = 1;

        while (true) {
            if (i++ == 100) break;
            if ((i - 1) % 3 != 0) continue;

            System.out.println(i - 1);
        }

        int j = 1;

        //  보다 가독성을 높이고 의도를 잘 드러낸 코드
        while (true) {
            int cur = j++;

            if (cur == 100) break;
            if (cur % 3 != 0) continue;

            System.out.println(cur);

        }
    }
}
