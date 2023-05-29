public class SSW3sDatatype {
        public static void main(String[] args) {
            
            try {

                /*float f1 = 35e3f;
                double d1 = 12E4d;
                System.out.println(f1);
                System.out.println(d1);*/  
                
                /*boolean isJavaFun = true;
                boolean isFinishTasty = false;
                System.out.println(isJavaFun);
                System.out.println(isFinishTasty);*/

                /*char myGrade = 'B';
                System.out.println(myGrade);

                String greeting = "Hello World!";
                System.out.println(greeting);*/

                /* 
                //Java Type Casting_Widening Casting : 작은 → 큰
                // bite → short → char → int → long → float → double
                int myInt = 9;
                double mydouble = myInt;

                System.out.println(myInt);
                System.out.println(mydouble);*/

                /*//    _NArrow Casting : 큰 → 작은
                // Narrow Casting 시 값 앞의 유형을 ()로 묶어 캐스팅 수동 수행 필요
                double myDouble = 9.78d;
                int myInt = (int) myDouble;
                System.out.println(myDouble);
                System.out.println(myInt);*/

                /*int x = 100 + 50;
                System.out.println(x);*/

                /*int sum1 = 100 + 50;
                int sum2 = sum1 + 250;
                int sum3 = sum1 + sum2;
                System.out.println(sum3);*/

                /*int first = 10;
                ++first;   // first+1
                int second = 3;
                second += 3;   // second+3
                System.out.println(first);
                System.out.println(second);*/

                /*String firstName = "Jiwon";
                String lastName = "Kim";
                System.out.println(firstName +" "+ lastName);
                // 문자열 붙임
                System.out.println(firstName.concat(lastName));*/

                /*String first = "10";
                int second = 20;
                String third = first + second;
                System.out.println(third);*/

                /*Math.max(5,10);
                System.out.println(Math.max(5,10));
                System.out.println(Math.min(5,10));
                Math.sqrt(49);
                System.out.println(Math.sqrt(49));*/

                /*// o부터 샌다
                String first = "Hello Everybody";
                System.out.println(first.indexOf("e"));*/

                /*boolean first = true;
                boolean second = false;
                System.out.println(first);
                System.out.println(second);*/

                /*int first = 10;
                int second = 9;
                System.out.println( first > second );
                System.out.println(10>9);
                System.out.println(first == 10);
                System.out.println(first == 15);
                System.out.println( first >= second );*/

                /*int first = 35;
                int second = 20;
                   if (first >= second) {
                    System.out.println("Much bigger!");
                   } else {
                    System.out.println("Noooo");
                   }*/
                
                /*if ( 20 > 18){
                    System.out.println("20 is greater than 18");
                }

                int first = 20;
                int second = 18;
                if (first > second) {
                    System.out.println("first is bigger thn second");
                } */

                /*int first = 20;
                if(first < 10) {
                    System.out.println("first is smaller than 20");
                } else {
                    System.out.println("first is bigger than 10");
                }
                // 위의 if...else문을 String을 사용하여 한 문장으로 줄일 수 있다
                String answer = (first < 18) ? "Yes, is true" : "No, it flase";
                System.out.println(answer);*/



                /*int first = 22;
                if (first < 10) {
                    System.out.println("first is smaller thsn 10");
                } else if (first < 18) {
                    System.out.println("first is smaller than 18");
                } else {
                    System.out.println("first is bigger than 18");
                }*/

                // Java While loop
                int first = 0;
                while (first < 5) {
                    System.out.println(first);
                    first++;
                }
                   




            } catch (Exception e) {
                // TODO: handle exception
            } finally {
    
            }
            System.out.println();
            // return 0;
        }
    }
