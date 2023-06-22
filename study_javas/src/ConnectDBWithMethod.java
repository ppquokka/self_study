import java.sql.*;

import cars.FactoryDMLs;
import java.sql.Statement;

public class ConnectDBWithMethod {
    public static void main(String[] args) {
        Connection connection;
        Statement statement;
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://127.0.0.1:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            statement = connection.createStatement();
            String query = "SELECT * FROM factorys";              
            /*  펑션으로 만들때 계!속! 재사용이 가능하다     
                1.statement를 파라미터로 던지고, 쿼리값도 던져서 resultset을 만들기
                  
                2.query   
                
                3.result로 뱉어내기
             *  묶음을 결과값으로 받는건 array(class)에서 했다
             * 파라미터를 (url, user, password)를 넣고, 스테이트먼트를 받으면 펑션을 만들 수 있음
             */
            FactoryDMLs factoryDMLs = new FactoryDMLs();
            ResultSet resultSet = factoryDMLs.selectStatements(statement, query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }

            // SELECT COUNT(*) AS CNT FROM factorys;
            // new는 재활용 가능하지만, 쿼리는 새로 만들어야 함
            // 쿼리문에 따라 resultset이 따라온다
            // 펑션을 하나 만들어놓고 쿼리를 이용하여 사용함?????
            query = "SELECT COUNT(*) AS CNT FROM factorys";
            resultSet = factoryDMLs.selectStatements(statement, query);
            int totalCount = 0;
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("CNT"));
                totalCount = resultSet.getInt("CNT");
            }

            /*
            INSERT INTO factorys
            (COMPANY_ID, COMPANY) 
            VALUE 
            ('CAR-01', 'AUDI');
            */
            String companyId = "CAR-01";
            String company = "AUDI" ;   
            /*입출력 관련 장비 자원을 이용하면 무조건 반납해야함
             * 위의 얘는 row에 입력되는 값이므로 반납 안해도됨
             * data는 입력&출력 둘 다임. 그렇지만 자세히 하면 컴퓨터 disk에 저장되므로
             * 꼭 반납해야함. 
             * 
            */

            /*펑션화. 쿼리 전체를 만들어서 넣어주기
            * 쿼리 넣기 필수 + 파라미터로 statement
            * = 다음에는 count가나와야하는데 이것의 형식은 int. (들어가는것과 나오는것 먼저 정의하기)
            */
            query = "INSERT INTO factorys " +
                    "(COMPANY_ID, COMPANY) " +
                    " VALUE " +
                    "('"+companyId+"', '"+company+"') ";
            
            int count = factoryDMLs.insertStatements(statement, query);
            System.out.println();
            /*반납 방법은 close. 원래 finally 다음에 넣어야 한다. 
             * Connection connection;
               Statement statement;
               위의 두 쿼리를 try catch문 밖으로 꺼내놓아야 작동한다.
               이후 상속을 배우면 이해가 쉽다.
             */
            statement.close();
            connection.close();            
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
        /*catch문 뒤에 fianlly를넣으면 try catsh문에서 에러가 나던 안나던 상관없음
         * 에러가 나던 안나던 뭔가를 동작시키고 싶을때 finally에 넣는다
         * 지금은 자원 반납을 위해 넣음. 
         * 자원 반납의 규칙은 inatance의 반대 순서로 하면 됨.
         * 원래는 워크벤치 쓰고나서 edit창 닫아야 함.자원 낭비를 막기위해.
         * 커넥션은 네트워크 자원, 스테이트먼트는 ??자원. 
         * 반납방법은 close  
         */
        finally {

        }
        System.out.println();
    }
}