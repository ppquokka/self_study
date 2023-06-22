public class Ifs {
    public static void main(String[] args) {
        // if...else 기본값 기억할 것
        // if (condition) {
        //     // block of code to be executed if the condition is true
        //   (true일 때 동작)} else {(false일 때 동작. no인 상활일 때는 빼도 됨)
        // } if문 다음에 실행이되는지 항상 확인 필요
        // int first = 20;
        // int second = 18;
        // if (first > second) {
        //   System.out.println(first);  
        // }

        // 12시 이전은 오전, 18시 이전은 오후, 24시까지 밤
        int time = 15;
        if (time < 12) {
            System.out.println("오전입니다.")
        }
        int time = 15;
        if (time < 18) {
            System.out.println("오후입니다.")
        }
        int time = 15;
        if (time < 24) {
            System.out.println("밤입니다.")
        }

        if (time < 12) {
            System.out.println("오전입니다.")
        }
        else if (time < 18) {
            System.out.println("오후입니다.")
        }
        else {
            System.out.println("밤입니다.")
        }

        System.out.println("Hello,World!");
        //return 0;
    }
}
