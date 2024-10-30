package inflearn.yalco.java_study.sec03.chap09;

public class Plus {
    public static void main(String[] args) {

        int x = 5;  //  0 0 1 0 1
        int y = 19; // 1 0 0 1 1

        //  &는 양쪽 모두 1인 것만 1로 반환
        int x_and_y = 5 & 19;   // 0 0 0 0 1
        // |는 한쪽만 1인 경우 1로 반환
        int x_or_y = 5 | 19;   // 1 0 1 1 1
        // ^는 양쪽 값이 다른 경우 1로 반환
        int x_xor_y = 5 ^ 19;   // 1 0 1 1 0

        // ~은 0과 1을 반대로 반환
        // 양수 정수의 경우 1을 더한 다음 -1을 곱한 것과 같은 결과가 나옴
        int notx = ~5;  //  1 1 0 1 0
        int noty = ~19; // 0 1 1 0 0

        //  << , >>는 주어진 칸 수 만큼 자릿수를 이동시킴
        //  이진수의 경우 << 인 경우 2를 곱하는 결과가, >> 인 경우 2로 나눈 정수 값의 결과가 나옴
        int x_L_1 = 5 << 1; //  0 1 0 1 0
        int y_L_1 = 19 << 1; // 1 0 0 1 1 0

        int x_R_1 = 5 >> 1; //  0 0 0 1 0
        int y_R_1 = 19 >> 1; // 0 0 1 0 0 1

        int a = 1, b = 1;
        int c = 1, d = 1;

        boolean bool1 = a > b && a++ > b;
        boolean bool2 = c == d || c++ == d;

        //  and, or 연산자처럼 boolean 연산자에서 사용 가능
        //  단, 단축평가가 적용되지 않음 무조건 뒤에 연산도 적용함
        boolean bool3 = a > b & a++ > b;
        boolean bool4 = c == d | c++ == d;

                        //  홀수는 마지막이 1
        int aa = 3;     //  0 0 0 0 1 1
        int bb = 15;    //  0 0 1 1 1 1

                        //  짝수는 마지막이 0
        int cc = 4;     // 0 0 0 1 0 0
        int dd = 20;    //  0 1 0 1 0 0

                        //  1: 0 0 0 0 0 1

        for(int i : new int[] {a, b, c, d}){

            if(i % 2 == 1) System.out.println(i + "는 홀수 입니다.");

            if((i & 1) == 1) System.out.println(i + "는 홀수 입니다.");
        }

        //  일방적인 방식
        int aaa = 5;        //  0 0 1 0 1
        int bbb = 19;       //  1 0 0 1 1

        int temp = aaa;
        aaa = bbb;
        bbb = temp;

        //  ^을 사용한 방식
        int ccc = 5;
        int ddd = 19;

        ccc ^= ddd;         //  c: 1 0 1 1 0
        ddd ^= ccc;         //  d: 0 0 1 0 1
        ccc ^= bbb;         //  c: 1 0 0 1 1

        //  비트마스킹
        int WIFI = 1;           //  0 0 0 1
        int PEN = 1 << 1;       //  0 0 1 0
        int CAMERA = 1 << 2;    //  0 1 0 0
        int SDCARD = 1 << 3;    //  1 0 0 0

        //  어떤 기능이 지원 되는지 각 자릿 수에 1을 보고 파악
        int table_1
                = PEN | SDCARD; //  1 0 1 0

        int table_2
                = WIFI | CAMERA | SDCARD; //  1 1 0 1

        //  0이 아닌 값 반환시 지원 함, 0 반환시 지원 하지 않
        boolean t1_HasPen = (table_1 & PEN) > 0;
        boolean t1_HasCamera = (table_1 & CAMERA) > 0;

        boolean t2_HasWifi = (table_2 & WIFI) > 0;
        boolean t2_HasPen = (table_2 & PEN) > 0;

        //  스펙을 변경할 경우 대입 비트 연산자를 사용
        table_1 |= CAMERA;   //  추가
        boolean t1_HasCamera2 = (table_1 & CAMERA) > 0;

        table_2 &= ~WIFI;   //  삭제
        boolean t2_HasWifi2 = (table_2 & WIFI) > 0;

        table_2 ^= WIFI;   //  토글
        boolean t2_HasWifi3 = (table_2 & WIFI) > 0;

        table_2 ^= WIFI;
        boolean t2_HasWifi4 = (table_2 & WIFI) > 0;

    }
}
