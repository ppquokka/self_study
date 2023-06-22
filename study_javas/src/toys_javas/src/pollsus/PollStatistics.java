package pollsus;

public class PollStatistics {
    // void  리턴하거나, 사용 할 파라미터가 없을 때 사용하는 것. 하지만 이건 사용 안함
    public int printAnswers(String[] answers) {
        try {
            for (int first=0; first < answers.length; first = first + 1 ){
                System.out.print(answers[first]+",");
             }
        } catch (Exception e) {
            // TODO: handle exception
        }
         return 1;          //대게 성공하면 0, 실패하면 1?????     
    }    
}
