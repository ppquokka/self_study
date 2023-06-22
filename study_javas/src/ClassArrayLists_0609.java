import java.util.ArrayList;
/* data는 묶여서 유틸리티에있음
   java projects의 src를 import가 보고있음*/
public class ClassArrayLists_0609 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1,2,3};
            // 기존 array는 초기 입력 값(size)을 벗어나지 못함.버켓사이즈 미리 설정 필요
            ArrayList arrayList = new ArrayList();  //class를 사용하려면 우선 초기화(instance) 해라
                                     // List는 순서화 되어있는 데이터 구조를 넣는것..? 알고리즘과 자료구조 알아야...
                                     // list = array   | 기존의 array와 구분하기 위해 list에 붙임 
                                     // array의 단점을 보완함 size에 제한 없음
                                     // 얘는 class는 무조건 펑션을 통해 값을 더하거나, 삭제하거나, 바꾸는 것 등 가능
            arrayList.add(1); // true
            arrayList.add(2); // true
            arrayList.add(3); // true
                                     /* ArrayList.add(1);      // 버켓 사이즈 미리 설정 필요 없음
            ArrayList.add(2);     숫자, class 뭉치 들어갈 수 있음
            ArrayList.add(3);     class안에 array나 데이터묶음은 눈 표시로 나타남 */
            arrayList.size();   // 3
            // int val = arrayList.get(2); // 나중에 캐스케이딩이필요하다??? Cannot evaluate because of compilation error(s): Type mismatch: cannot convert from Object to int.
            arrayList.set(1, 5); // Integer@37 "2"  | 2를 5로 바꿈 
            arrayList.remove(0); // Integer@34 "1"   | 1삭제
            arrayList.clear(); // (void)  삭제된다. 하지만 구조는 살아있기에 다시 사용 가능하다
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
