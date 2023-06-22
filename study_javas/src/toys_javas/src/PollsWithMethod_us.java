/*23.06.01.(목)  강사님풀이
 */

import pollsus.PollInitialArrays;
import pollsus.PollScanners;
import pollsus.PollStatistics;

public class PollsWithMethod_us {
    public static void main(String[] args) {
        try {
            String[] answers;
            String[][] polls;
            PollInitialArrays PollInitialArrays = new PollInitialArrays();   //인스턴스화만 시킴
            //변수 타입  변수
            polls = PollInitialArrays.init();   // 설문 내용 초기화    //:)폴스의 배열스트링이 나옴
            PollScanners pollScanners = new PollScanners();
            answers = pollScanners.pollWithAnswers(polls);
            PollStatistics pollStatistics = new PollStatistics();
            pollStatistics.printAnswers(answers);  // 리턴값이 없으므로 끝
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }

}
