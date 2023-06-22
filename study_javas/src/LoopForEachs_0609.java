import java.util.ArrayList;
import java.util.HashMap;
//refer : https://www.w3schools.com/java/java_foreach_loop.asp
public class LoopForEachs_0609 {
    public static void main(String[] args) {
        try {
            //for (type variableName : arrayName) { 
            // code block to be executed
                                                 
            //  }

            /* array, arraylist(뭉치), hashMap 중 hashMap은 array방식이 아니라 사용 불가
             * hashMap을 루프 돌리고 싶으면, keyset으로 바꿔서 루프 돌릴 수 있다  
             * arrayname(뭉쳐있다)이 false가 될 때 for문이 멈춘다. true일 때는 계속돈다.
             * 앞은 for문 안에서 사용할 변수 이름
             * array변수로 넣어준 뭉치를 for문 처음 돌 때 variableName에게 첫번째를 던져줌
             * 나온 얘는 브레이스 안에서 사용 가능한 뭉치가 나옴. 프린트,연산 등 사용 가능
             * 우리는 이제부터 arraylist만 사용한다!!!
             */
            ArrayList<String> cars = new ArrayList<String>();  
            // ★제너릭 기술: <변수 형식>을 넣는다.  이후 상속에서 자세히  배움
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
        //for (type           variableName :                 arrayName) {
        //  "Volvo"는 문자      for문 내에서 사용할 변수 이름    cars
        // code block to be executed
        //  }
            //이터레이터로 바꿔주는 역할을 함
            // for (String car: cars){
            //     System.out.println(car);
            // }

            /* hashMap으로 "회사, 탈것이름"으로만들기
            // Automobile Company	Vehicle Names
            컬럼별로 (키,밸류)로 해쉬맵으로 묶고, 리스트로 다시 묶어서 row묶음 1개 나옴 */
            ArrayList<HashMap> carList = new ArrayList<HashMap>();   //원래는 Map이라고 넣어야 함 
            HashMap<String, String> carTable = new HashMap<String, String>();
            carTable.put("CarCompany", "BMW");
            carTable.put("CarName", "3Series");
            carTable.put("Year", "2022");
            carList.add(carTable);                  // 1번째.하나의 record 단위로 움직임
            
            /* 기존값과 새로운값을 유지해야하므로 instance 넣어준다.
            컴퓨터 매모리의 버켓을 새로 설정해줘야 계속 값이 변화된다. 
            그렇지 않으면 맨처음 row에 값이 계속 덮어씌워진다
            그래서 매번 새로 instance해줘야 함 */
            carTable = new HashMap<String, String>();
            carTable.put("CarCompany", "현대");
            carTable.put("CarName", "쏘나타");
            carTable.put("Year", "2023");
            carList.add(carTable);                 // 2번째 record
            /* instance (new이름) 똑같은 이름이라고 해도, 컴퓨터 메모리에 그 변수의 버켓 공간 만들어줌
             * 그럼 table 모양으로  나온다 */
            carTable = new HashMap<String, String>();
            carTable.put("CarCompany", "Ford");
            carTable.put("CarName", "Mustang");
            carTable.put("Year", "2020");
            carList.add(carTable);                 // 3번째  record
            
            /*묶여있는 array. arrayList 사용가능
            class이기때문에 펑션으로 가져와야한다 */
            for(HashMap<String, String> car:carList){       
                System.out.println(car.get("CarCompany")+","+car.get("CarName")+","+car.get("Year"));
                // System.out.println(car.get("CarCompany"));
                // System.out.println(car.get("CarName"));
                // System.out.println(car.get("Year"));
             /* System.out.println(car.get("CarCompany")+car.get("CarName")+car.get("Year"));
                이걸 프린트하면        
              * carlist는....   car는....  */
            }
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
