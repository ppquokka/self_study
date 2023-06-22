package pollsus;

import java.util.Scanner;

public class PollScanners {
    public String[] pollWithAnswers(String[][] polls) {
        String[] answers = {"", ""};
     try {
        int count = 0;
        Scanner myObj = new Scanner(System.in);
        for (int second=0; second < polls.length; second = second +2){
            System.out.println(polls[second][0]);             //polls 사용됨
            
             System.out.print("답하기 : ");
             answers[count] = myObj.nextLine();
             count = count + 1;
            System.out.println();
        }
        myObj.close(); 
     } catch (Exception e) {
        // TODO: handle exception
     }   
     return answers;
    }
}
