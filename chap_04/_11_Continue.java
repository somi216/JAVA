package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        //Continue

        //치킨 주문 손님중에 노쇼 손님이 있다고 가정
        //For
        int max = 20;
        int sold =0;
        int noShow=17;
        for (int i = 1; i <= 50 ; i++) {
            System.out.println(i+"번 손님, 주문하신 치킨 나왔습니다");

            //손님이 없다면?(노쇼고객)
            if(i==noShow){
                System.out.println(i+"번 손님, 노쇼로 인해 기회넘어감");
                continue;
            }

            sold++;//판매처리
            if(sold==max){
                System.out.println("금일 치킨 모두 소진");
                break;
            }
        }
        System.out.println("영업 마칩니다");

        System.out.println("------");

        //While문
        sold=0;
        int index = 0;//손님 번호
        //while (index<=50)
        while(true){
            index++;
            System.out.println(index+"번 손님, 주문하신 치킨입니다");

            //손님이 없다면 (노쇼)
            if(index==noShow){
                System.out.println(index+"번 손님 노쇼로 기회넘어갑니다");
                continue;
            }
            sold++;//판매처리
            if(sold==max){
                System.out.println("금일 재료 모두 소진");
                break;
            }
        }
        System.out.println("영업을 종료");
    }
}
