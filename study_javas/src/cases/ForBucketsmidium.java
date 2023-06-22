package cases;
import java.util.Scanner;
// 문제:장바구니에 3개만 담고, 내역 출력
public class ForBucketsmidium {
    public static void main(String[] args) {        
        try {
            /*변수를 넣어보기.  변수는 숫자로 넣으면 안됨.*/
            // 장바구니 3가지만 담게 선언
            String bucket_1 = "";
            String bucket_2 = "";
            String bucket_3 = "";
            String[] bucket = {"","",""};

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            // '3'대신 length 넣는게 좋다
            // error는 1.물결무늬로 나오는 문법적 오류   2.realtime error. 시행했을 때만 나오는 오류
            // 위의 2번은 묶음 변수를 사용하면 만남
            // first < 4  : 조건
            // 묶음 변수 범위를 넘어가는걸 발생하지 않게 하기위해 변수 대신 length를 넣음. 
            for (int first=0; first < bucket.length; first = first +1) {
                // 데이터의 숫자 시작점으로 맞추기. 1로 시작할지 0로 시작할지 고민일 때
                // 1씩 증가하는게 있는지확인하기. 문자와 숫자는 붙일 수 있다
                // 내가 원하는 걸 먼저 ()로 묶는다
                System.out.print((first+1)+" 번째 담기 : ");
                // 변하는 값을 넣어준다
                bucket[first] = myObj.nextLine(); // Read user input
            }
            // index : 순서에 맞는 색인.  주로 숫자 사용.  실제 시행해보면 'Out of index'
            // 묶음 변수에서 가장 많이 하는 실수. 묶음 변수 범위를 넘어서 ecess했을 때 나타남. 주로 for문
            System.out.println("---담은 내용물---");
            System.out.print(bucket[0]+ ",");
            System.out.print(bucket[1]+ ",");
            System.out.print(bucket[2]);

        } catch (Exception e) {
            // TODO: handle exception
        } finally {

        }
        System.out.println();
        // return 0;
    }
}
