package chap_04;

public class _03_Elseif {
    public static void main(String[] args) {
        //조건문 ElseIf
        //한라봉에이드가있으면 +1
        //또는 망고주스가있으면 +1
        //또는 아이스 아메리카노+1

        boolean hallabongaAde = true;//한라봉에이드
        boolean mangoJuice = true;//망고주스

        if(hallabongaAde){
            System.out.println("한라봉 에이드 +1");
        } else if(mangoJuice){
            System.out.println("망고 주스 +1");
        } else{
            System.out.println("아아+1");
        }
        System.out.println("음료 주문완료 #1");

        //else if는 여러번 사용 가능
        hallabongaAde = false;
        mangoJuice = false;
        boolean orangeJuice = true;

        if(hallabongaAde){
            System.out.println("한라봉 에이드 +1");
        } else if(mangoJuice){
            System.out.println("망고 주스 +1");
        } else if(orangeJuice) {
            System.out.println("오렌지 주스 +1");
        } else{
            System.out.println("아아+1");
        }
        System.out.println("음료 주문완료 #2");

        //else는 없어도됨
        hallabongaAde = false;
        mangoJuice = false;
        orangeJuice = false;

        if(hallabongaAde){
            System.out.println("한라봉 에이드 +1");
        } else if(mangoJuice){
            System.out.println("망고 주스 +1");
        } else if(orangeJuice) {
            System.out.println("오렌지 주스 +1");
        }

        System.out.println("음료 주문완료 #3");

    }
}
