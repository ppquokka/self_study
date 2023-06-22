public class GitConflicts {
    //  B 개발자 (Develops/anotherme/study_javas)
    public static void main(String[] args) {
        try {
            int first = 0;
            first = first + 1;
    //  A 개발자 (Develops/study_javas)
            int second = 1;
            second =first + 1;            
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
