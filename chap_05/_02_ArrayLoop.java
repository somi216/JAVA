package chap_05;

public class _02_ArrayLoop {
    public static void main(String[] args) {
        //배열의 순회
        String[] coffees = {"아메리카노","카페모카","라떼","카푸치노"};
//        System.out.println(coffees[0]+"하나");
//        System.out.println(coffees[0]+"하나");
//        ...

        //for 반복문 순회
        for (int i = 0; i < 4; i++) {
            System.out.println(coffees[i]+" 하나");
        }
        System.out.println("주세요");

        System.out.println("====");

        //배열의 길이를 이용한 순회
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i]+" 하나");
        }
        System.out.println("주세요");

        System.out.println("====");

        //enhanced for (for-each) 반복문
        //foreach 라고치면 자동 형식 완성, 탭으로 구문 속 위치 이동 가능
        // ㄴ안되길래 직접 추가함... iter 축약어 사용시 또 포이치문 된다함

        for (String coffee : coffees){
            System.out.println(coffee + " 하나");
        }
        System.out.println("주세요");
        //for each 문 사용시 배열 순회를 처음부터 끝까지 가능
        //fori 사용시 추가코드를 활용, 인덱스값으로 배열 순회 조정이 가능

    }
}
