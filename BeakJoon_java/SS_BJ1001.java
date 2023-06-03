package BeakJoon_java;
/*백준에는 파일명 Main으로
 * 문제: 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램 작성
 * 입력: 첫째 줄에 A,B주어짐 (0<A, B<10)
 * 출력: 첫째 출에  A-B 출력
*/
/*import java.util.Scanner;

public class SS_BJ1001 {      
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            // Scanner 객체명 = new Scanner(System.in);
            // 보통 가장 많이 쓰는 객체명으로 in, scan, sc
            int A = 0;
            int B = 0;

            System.out.println(A-B);  
            
            scanner.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}*/

import java.util.Scanner;

public class SS_BJ1001 {      
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A-B);  
            
            scanner.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}

