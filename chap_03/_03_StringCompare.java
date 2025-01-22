package chap_03;

public class _03_StringCompare {
    public static void main(String[] args) {
        //문자열 비교
        String s1 = "Java";
        String s2 = "Python";

        System.out.println(s1.equals(s2));//문자열의 내용이 같으면 트루
        System.out.println(s1.equals("Java"));//문자열의 내용이 같으면 트루
        System.out.println(s2.equals("python"));//false
        System.out.println(s2.equalsIgnoreCase("python"));//대소문자 구분없이 내용만 같으면 트루

        //문자열 비교 심화
        s1="1234"; //식당 벽에 붙은 메모지의 비밀번호 정보 (참조!)
        s2="1234";
        System.out.println(s1.equals(s2));//true (내용)
        System.out.println(s1==s2);//true (참조)

        s1 = new String("1234");
        s2 = new String("1234");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2);//false 서로다른 메모리 공간에 각각존재(뉴스트링 이용시)
        //따라서 자바에서 내용 비교할거면 등호말고 equals쓰기



    }
}
