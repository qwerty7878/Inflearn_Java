package inflearn.yalco.java_study.sec03.chap01;

public class Ex08 {
    public static void main(String[] args) {

        int int1 = 3;

        int int2 = int1++; //   3
        int int3 = ++int1; //   4
//        int1 = 5가 됨
        int int4 = -(int2-- * --int3);  //  -(3 * 4) = -12
//      int2 = 2, int3 = 4
        int x = 1;

        //  메서드 안으로도 '반환'되어 사용되는 것
        System.out.println(x++);
        System.out.println(++x);
        System.out.println(x);

        //  ⚠️ 리터럴에는 사용 불가
//        int int5 = 3++;
//        int int6 = --3;
    }
}
