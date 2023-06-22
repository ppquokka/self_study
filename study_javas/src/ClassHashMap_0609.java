import java.util.HashMap;
public class ClassHashMap_0609 {
    public static void main(String[] args) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("first",1);  // null
            hashMap.put("second",2);  // null
            hashMap.put("third",3);  // null
            hashMap.get("third");  // Integer@34 "3" -> value:3  : 3 불러오기
            hashMap.size();  // 3
            hashMap.put("second", 5);  // Integer@32 "2" -> value:2  : 5로 바꿈
            hashMap.remove("second");  //  Integer@57 "5"  : tkrwp
            hashMap.keySet();  // HashMap$KeySet@65 size=2  0:"third"  1:"first"   | for문을 돌려서 해당되는 key값을 확인할 수 있음
                               /*이 key값으로 list를 돌려서 내가 갖고있는 모든 hashMap값을 보고싶을 때*/
            hashMap.values(); // HashMap$Values@69 size=2  0:Integer@34  1:Integer@29
                              /* class단위로 나온다. 이는 hashMap안에 클래스 단위 리스트, 해쉬맵 등을 또 넣을 수있다
                                 왜냐 여기 들어가는 값이 class여서 확장성이 크기 때문
                                 value로 들어가는게 class구나!!! */    
            hashMap.clear(); // (void)    : 초기화                  
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
