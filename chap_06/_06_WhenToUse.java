package chap_06;

public class _06_WhenToUse {
    public static int getPower(int number){
        return getPower(number,2);
    }
    //메소드 내에서도 또 다른 메소드 호출이 가능

    public static int getPower(int number, int exponent) {
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }

    public static void main(String[] args) {
        //메소드가 필요한 이유
        //코드의 간소화. 코드 유지보수에 용이

        //2의 2승을 구하기
        System.out.println(getPower(2,2));//2*2=4

        //3의 3 승을 구하기
        System.out.println(getPower(3,3));
    }
}
