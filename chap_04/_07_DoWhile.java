package chap_04;

public class _07_DoWhile {
    public static void main(String[] args) {
        //반복문 DoWhile
        int distance = 25;//전체거리
        int move = 0;//현재이동거리
        int height = 2;

        while(move+height<distance){
            System.out.println("발차기중");
            System.out.println("현재이동거리 "+move+"m");
            move+=3;//3미터이동
        }
        System.out.println("도착했음");
        System.out.println("---반복문 #1완");

        //키가 엄청나게 큰 사람?
        move = 0;
        height = 25; //키가 25..?
        while(move+height<distance){
            System.out.println("발차기중");
            System.out.println("현재이동거리 "+move+"m");
            move+=3;//3미터이동
        }
        System.out.println("도착했음");
        System.out.println("---반복문 #2완");

        //DoWhile반복문
        do{
            System.out.println("발차기중");
            System.out.println("현재이동 " +move+"m");
            move+=3;
        } while(move+height<distance);
        System.out.println("도착했습니다.");
    }
}
