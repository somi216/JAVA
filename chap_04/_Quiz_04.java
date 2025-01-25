package chap_04;

public class _Quiz_04 {
    public static void main(String[] args) {
        /*
        조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오

        -주차요금은 시간당 4000원 (일일 최대 요금은 30000원)
        -경차 또는 장애인 차량은 최종 요금에서 50%할인

        ex
        일반차량 5시간 주차시 20000원
        경차 5시간 주차 시 10000원
        장애인 차량 10시간 주차시 15000원
         */

        /*
        String car = "일반";

        int hour = 5;
        int sum=0;
        while(true){
            if(car.equals("일반")) {
                for (int i = 1; i < hour + 1; i++) {
                    sum += i * 4000;
                    sum=sum+i
                }
                break;
            }
            else if(car.equals("장애인 차량") ||car.equals("경차")){
                    for (int i = 1; i < hour +1; i++) {
                    sum+= i*4000;
                    }
            sum= (int) (sum*0.5);
            break;
            }

        } System.out.println(sum+"원");
        */

        //내 풀이 코드
        String car = "장애인 차량";
        int hour = 10;
        int sum=0;
        while(true){
            if(car.equals("일반")) {
                sum=hour*4000;
                if(sum>=30000){
                    sum=30000;
                }
                break;
            }
            else if(car.equals("장애인 차량") ||car.equals("경차")){
                sum=hour*4000;
                if(sum>=30000){
                    sum=30000;
                }
                sum=(int)(sum*0.5);
                break;
            }

        } System.out.println("주차 요금은 "+sum+"원 입니다.");


        //강의자 답 코드
        int hour2=5;//주차시간
        boolean isSmallCar = true;//경차 여부
        boolean withDisabledPerson = false; //장애인 차량 여부

        int fee = hour2 * 4000; // 주차정산요금(시간*4000)

        //30000원 초과 시 일일 최대 요금으로 수정
        if(fee>30000){
            fee=30000;
        }

        //경차또는 장애인 차량인 경우 50% 할인
        if(isSmallCar||withDisabledPerson){
            fee/=2;//50퍼할인 적용
        }

        //실행결과 출력
        System.out.println("주차 요금은 "+fee+"원 입니다.");

    }
}
