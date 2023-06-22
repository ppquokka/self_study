/*public class MethodBasics {
    /*  // class는 function의 모임. 'public static' 펑션과 동급으로 만들어야 함
    <access_modifier> <return_type> <method_name>( list_of_parameters)
    {
    //body
    }*/

    // f(x) = x + 1  → 숫자의 결과로 나옴  | 결국 f(x) → 숫자결과
    // x에 +1 
    /*public int F(int x)   //x=0,  y=0// 들어오는 data type은 return전에 들어감
    {                                    
        int result = x + 1;
        return result;   //return은 문자열, 묶음 등의 결과값을 브레이스{}밖으로 던져줌
                         //java는 data type이 중요하다. 'return_data_type'은 result와 맞춰야 함   
    }
    public static void main(String[] args) {
        try {
            int x = 4;
            int y = 0;
            // y = x + 1;   //변수에 +1   → f(x) = x + 1
            //y = F(x)      //컴퓨터의 하드웨어에 실려야 실행이 됨. instance가 되었다 = "LAM(memory)"에 올라와야 한다.
                          //실행 = CPU가 해석했다.   
                          //얘는 public static 영역안에 들어있고, F(x)는 위의 public int 영역안에 있음.그래서 실행이 안됨.
                          //주로 class를 instance화 한다. function은 내부에서 알 수없으므로, 밖의 전체를 가져온다.
            MethodBasics methodBasics = new MethodBasics();   //instance화 
            y = methodBasics.F(x); //class내의 function이다. 펑션은 리턴(결과값)을 냄.
                                        //여러개 functiond의 class를 변수화 시킴. class를 function화 시킴. class도 변수 될수 있다.
                                        // 얘가 다 담고있음. 변수는 아주 적은 것~엄청 큰 것 다 담을 수있음
                                        //class도 변수에 담을 수 있다. data type을 굉장이 중요하게 관리함
                                        //'methodBasics'의 변수 type은 class다.  ∴ class 자체가 data type이 된다
                                        // class에 function넣는 이유: 데이터를 얼마나 잘 가공해서 던져 줄 수 있는가
                                        //class는 data type이다. 
            y = y + 1;   //변수에 +1.  변수의 모양만 달라짐.
            MethodBasics methodBasics_first = new MethodBasics();                            
            y = methodBasics_first.F(0);  // F(0) //변수의 값이 가는거지 변수가 가는게 아니다.
            y = methodBasics_first.F(y);    // F(0) */


public class MethodBasics {  //내부의 것을 사용하려고 함
                // <access_modifier> <return_type> <method_name>( list_of_parameters)
                // {
                // //body
                // }
                // x에 +1
    public int F(int x) // x = 0
    {
        int result = x + 1;
        return result;
     }
     public static void main(String[] args) {  //String은 class다 
        try {
            int x = 4;
            int y = 0;
            // y = x + 1; // 변수에 + 1
            // y = F(x);
            MethodBasicsV2 methodBasics = new MethodBasicsV2();
            y = methodBasics.F(x);
            
            y = y + 1; // 변수에 + 1    // 영역을 벗어나면 해당 영역의 변수를 인식 
            MethodBasicsV2 methodBasics_first = new MethodBasicsV2();   //새로운 class생성. 기능상으로는 둘다 clone. 기능은 다름
                   //재활용이 가능하고 간편하다 / args :String[0]@9                                                   
            y = methodBasics_first.F(y);  // F(0)
            y = methodBasics_first.F(y);  // F(0)
            
            // frame work는 유지보수가 매우 간편하다

        } catch (Exception e) {
        // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}



