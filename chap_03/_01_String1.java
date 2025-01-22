package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";
        System.out.println(s);

        //문자열의 길이
        System.out.println(s.length());//29
        //리뷰 글자수 제한 기능 시 사용가능

        //대소문자 변환
        System.out.println(s.toUpperCase());//문장 알파벳을 대문자로
        System.out.println(s.toLowerCase());//소문자로

        //포함 관계
        System.out.println(s.contains("Java"));//포함된다면 트루
        System.out.println(s.contains("C#"));//포함되지않는다면 false
        System.out.println(s.indexOf("Java"));//위치 정보 7
        System.out.println(s.indexOf("C#"));//포함되지 않는다면 -1
        System.out.println(s.indexOf("and"));//처음 일치 위치 정보 12
        System.out.println(s.lastIndexOf("and"));//마지막 일치 위치정보 23
        System.out.println(s.startsWith("I like"));//이 문자열로 시작하면 true
        System.out.println(s.endsWith("."));//이 문자열로 끝나면 트루

        String d = "I like Java and Python and C.";
        System.out.println(d.indexOf("Java"));//위치 정보 7
    }
}
