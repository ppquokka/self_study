public class LoopWithMark {
    public static void main(String[] args) {
        // for문만 사용. while문 사용 불가
        // 1~5번째 줄에 줄숫자만큼 ?표시
        int second = 5;        
        for (int first = 1; first < second; first = first + 1){
            System.out.println("for" +", " + first);
        }        
        System.out.println();

    }
}
