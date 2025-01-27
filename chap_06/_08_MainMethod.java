package chap_06;

public class _08_MainMethod {
    public static void main(String[] args) {
        for (String s  : args){
            System.out.println(s);
        }

        //1. 도서 조회
        //2. 도서 대출
        //3. 도서 반납

        if(args.length==1){
            switch (args[0]){
                case "1":
                    System.out.println("도서 조회 메뉴");
                    break;
                case "2":
                    System.out.println("도서 대출 메뉴");
                    break;
                case "3":
                    System.out.println("도서 반납 메뉴");
                    break;
                default:
                    System.out.println("잘못 입력 하셨습니다.");

            }
        } else{
            System.out.println("(사용법) \n1~3 메뉴 중 하나를 입력하세요");
        }

        //현재파일-구성편집에 전달값을 넣어(1,1 3 등) 실행해보는 예제
    }
}
