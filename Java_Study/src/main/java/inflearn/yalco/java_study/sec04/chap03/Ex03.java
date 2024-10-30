package inflearn.yalco.java_study.sec04.chap03;

public class Ex03 {
    public static void main(String[] args) {

        //  4의 배수 차례로 10개 배열에 담기
        int count = 10;
        int[] multiOf4 = new int[count];

        //  조건이 있는 경우 일반 for문을 사용
        for (int i = 1, c = 0; c < count; i++) {
            if (i % 4 == 0) {
                multiOf4[c++] = i;
            }
        }

        // 변수 하나만으로 위에 코드와 동일한 결과 출력
        for(int i = 1; i <= 40; i++){
            if(i % 4 == 0){
                multiOf4[i / 4 - 1] = i;
            }
        }

        //  💡 배열 순환 (기본적인 방법)
        for (int i = 0; i < multiOf4.length; i++) {
            System.out.println(multiOf4[i]);
        }

        System.out.println("\n- - - - -\n");

        //  💡 for each 문법 - 배열이나 이후 배울 콜랙션 등에 사용
        //  변수를 하나만 사용함 훨씬 효율적이고 안정적임
        //  전체를 반환할 경우
        for (int num : multiOf4) {
            System.out.println(num);
        }

        System.out.println("\n- - - - -\n");

        int sumOfArray = 0;
        for (int num : multiOf4) {
            sumOfArray += num;
        }

        System.out.println("\n- - - - -\n");

        for (String s : "호롤롤로".split("")) {
            System.out.println(s);
        }
    }
}
