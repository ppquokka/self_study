public class LoopNestedLoops {
    public static void main(String[] args) {
        for (int first = 1; first < 5; first = first + 1) {
           System.out.println("for " +  first);
        //    for (int second = 1; second <= 4; second = second +1) {
            int second = 4;
            if (second > 1){
               System.out.println("_?");
            }
            if (second > 2){
                System.out.println("_?_?");
             }
            if (second > 3){
                System.out.println("_?_?_?");
             }
            if (second <= 4){
                System.out.println("_?_?_?_?");
             }
            if (second <= 5){
                System.out.println("_?_?_?_?_?");
             }
              break;
            }
            
            System.out.println("end");
                       
        // return 0;
        // 질문의 기준점을 꼭 순서대로 하지 않아도 된다. 뒤에서부터 해도, 중간부터 해도, 
        // 2개가 아니라 =인가? 인1개를 물어봄으로써 기준점을 삼을 수도 있다.
    }
}
    
