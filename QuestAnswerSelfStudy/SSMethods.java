package QuestAnswerSelfStudy;

// 강사님 픽 정답(복붙해옴) 이해해보기
public class SSMethods {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // body
    // }
    public int minus(int first, int second) {
        int result = 0;
        try {
            result = first - second;
        } catch (Exception e) {
            // 예외 처리 코드
        }
        return result;
    }

    public int add(int first, int second) {
        int result = 0;
        try {
            result = first + second;
        } catch (Exception e) {
            // 예외 처리 코드
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            SSMethods methods = new SSMethods();
            int first = 2; // 초기값 2
            int second = 1; // 초기값 1
            int result = methods.add(first, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.minus(result, second);
            System.out.println(result); // 출력: 17

        } catch (Exception e) {
            // 예외 처리 코드
        } finally {
            // finally 블록 내용
        }
    }
}