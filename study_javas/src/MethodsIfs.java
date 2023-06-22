// if문을 method화
public class MethodsIfs {
     //<access_modifier> <return_type> <method_name>( list_of_parameters)
    //{
    ////body
    //}
    public int time(int hour){
        int time = 18;
        String out = ("오전입니다.", "오후입니다.", "밤입니다.");
        try {
            System.out.println();
        if (time < 12) {
            System.out.println("오전입니다.")
        }
        else if (time < 18) {
            System.out.println("오후입니다.")
        }
        else {
            System.out.println("밤입니다.")
        }
        MethodsIfs methodsifs = new MethodsIfs();
        String returnResult = methodsifs();
        System.out.println(returnResult);
       } catch (Exception e) {
        // TODO: handle exception
       } 
    }
    // return 0;
}
