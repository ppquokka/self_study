public class WhileWithScanners {
    public static void main(String[] args) {
        // Try Catch문 사용 (기본 펑션 양식 이제 이렇게 (23.05.26))
        try {
            // break문에 대한 사용법 알기  (이제는 try...catch모드 안에만 코드 작성)
            for (int first=0; first<4; first=first+1) {
                if (first == 2) {   //first 값이 2이면 for문 종료
                    break;
                }
                // 이젠 print안 씀
                System.out.println();          
            }
                
        } catch (Exception e) {
            System.out.println();
        } finally{
            // 확인 때문에 넣는 것으로 실제는 넣으면안됨
            System.out.println();
        }        
        System.out.println();
        // return 0;
    }
}
// 왼쪽 watch의 상태를 보면서 내가 원하는대로 작동하는지 확인 필요
// 변하는 값을 다 등록해놓고, 정확하게 내가 인지하고 확인한 값은 빼면서 진행
// data를 보고 어떻게 소스가 흘러갈지 예상 연습 필요. 누르기 전에 브레이크로 나올 타이밍이면, 코드의 흐름을 예상해봐야 한다. 