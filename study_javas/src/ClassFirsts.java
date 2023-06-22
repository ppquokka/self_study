// main 넣지 않음
public class ClassFirsts {
    public int second = 0;  //밖에 노출되는 애들은 public을 붙여줌
                       //이 변수는 class생성자 둘 다 영향을 줌. 범위 밖에 있기 때문에. this를 사용하면 펑션 밖에서 볼 수 있음. 
                     //변수를 사용할 때만  this 사용. 매소드 내에서만.
    // 생성자 method는 그냥 이름을 넣으면 됨. 
    // 생성자 method의 이름, class의 이름은 파일명과 동일해야한다 
    ClassFirsts(){
        System.out.println();   // 하나는 클래스를 클론으로 생성, 하나는 클래스의 초기값을
    }                            //생성자가 내부적인것을 변화시키지 않고 그냥 함
    ClassFirsts(int first){     // 오버라이드 기능
        this.second = first;    // parameter로 들어온 것이 first를 가져옴.
        System.out.println(first);   //class의 life cycle의 시작을 깨워줌. class는 코드에서 묶음의 의미
                                // 컴퓨터랭귀지에서 실제움직이는 애는 method. (생성자)자기가 메모리에 끌어올려줌.
                                // class안에는 function이 있다. 하나의 펑션은 다른 펑션을 넘어갈 수 없음.
                                // class에는 펑션들끼리 서로 공유할수 있는 변수도 같이 있다. 'Bin'
                                // method()는 parameter를 넣을 수 있고, return도 있다.  내부적으로 class의 clone을 return함
    } //선언된 변수에 값 세팅: setter, 가져오는 것:getter
// 펑션 만들때. 메쏘드 쓸 때.
     public int getSecond(){     //파라미터 없음
        return this.second;
     }                           //class에는 생성자를 넣어야 함. 클래스 내부의 특정 펑션을 사용해야하면 파라메터가 있는 생성자를 만들어야 함   

}
