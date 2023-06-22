public class StringClasses0609 {
    public static void main(String[] args) {
        try {
            String name = "Ji won Kim";
            name.equalsIgnoreCase("Ji won Kim") ; //true
            name.equalsIgnoreCase("Ji won") ; //false
            
            String name_second = new String("Friend Song !"); 
            name_second.equals("Friend Song !"); //true
            name_second.length();  //12
            name_second = name_second.replaceAll("n","a");  //name_second = name_second.replaceAll("n","a")
            String[] arrays = name_second.split(" ");  //String[2]@579
            String name_substring = name_second.substring(3,11);  //"ead Soag"
           
            /* String name = "Ji won Kim";
               String name_second = new String("Friend Song !");
               // new 다음은 생성자 String();
               // String은 class다
               // 위의 방식 두개 다 String을 초기화 하는 방법이다
               // 여기 6가지 많이 사용 */
            
            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.println();
        // return 0;
    }
}
