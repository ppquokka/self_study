package BeakJoon_java;
import java.util.Scanner;

public class SS_BJ1000 {   //백준에는 'Main'으로 넣기. 시작은 대문자!!!
        public static void main(String[] args) {
            // 1000번  A+B
            try {
                Scanner scanner = new Scanner(System.in);

                int A = scanner.nextInt();    // 0 < A
                int B = scanner.nextInt();    // B < 10
                int sum = A + B;                   
                System.out.println(sum);

                scanner.close();
                
            } catch (Exception e) {
                // TODO: handle exception
            } finally {
    
            }
            // return 0;
        }
    }
