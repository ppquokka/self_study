import java.util.Scanner;
public class PollsWithoutMethod {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        // ↓ 변수는 먼저 선언하는것이 좋다.먼저 선언하면 그 다음부터는 변수부터 바로 작성해도 됨
        String answer = "";
        // ↓ 변수를 묶는다 = 움직이기 쉽다 (예: 숫자의 묶음이네! 문자의 묶음이네!)
        String[] answers = {"", ""};
        // ↓ 반복문을 돌리겠다(문제3,4). 먼저 값을 묶음으로 묶는다.
        String[][] polls = {
            {"1. 문항"}, 
            {"(1) 답항","(2) 답항","(3) 답항","(4) 답항"},
            {"2. 문항"}, 
            {"(1) 답항","(2) 답항","(3) 답항","(4) 답항"},
        };
        // 내부에서 사용할 변수값  
        int count = 0;
        // 문항만 찍는다
        for (int second=0; second < polls.length; second = second +2){
            System.out.println(polls[second][0]);
            // 답항 출력
             System.out.print("답하기 : ");
             answers[count] = myObj.nextLine();
             count = count + 1;
            System.out.println();
        } 

        // System.out.println("1. 문항");
        // System.out.println("(1) 답항"+"(2) 답항"+"(3) 답항"+"(4) 답항");
        // System.out.print("답하기 : ");
        // answers[0] = myObj.nextLine();   

        // System.out.println("2. 문항");
        // System.out.println("(1) 답항"+"(2) 답항"+"(3) 답항"+"(4) 답항");
        // System.out.print("답하기 : ");
        // answers[1] = myObj.nextLine(); 

        // // 반복이 된다는 건 while이나 for문 사용 가능하다.그럼 데이터를 넣고 

        // System.out.println("---------------------설문 종료---------------------");
        // System.out.println("---------------------설문 결과---------------------");

        for (int first=0; first < answers.length; first = first + 1 ){
           System.out.print(answers[first]+",");
        }
        System.out.println();
        // return 0; 
    }
}