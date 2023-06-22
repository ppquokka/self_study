public class Arrays {
    public String[] initialArrays(){
        // carTypesdms array로 나열되어 있음
        //초기화 하는 중
        String[] carTypes = {"Volvo", "BMW", "Ford", "Mazda", "KIA"};
        return carTypes ;
    }
    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        String[] cars = arrays.initialArrays();
        for (int first=0;first < cars.length;first = first+1) {
            System.out.print(cars[first]+ ",");
            // 응용프로그램이 os에게 달라고 해서, os가 하드웨어의 자원을 일정 뺏어서 응용프로그램에게할당.
            // 응용프로그램이 반납 권한이있음. 반납을 해야하는 컴퓨터 자료들은 입력&출력 시 쓰고나서 꼭 반납.
            // (예: file,scanner) return전에 close반납해야 함
        }      
        // return 0;
    }
}



        // 엑셀과 유사. 2행low   4열column
        /*String[][] numbers = {
                             {"10","20","30","40"},
                             {"50", "60", "70"}
                             };  
        for (int second=0; second < numbers.length; second = second+1) {
            for (int third=0; third < numbers[second].length; third = third+1){
                System.out.print(numbers[second][third] + ",");
            }
            System.out.println();  
        }

        String[] cars = ;
        System.out.println(cars.length);
        for (int first=0;first < cars.length;first = first+1) {
            System.out.print(cars[first]+ ",");
        }      
        // return 0;
    }
} */


// 23.05.24.(목) array 수업 1
// String[] cars = {"Volvo", "BMW", "Ford", "Mazda", "KIA"};
// // length가 변수여서 변수가나옴
// System.out.println(cars.length);
// // 변수들의 묶음을 유동적으로하기 위해 사용 
// for(int first=0; first < cars.length; first = first+1) {
// System.out.print(cars[first]+",");
// }  
// System.out.println();       
// // return 0;
// }


// 23.05.24.(수)
// public class Arrays {
//     public static void main(String[] args) {
//         String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};        
//         System.out.println(cars[0]); 
//         System.out.println(cars[1]);
//         System.out.println(cars[2]);
//         System.out.println(cars[3]);          
//         // return 0;
//     }
// }