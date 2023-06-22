import java.util.Scanner;

public class Polls {
    public static void main(String[] args) {
        try{
            String answer = "";
            Scanner myObj = new Scanner(System.in);
            System.out.println("선택에 따라 안내들을 보여드립니다.");
            boolean loops = true;
            while (loops) {
                System.out.println("(E)xit : 종료, (P)oll : 설문 시작, (S)tatistic: 설문 통계");
                System.out.println("선택 입력 :");
                answer = myObj.nextLine();
                    if(answer.equals("E || Exit")){
                        System.out.println("-----설문 종료-----");
                    } else if(answer.equals("P || Poll")){
                        System.out.println("-----설문 시작-----");
                    } else {
                        System.out.println("-----설문 통계-----");
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