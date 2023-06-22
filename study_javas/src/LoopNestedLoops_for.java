public class LoopNestedLoops_for {
    public static void main(String[] args) {
        for (int first = 1; first < 5; first = first + 1) {
            System.out.println("for" + first);
            for (int second = 1; second <= 4; second = first + 1) {
                if (first >= second){
                    System.out.print("_?");
                }
                // else break 넣으면 되지만 굳이 아직은 안넣어도 됨
            }
            System.out.println();     
        }
        System.out.println("end");
        // return 0;
    }    
}
    
