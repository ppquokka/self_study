public class switches {
    public static void main(String[] args) {
        int day = 4;
        //day는 순수한 값. 본인이 가지고 있는 case 중 맞는 값에 던저줌. string(문자)도 가능
switch (day) {
  case 1:
    System.out.println("Monday");
    // 해당 값이 걸리는 경우 더 이상 진행하지 않고 밖으로 나옴 
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  case 3:
    System.out.println("Wednesday");
    break;
  case 4:
    System.out.println("Thursday");
    // break;
  case 5:
    System.out.println("Friday");
    break;
  case 6:
    System.out.println("Saturday");
    break;
  case 7:
    System.out.println("Sunday");
    break;
}
// Outputs "Thursday" (day 4)
        // return 0;
    }
}
