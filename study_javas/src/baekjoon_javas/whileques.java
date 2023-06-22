package baekjoon_javas;

public class whileques {

    public static void main(String[] args) {
        try {
            // 질문 문항 while 문으로 프린트하기
            int ques = 0;
            while (ques < 4) {
                System.out.println(ques);
                ques = ques + 1;
            }

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
    
}
