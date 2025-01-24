package chap_04;

public class _06_While {
    public static void main(String[] args) {
        //반복문 While
        //수영장에서 수영을 하는 모습
        int distance = 25;//전체거리 25m
        int move=0;//현재이동거리0m
        while(move<distance){//현재 이동 거리가 전체거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재이동거리 "+move+"m");
            move +=3;//3미터 이동
        }
        System.out.println("도착하였습니다");

        //무한루프(무브 이동 식을 작성하지않음. 와일문에서는 무한루프에 빠지지않도록 주의)
        /*
        move=0;
        while(move<distance){//현재 이동 거리가 전체거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다");
            System.out.println("현재이동거리 "+move+"m");
        }
        System.out.println("도착하였습니다");
        */
    }
}
