public class LoopWhiles {
    public static void main(String[] args) {
        // if의 확장팩
        // while (condition) {
            // code block to be executed
        //   }
        int first = 5;
        int second = 10;
        // 컴퓨터 랭귀지는 변하는 수를 좋아함. 변하지 않는 수(상수5,3,7 등)는 사용하지 않는것이 좋음
        while (first < second) {
            System.out.println(first);
            // while문 2번 돌리고 끝내기위한 기준 작성
            first = first + 2;  
        }
        System.out.println();
        
        // return 0;
    }
}
