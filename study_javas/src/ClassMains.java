import cases.ClassSeconds;         // class 이름 지정.  scanner의 'import java.util.second'는 특정 패키지에 들어가있음
                                   //그 패키지가 package cases

public class ClassMains {
    public static void main(String[] args) {
        try {
            // instance화 시키기 위해서는키워드 new, 내가 하려는 class명 필요
            ClassFirsts classFirsts = new ClassFirsts();   // no param  //확인을 위해.  아무것도 없어도 instance화 됨
            ClassFirsts classFirstsWithVar = new ClassFirsts(5);
            int second = classFirstsWithVar.getSecond();   //생성자 method는 못 가져옴. intance화 할 때만 가져올 수  있음
            ClassSeconds classSeconds = new ClassSeconds(6);   // "6=int first"                         //이걸 막을 수도있음. 세터나 게터 매소드를 통해서 가져오는게 좋음. 
                                        //이렇게 사용하는건 안 좋음 
                                        /* 변수 초기화. 파라메터가 생성되는 생성자????? */
            System.out.println();  //이게 생성자 method.   하나는 클래스 클론,하나는 
                                    
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
    
}
