package chap_04;

public class _05_For {
    public static void main(String[] args) {
        //반복문 For
        //나코 매장
        System.out.println("어서오세요 나코입니다");
        //또다른 손님이 들어옴
        System.out.println("어서오세용 나코입니다");
        System.out.println("어서오세요 나코입니다");
        //만약 인사법이 바뀌면
        System.out.println("환영합니다 나코입니다");
        System.out.println("환영합니다 나코입니다");
        System.out.println("환영합니다 나코입니다");
        //매장이름이 바뀜 코나로
        System.out.println("환영,위아코아");
        System.out.println("환영,위아코아");

        System.out.println("--반복문 사용--");

        //반복문 사용
        //선언 조건 증감 순
        for(int i = 0;i<10;i++){
            System.out.println("어서오세요 나코입니다 "+(i+1));
        }

        //짝수만 출력 fori 만 적고 엔터
        //0 2 4 6 8
        for ( int i =0;i<10;i+=2){
            System.out.print(i);
        }
        //프린트 뒤에 ln지우면 줄바꿈 안됨

        System.out.println();//sout괄호 아무내용 없을시 줄바꿈만 들어감

        //홀수만 출력
        //13579
        for (int i = 1; i < 10; i+=2) {
            System.out.print(i);
        }

        System.out.println();

        //거꾸로 숫자
        //5 4 3 2 1
        for (int i = 5; i >0 ; i--) {
            System.out.print(i);
        }

        System.out.println();

        //1부터 10까지 수들의 합
        //1+2+..+10=55
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum+=i;
            System.out.println("현재까지 총합은 "+sum);
        }
        System.out.println("1부터 10까지 총합은 "+sum);
    }
}
