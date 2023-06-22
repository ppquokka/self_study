import java.util.Scanner;

public class WhileWithScannerscopy {
    // 콜센터 업무 안내 작성
    public static void main(String[] args) {
        // Try Catch문 사용 
        try{
            // 변수선언은 밖에작성하는게 좋다
            String answer = "";
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("안내입니다.");
            // 그래서 문자가 true일 때 루프돌도록 작성
            boolean loops = true;
            // 1,2가 아니면 루핑에서 나가야 함. 1,2는 true이면 돌기때문에 이를 true로 본다.
            while (loops) {
                System.out.println("1-대출, 2-예금, 3~9-종료");
                System.out.print("입력 하세요 : ");
                answer = myObj.nextLine();
                if (answer.equals("1")) {
                    System.out.println("대출 업무입니다.");        
                } else if (answer.equals("2")) {
                    System.out.println("예금 업무입니다.");    
                } else {
                    System.out.println("업무가 종료됩니다.");
                    break;
                }    
            }  
        } catch (Exception e) {
            System.out.println();
        } finally{
            System.out.println();
        }        
        System.out.println();
        // return 0;
    }
}