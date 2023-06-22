import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import commons.commons;
import surveys.Statistics_0616;

// import surveys.Statistics;

/**
 * SurveysApp
 */
public class SurveysApp_230616 {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();

            System.out.println("--- 설문자 가능 명단 ---");
            // -- 설문자 가능 명단(가입 완료)
            // -- 1. 홍길동, 2.장길산, 3.신사임당, ...
            String queryA = "SELECT *\n" + //
                    "FROM respondents";
            ResultSet resultSet = statement.executeQuery(queryA);
            int number = 1;
            Scanner scanners = new Scanner(System.in);

            HashMap<String, String> respondentsInfo = new HashMap<>();
            while (resultSet.next()) {
                System.out.print(number + "." +
                        resultSet.getString("respondents") + ",");
                respondentsInfo.put(String.valueOf(number), resultSet.getString("RESPONDENT_ID"));        
                number = number + 1;
            }
            System.out.println();
            // 설문자 선택
            System.out.println("설문자 선택 : ");
           
            String.respondents = scanners.nextLine();

            // -- 설문 시작
            // -------- 참조 : poll contents example -------------
            // -- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
            // -- 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?
            // -- 문항
            System.out.println("-- 설문 시작");
            queryA = "SELECT * \n" + //
                    "FROM questions";
            resultSet = statement.executeQuery(queryA);
            number = 1;
            Statement statement_second = connection.createStatement();

            Commons commoms = new Commons();   // 이를 이용해서 get.generator란 UUID 가져오기!
            while (resultSet.next()) {
                System.out.println(number + "." +
                        resultSet.getString("questions") + ",");
                // 답항 출력
                queryA = "SELECT T_CHO.CHOICE_ID, T_CHO.CHOICE\n" + //
                        "FROM question_choice AS T_QUES\n" + //
                        "\tinner JOIN choice AS T_CHO\n" + //
                        "    ON T_QUES.CHOICE_ID = T_CHO.CHOICE_ID\n" + //
                        "\tAND QUESTIONS_ID = 'Q1'";
                ResultSet resultSet_second = statement_second.executeQuery(queryA);
                int number_second = 1;
                // 아래의 queryA 위한 HaxhMap 넣기
                HashMap<String, String> choiceceInfor = new HashMap();
                HashMap<String, String> choiceInfor;
                // 아래 while문이 돌때 1에는 chice 1, 2에 choice2 등등으로 나올것이므로~
                while (resultSet_second.next()) {
                    System.out.print(" (" + number_second + ")" +
                            resultSet_second.getString("CHOICE") + ",");
                    // ~ 요기랑 연결. 다반 위의 해쉬맵        
                    choiceInfor.put(String.valueOf(number_second), resultSet_second.getString("CHOICE_ID"));         
                    number_second = number_second + 1;
                }                                            // 답항이 완전히 출력이 된 후 이 사람이 답을 함
                                                             // while문 이후 insert를 기켜야 함
                resultSet_second.close();
                System.out.println();

                // insert 문 작성.(HashKap 또는 array등 사용하고 싶은것 사용) 
                System.out.println("답항 선택 : ");
                String choice_key = scanners.nextLine();            // 1,2,3으로 답변
                queryA = "INSERT INTO STATISTICS\n" + //
                        "(STATISTICS_ID, RESPONDENTS_ID, QUESTIONS_ID, CHOICE_ID)\n" + //
                        "VALUES\n" + //
                        "('"+commons.generateUUID()+"', 'R1', '"+"QUESTION_ID"+"', '"+choiceInfor.get(choice_key)+"')\n";   // 답항을 넣음
                        /* 55의 while문 처럼 여기선 while문을 돌 때 이미 알 수 있다. 
                         * DB가 돌면서 record 값을 가져옴. 57 처럼...??
                         * R1은 응답자. 설문자에서 해당하는 내용을다시 해쉬맵에 담아주는 역할이 필요
                           - 그럼 응답자에 대한 해쉬맵을 만듦(누구를 선택했다는 것만 알면됨:변수) 
                        */
                int result = statement.executeUpdate(queryA);
                        
                number = number + 1;
            }
            System.out.println();

            // 통계 - 총 설문자 표시
            Statistics_0616 statistics = new Statistics_0616();
            statistics.getRespondents(statement);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}


/* < 강사님 작성답안 >
 * import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Scanner;

import commons.Commons;
import surveys.Statistics;

/**
 * SurveysApp
 */
/*public class SurveysApp {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_survey";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();

            System.out.println("--- 설문자 가능 명단 ---");
            // -- 설문자 가능 명단(가입 완료)
            // -- 1. 홍길동, 2.장길산, 3.신사임당, ...
            String queryA = "SELECT *\n" + //
                    "FROM respondents";
            ResultSet resultSet = statement.executeQuery(queryA);
            int number = 1;
            Scanner scanners = new Scanner(System.in);

            HashMap<String, String> respondentsInfo = new HashMap<>();
            while (resultSet.next()) {
                System.out.print(number + "." +
                        resultSet.getString("respondents") + ",");
                respondentsInfo.put(String.valueOf(number), resultSet.getString("RESPONDENTS_ID"));
                number = number + 1;
            }
            System.out.println();
            // 설문자 선택
            System.out.print("설문자 선택 : ");
            String respondent = scanners.nextLine();

            // -- 설문 시작
            // -------- 참조 : poll contents example -------------
            // -- 1. 교수는 수업 전 강의 목표를 명확히 제시하였습니까?
            // -- 2. 강의의 내용은 체계적이고 성의있게 구성되었는가?
            // -- 문항
            System.out.println("-- 설문 시작");
            queryA = "SELECT * \n" + //
                    "FROM questions";
            resultSet = statement.executeQuery(queryA);
            number = 1;
            Statement statement_second = connection.createStatement();

            Commons commons = new Commons();
            while (resultSet.next()) {
                System.out.println(number + "." +
                        resultSet.getString("questions") + ",");
                // 답항 출력
                queryA = "SELECT T_CHO.CHOICE_ID, T_CHO.CHOICE\n" + //
                        "FROM question_choice AS T_QUES\n" + //
                        "\tinner JOIN choice AS T_CHO\n" + //
                        "    ON T_QUES.CHOICE_ID = T_CHO.CHOICE_ID\n" + //
                        "\tAND QUESTIONS_ID = 'Q1'";
                ResultSet resultSet_second = statement_second.executeQuery(queryA);
                int number_second = 1;
                HashMap<String, String> choiceInfor = new HashMap<>();
                while (resultSet_second.next()) {
                    System.out.print(" (" + number_second + ")" +
                            resultSet_second.getString("CHOICE") + ",");
                    choiceInfor.put(String.valueOf(number_second), resultSet_second.getString("CHOICE_ID"));
                    number_second = number_second + 1;
                }
                resultSet_second.close();
                System.out.println();
                // insert 문 작성
                System.out.print("답항 선택 : ");
                String choice_key = scanners.nextLine();     // 1, 2, 3으로 답변
                queryA = "insert into statistics\n" + //
                        "(STATISTICS_ID, RESPONDENTS_ID, QUESTIONS_ID, CHOICE_ID)\n" + //
                        "values\n" + //
                        "('"+commons.generateUUID()+"', '"+respondentsInfo.get(respondent)+"', '"
                            +resultSet.getString("QUESTIONS_ID")+"', '"
                            +choiceInfor.get(choice_key)+"')";
                int result = statement_second.executeUpdate(queryA);

                number = number + 1;
            }
            System.out.println();

            // 통계 - 총 설문자 표시
            Statistics statistics = new Statistics();
            statistics.getRespondents(statement);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
 */