package chap_06;

public class _05_OverLoading {
    public static int getPower(int number){ //"4"
        int result = number * number;
        return result;
        //return number* number;
    }

    public static int getPower(String strNumber){
        int number = Integer.parseInt(strNumber);
        return number*number;
    }

    public static int getPower(int number, int exponent){
        int result = 1;
        for (int i = 0; i < exponent; i++) {
            result *= number;
        }
        return result;
    }
    public static void main(String[] args) {
        //메소드 오버로딩(메소드명이 같지만 전달되는 자료형에 따라 메소드 구분실행)
        //같은 이름의 메소드를 여러번 선언
        //메소드 전달값의 타입, 갯수가 다르면 같은 명의 메소드 언제든 중복 선언 가능
        System.out.println(getPower(3));//3*3=9
        System.out.println(getPower("4"));//4*4=16
        System.out.println(getPower(3,3));//3*3*3=27

    }
}
