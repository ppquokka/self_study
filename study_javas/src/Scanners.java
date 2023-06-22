import java.util.Scanner;   //외부의 것을 사용하려함
public class Scanners {
    public static void main(String[] args) {
        // 입력을 받는 준비. 
        Scanner myObj = new Scanner(System.in);
        // 이 펑션이 끝나는 부분에 close선언 필요
        // 펑션을 사용한다 → 인스턴스 화'new' → data type이 뭔지확인 →  
        // Create a Scanner object
        // System.out.println("Enter username");
    
        // // nextLine 이 실제 입력을 받음. 스캐너 선언 후 String에 아래의 코드를 입력하면 문자를 받을 수 있음
        // String userName = myObj.nextLine();  // Read user input
        // System.out.println("Username is: " + userName); // Output user input
        
        int first = 0;
        int second = 0;
        first = myObj.nextInt();
        second = myObj.nextInt();
        System.out.println(first +", "+second);
        myObj.close();
        // return 0;
    }

    public String nextLine() {
        return null;
    }    
}
