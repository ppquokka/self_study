package QuestAnswerSelfStudy;
// 강사님 픽 정답(복붙해옴) 이해해보기
public class SSMethodBasics {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    // x에 +1
    public int F(int x) // x = 0
    {
        int result = x + 1;
        return result;// 밖으로 던져버려 
    }
    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1; // 변수에 + 1
            // y = F(x);
            SSMethodBasics methodBasics = new SSMethodBasics();
            y = methodBasics.F(x);
            //호출 
            y = y + 1; // 변수에 + 1
            SSMethodBasics methodBasics_first = new SSMethodBasics();
            y = methodBasics_first.F(y);  // F(0) x=y=6이라는 값이 호출해서 넘어가 
            y = methodBasics_first.F(y);  // F(0)

        } catch (Exception e) {
            // TODO: handle exception // 해당영역의 살아남은 변수 string이 보임
        }
        System.out.println();
        // return 0;
    }
}
   