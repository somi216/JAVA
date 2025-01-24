package chap_04;

public class _04_SwitchCase {
    public static void main(String[] args) {
        // SwitchCase

        //1등 전액장학
        //2등 반액장학
        //3등 반액장학
        //그외 노장학

        //If Else문을 이용
        int ranking = 1;
        if (ranking == 1) {
            System.out.println("전액 장학금");
        } else if (ranking == 2 || ranking == 3) {
            System.out.println("반액 장학금");
        } else {
            System.out.println("더공부하세요 장학금대상이아니네요");
        }
        System.out.println("조회완료#1");

        //Switch Case 문을 이용
        ranking = 6;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학");
                break;
            case 2:
                System.out.println("반액");
                break;
            case 3:
                System.out.println("반액");
                break;
            default:
                System.out.println("장학지원불가");
        }
        System.out.println("조회완료 #2");

        //case 2 3 통합
        ranking = 2;
        switch (ranking) {
            case 1:
                System.out.println("전액 장학");
                break;
            case 2:
            case 3:
                System.out.println("반액");
                break;
            default:
                System.out.println("장학지원불가");
        }
        System.out.println("조회완료 #3");

        //중고 상품의 등급에 따른 가격을 책정(1급 최상 4급 :최하)
        int grade = 1;//등급
        int price = 7000;//기본가격
        switch (grade) {
            case 1:
                price += 1000;
            case 2:
                price += 1000;
            case 3:
                price += 1000;
                break;
        }
        System.out.println(grade + "등급 제품의 가격: " + price + "원");

        //어떤 값이 명확할때 스위치케이스문 활용
        //어떤 조건이나 범위 이용 시 else if문 활용
    }
}
