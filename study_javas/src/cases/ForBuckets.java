package cases;
import java.util.Scanner;
// 문제:장바구니에 3개만 담고, 내역 출력
public class ForBuckets {
    public static void main(String[] args) {        
        try {
            /*변수를 넣어보기.  변수는 숫자로 넣으면 안됨.*/
            // 장바구니 3가지만 담게 선언
            String bucket_1 = "";
            String bucket_2 = "";
            String bucket_3 = "";

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.print("1번째 담기 : ");
            bucket_1 = myObj.nextLine(); // Read user input
            System.out.print("2번째 담기 : ");
            bucket_2 = myObj.nextLine(); // Read user input
            System.out.print("3번째 담기 : "); 
            bucket_3 = myObj.nextLine(); // Read user input

            System.out.println("---담은 내용물---");
            System.out.print(bucket_1+ ",");
            System.out.print(bucket_2+ ",");
            System.out.print(bucket_3);

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        System.out.println();
        // return 0;
    }
}
