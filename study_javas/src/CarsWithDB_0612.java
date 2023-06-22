import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

public class CarsWithDB_0612 {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement(); // Edit 창 뜸. Statement 오류는 퀵픽스 java.sql

            String query = " "; // 그 업무가 들어가있는데에 동작시켜야 함

            // 작업 키 입력
            Scanner scanner = new Scanner(System.in);
            String workKey = "p";
            while (!workKey.equals("E")) {
                System.out.print("선택입력 : ");
                workKey = scanner.nextLine(); // 분기 만들기
                if (workKey.equals("O")) {
                    System.out.println(" - 차 이름 명단");
                    query = "SELECT T_OPT_INFO.OPTION_NAME\n" + //
                            " FROM OPTION_INFORS AS T_OPT_INFO\n" + //
                            "     INNER JOIN `options` AS T_OPTS\n" + //
                            "     ON T_OPT_INFO.OPTION_INFOR_ID = T_OPTS.OPTION_INFOR_ID \n" + //
                            "     AND T_OPTS.CAR_INFOR_ID = 'CI001' ";
                    ResultSet resultSet = statement.executeQuery(query);

                    int number = 1;
                    Statement statement2 = connection.createStatement();
                    ResultSet resultSet2;
                    String query2;
                    HashMap<String, String> carNumberMap = new HashMap<>(); // 밸류가 스트링
                    while (resultSet.next()) {
                        System.out.print(number + ". " +
                                resultSet.getString("COMPANY") + "-" +
                                resultSet.getString("CAR_NAME") + ": ");
                        String carInfoId = resultSet.getString("CAR_INFOR_ID");
                        carNumberMap.put(String.valueOf(number), carInfoId); // 다른 타입을 string으로 바꿀 때 String.valueOf()사용
                        query2 = "SELECT T_OPT_INFO.OPTION_NAME " +
                                "FROM OPTION_INFORS AS T_OPT_INFO " +
                                "INNER JOIN `options` AS T_OPTS " +
                                "ON T_OPT_INFO.OPTION_INFOR_ID = T_OPTS.OPTION_INFOR_ID " +
                                "AND T_OPTS.CAR_INFOR_ID = '" + carInfoId + "'";
                        resultSet2 = statement2.executeQuery(query2);
                        while (resultSet2.next()) { // 차명에 옵션을 가지고 있음
                            System.out.print(resultSet2.getString("OPTION_NAME") + ",");
                        }
                        number = number + 1;
                        System.out.println(); // 해당 항목 죽 list up 됨

                    }
                    // 차명 번호 입력 :
                    System.out.println("- 차 이름 명단 : ");
                    String CarNumber = scanner.nextLine(); // DB의 PK를 모르는데 이걸 알아야함. 1,2,3,4 번호는 가상의 번호. PK는 진짜 db
                                                           // 쿼리2 들어가기 전에 해쉬맵 넣어주어야 함
                    // System.out.println("차명 PK : " + carNumberMap.get(CarNumber));
                    System.out.println("- 선택 가능 옵션들");
                    query = "SELECT OPTION_INFOR_ID, OPTON_NAME        \n" + //
                            "FROM option_infors";
                    resultSet = statement.executeQuery(query);
                    number = 1; // 위에서 이미 넘버 선언
                    HashMap<String, String> carOptionInfor = new HashMap<>(); // 각 번호에 대한 PK넣는 해쉬맵 만들어서 넣기
                    while (resultSet.next()) {
                        System.out.print(number + "," + resultSet.getString("OPTON_NAME") + ","); // 번호, 특정 이름,번호, 특정 이름
                                                                                                  // 갯수 만큼 나옴
                        carOptionInfor.put(String.valueOf(number), resultSet.getString("OPTION_INFOR_ID"));
                        number = number + 1;
                    }
                    System.out.println(); // 한 줄로 나오는 것을 줄바꿈으로 정리
                    System.out.print("- 추가  옵션 선택 : ");
                    String optionNumber = scanner.nextLine();
                    System.out.println(carNumberMap.get(CarNumber) + "," + carOptionInfor.get(optionNumber)); // 실제 가져올
                                                                                                              // 수 있는지
                                                                                                              // 확인 하기
                                                                                                              // 1.차 PK.
                                                                                                              // 옵션 PK

                } else if (workKey.equals("S")) {
                    System.out.println("- 통계 시작 -");
                    query = "SELECT T_FAC.COMPANY, T_CAR_INFOR.CAR_NAME, COUNT(*) AS CNT\n" + //
                            "FROM (factorys AS T_FAC\n" + //
                            "     INNER JOIN car_infors AS T_CAR_INFOR\n" + //
                            "     ON T_FAC.COMPANY_ID = T_CAR_INFOR.COMPANY_ID)   \n" + //
                            "     INNER JOIN `options` AS T_OPTS\n" + //
                            "     ON T_CAR_INFOR.CAR_INFOR_ID = T_OPTS.CAR_INFOR_ID  \n" + //
                            "GROUP BY T_FAC.COMPANY_ID, T_CAR_INFOR.CAR_INFOR_ID   ";
                    ResultSet resultSet = statement.executeQuery(query);
                    while (resultSet.next()) {
                        System.out.println(resultSet.getString("COMPANY") + ", " +
                                resultSet.getString("CAR_NAME") + ", " +
                                resultSet.getString("CAR_NAME"));
                    }
                } else {
                    System.out.println("--- 작업 키 확인 : 입력한 값 : ---" + workKey);
                }
                // DB 연결해서 공유하고, 이후 if else문에 자기 업무만 추가하여 업무하면 됨
            }
            System.out.println("----- 작업종료 -----");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}