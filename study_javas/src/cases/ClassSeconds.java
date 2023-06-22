package cases;  
     //파라미터가 하나있는 생성자 만들것
     /*  아까는 같은 선상에서 만듦. 이번은 하위선상에서 만듦. root=프로젝트. 이를 기준으로 해서
      * 해당하는 부분이 패키지가 붙음. 프로그램은 src가 컴파일의 시작점이고, 이를 인지. 이를 기준으로 해서
        패키지 단위(=폴더의 단위), 패키지는 폴더의 하위폴더를 지칭하는 값. 컴파일 할 때 중요한 위치값을 가지고있음
        그래서 매우 중요. System.out.println에서 System이 패키지 단위
        =>>하위들의 폴더의 위치를 나타냄
     */
public class ClassSeconds {
    public int third = 0;
    public ClassSeconds(){   //퍼블릭 재시작을 넣어주는게 좋다

    }
    public ClassSeconds(int first){
        this.third = first;
    }
    public int getThird(){
        return this.third;
    }
}
