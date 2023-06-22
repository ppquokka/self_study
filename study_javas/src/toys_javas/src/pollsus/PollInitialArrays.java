package pollsus;

public class PollInitialArrays {
    public String[][] init(){              // 초기화.  값이 안넘어간다.
        String[][] polls = {
            {"1. 문항"}, 
            {"(1) 답항","(2) 답항","(3) 답항","(4) 답항"},
            {"2. 문항"}, 
            {"(1) 답항","(2) 답항","(3) 답항","(4) 답항"},
        };
        return polls;                           // 여기서 리턴하는 값. 펑션 호출.
    }
    
}
