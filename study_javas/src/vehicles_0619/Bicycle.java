package vehicles_0619;

import java.util.HashMap;

/*
 * class안의 method들은 변수들을 공유하기위해 ~
 * 내부적으로 변수 3가지만 만들어서 넣어보자
 */
public class Bicycle {
    int price ;
    String color ; 
    HashMap<String, Object> spec ;
    /* arraylist는 순서적으로만 가져옴
     * hashmap은 그냥 묶어서 가져옴
     * HashMap<변수 타입>
     * ----------------------------------
     * 생성자는 아무것도 없고 class가 만들어질 떄 instance화 될 때 사용한다
     */
    public Bicycle(){
        System.out.println("Bicycle - param empty");
    /* price와 color만 inctance화 할때 아예 세팅하기 */
    }
    public Bicycle(int price, String  color) {
          this.price = price;       // this.price는 class내의 변수를 불러온 것. int소속?
                                    // this.를 사용하면 class내의 것을 사용할 수 있음
          this.color = color;       // 생성자 만들기 완.
    }
    // method 만드는 단계
    public String toString(){
        String str = "price : " + this.price + ",color :"+ this.color;
        return str;                 // 2개의 값을 정상적으로 string한 값을 보여줄 것
    }
}
