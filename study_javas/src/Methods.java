public class Methods {
    // <access_modifier> <return_type> <method_name>( list_of_parameters)
    // {
    // //body
    // }
    /*&public int minus(int first, int second){
        int  result = 0;
        try {
            result = first - second;
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;
    }*/
    public int add(int first, int second){
        int result = 0;
        try {
            result = first + second;   //int는 try안에
        } catch (Exception e) {
            // TODO: handle exception
        }
        return result;    //맨 마지막에 하는게 좋다
    }
    public static void main(String[] args) {
        // - instance는 1회 → new를 한번 사용 할 수 있다.  instance는 class를 대상으로 사용함
        // - 초기 값은 2를 넘지 않는다
        // - 마무리(=메인)에서 나온 결과값은 17이어야 한다
        try {
            int first = 1;
            int second = 1;   // second = first + second = F(first)
            Methods methods = new Methods();
            int result = methods.add(first, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            result = methods.add(result, second);
            System.out.println(result);
        } catch (Exception e) {
            // TODO: handle exception
        } System.out.println();
        // return 0;
    }
}
