package chap_06;

import java.lang.invoke.SwitchPoint;

public class _Quiz_06 {
    public static String getHiddenData2(String text, int number){
        String textFix = "";
        switch(text.length()){
            case 3:
                textFix = text.substring(0,1)+"**";
                break;
            case 14:
                textFix = text.substring(0,8)+"******";
                break;
            case 13:
                textFix = text.substring(0,9)+"****";
                break;
        }
        return textFix;

    }

    public static String getHiddenData(String data, int index) {
        String hiddenData = data.substring(0, index);
        //for (int i = index ; i < data.length(); i++)
        for (int i = 0; i < data.length() - index; i++) {
            hiddenData += "*";
        }
        return hiddenData;
    }

    public static void main(String[] args) {
        /*
        개인 정보 중 일부를 비공개로 전환하는 프로그램을 작성하시오

        -개인정보를 비공개로 전환하는 메소드 작성
        -하나의 메소드에서 모든 동작 처리
        -각 정보는 아래 위치부터 비공개적용
        (이름 2번째글자
        주민등록번호(-포함) 9번째글자
        전화번호(-포함) 10번째글자)

         */

        String name = "나소미";
        String id = "990130-1234567";
        String phone = "010-1234-5678";

        System.out.println("이름 : "+getHiddenData(name,1));
        System.out.println("주민등록번호 : "+getHiddenData(id,8));
        System.out.println("전화번호 : "+getHiddenData(phone,9));
    }
}
