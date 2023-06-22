import java.util.Scanner;
public class pollsWithoutMethod{
    public static void main(String[] args) {
        System.out.println(">이름을 입력하세요");
        // 입력 준비
        Scanner myObj = new Scanner(System.in);
        String sun = "이름)";
        String moon = "";
        moon = myObj.nextLine();
        System.out.println(sun+moon);
           String[][] Question = {
                                   {"1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?"},
                                   {"①전혀 아니다","②아니다","③그렇다","④매우 그렇다"}
                                  };
                        for (int first=0; first < Question.length; first = first + 1){
                            int alpha =3;
                            for (int beta = 0; beta < alpha; beta = beta + 1) {
                                System.out.println(beta);
                            }
                            for (int second=0; second < Question[first].length; second = first + 1){
                                System.out.println(Question[first][second]); 
                            }  
                        }           
                        System.out.println();

    }
}
// return 0;