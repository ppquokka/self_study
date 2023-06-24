package W3School.QuestAnswerSelfStudy;
public class SSForLoop {
        public static void main(String[] args) {
            
            try {

                /*for(int first = 0; first < 5; first++){
                    System.out.println(first);
                }*/

                for(int alpha=1; alpha<=2; alpha++){
                    System.out.println("Outer: "+ alpha);

                    for (int beta = 1; beta <= 3; beta++) {
                        System.out.println("Inner: "+ beta);
                    }
                }
            } catch (Exception e) {
                // TODO: handle exception
            } finally {
    
            }
            System.out.println();
            // return 0;
        }
    }
