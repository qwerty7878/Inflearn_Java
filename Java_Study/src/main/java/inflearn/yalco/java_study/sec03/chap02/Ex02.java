package inflearn.yalco.java_study.sec03.chap02;

public class Ex02 {
    public static void main(String[] args) {

        //  float의 최대값과 최소값
        //  wrapper 함수
        float fMin = -Float.MAX_VALUE;
        float fMax = Float.MAX_VALUE;

        //  double의 최대값과 최소값
        double dMin = -Double.MAX_VALUE;
        double dMax = Double.MAX_VALUE;

        //  최소 절대값
        float fAbsMin = Float.MIN_VALUE;
        double dAbsMin = Double.MIN_VALUE;

        // ⭐ double이 범위도 넓고, 정밀도도 높음 확인
        //  바이트 수가 클수록 더 작게 표현가능
        boolean bool1 = Float.MAX_VALUE < Double.MAX_VALUE;
        boolean bool2 = Float.MIN_VALUE > Double.MIN_VALUE;

        //  최대 정밀도 테스트
        double dblNum = 0.123456789123456789;
        float fltNum = 0.123456789123456789f;
        //  0.123456789까지만 나옴
    }
}
