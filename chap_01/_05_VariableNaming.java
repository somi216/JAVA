package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        /*
        변수 이름 짓는 법
        1. 저장할 값에 어울리는 이름
        2. 밑줄, 문자, 숫자 사용 가능 (공백 사용불가
        3. 밑줄또는 문자로 시작 가능
        4. 한 단어 또는 두개 이상 단어의 연속
        5. 소문자로 시작, 각 단어의 시작 글자는 대문자( 첫 단어 제외
        6. 예약어 사용불가(public static void int double float
        */

        //입국 신고서(여행)
        String nationality = "대한민국";//국적
        String firstName = "소미";//이름
        String lastName = "나";//성
        String dateOfBirth = "2006-01-23";//생년월일
        String residentialAddress = "칸나 호텔";//체류지
        String purposeOfVisit = "관광";//입국목적
        String flightNo = "GO88";//항공편명
        String _flightNo = "GO88";//밑줄시작
        String flight_no_2 = "GO88";//밑줄과 숫자 포함
        //String -flightNo = "GO88"; 변수명 하이픈 시작 불가

        int accompany = 2;//동반 가족 수
        int lengthOfStay = 5;//체류기간

        String item1 = "시계";
        String item2 = "가방";
        //String 3item = "전자제품"; 변수명 숫자 시작 불가

        //프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을때)
        int i = 0;
        String s ="";
        String str ="";

        //절대 변하지 않는 상수는 대문자로
        final String CODE="KR";
        //CODE = "US" 대문자 변수명의 상수는 값의 제 할당이 불가
    }
}
