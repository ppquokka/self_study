import java.sql.*;
public class ConnectDBs {
public static void main(String[] args) {
    try {
        // - MySQL workbench 실행 : JDBC
        // - User/password와 접속 IP:port 접속
        // ~~ 3306/데이터베이스 입력 : 데이터베이스가 동일해야 작동함
        String url = "jdbc:mysql://127.0.0.1:3306/db_cars";  //local 호스트가 내커퓨터 자체를 말함
        String user = "root";
        String password = "!yojulab*";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("DB연결 성공\n");
        //워크벤치에서 db더블클릭해서 볼드체로된 것 까지 완료

        /* - query Edit
         * statement가 에디터 */
        Statement statement = connection.createStatement();
        //에디터 띄우기 완
        
        String query = "SELECT * FROM factorys";
        ResultSet resultSet = statement.executeQuery(query);           //익시큐트, 마이sql에서 번개. 완
        while(resultSet.next()){ //얘는 db용, arraylist는 다른 용도
              // next는 뭉치를 던져주고 다음으로 넘어감. 즉 row1이 나옴
              //resultSet.getString("Company_ID");
              //resultSet.getString("Company");
              //겟스트링은 그 데이터 타입을 따라감 
        System.out.println(resultSet.getString("Company_ID")+resultSet.getString("Company"));
        }
        // 데이터 타입에 따라 getString등이 바뀐다. 우리는 string아니면 integer 

        // SELECT COUNT(*) AS CNT FROM FACTORYS;
        query = "SELECT COUNT(*) AS CNT FROM FACTORYS";
        resultSet = statement.executeQuery(query);
        // 얘를 변수에담아서 활용하기
        int totalCount = 0;
        //        ↓ 커서가 맨 앞으로 감
        while(resultSet.next()){
           System.out.println(resultSet.getInt("CNT")); 
           totalCount = resultSet.getInt("CNT");
        } 

        /*
        insert into FACTORYS
        (COMPANY_ID, COMPANY)
        value
        ('car-01', 'AUDI');) 
        */      
        String companyId = "car-01 ";
        String company = "AUDI ";
        query = "insert into FACTORYS " + 
                "(COMPANY_ID, COMPANY) " +
                " value " +
                "('"+companyId+"', '"+company+"') ";  

        int count = statement.executeUpdate(query);   //table로 결과값 받을 필요 없으므로 이거 사용
                                          // count 받는 갯수 받기        
        /* 쿼리 뒤에 space 넣는게 좋다.
        변수에 값을 넣어서 넣는게 좋다 */    
        
        
        /* Quest
        아래 코드 java에서 실행
        update factorys
        SET COMPANY = '패러리'
        WHERE COMPANY_ID = 'CAR-01' ;
        DELETE FROM factorys
        WHERE COMPANY_ID = 'CAR-01' ; */ 
        
        
        /*String Company_Id = "CAR-01 ";
        String Company = "페라리 ";
        query = "insert into Factorys " + 
                "(company_ID, company) " +
                "value " +
                "('"+companyId+"','"+Company+"')" ;
        */

        String Company_ID = "CAR-01 ";
        String Company = "페라리 ";
        query = "UPDATE factorys " +
                "SET COMPANY = '"+ Company +"' " +
                "WHERE Company_ID = '"+ Company_ID +"'" ;
        count = statement.executeUpdate(query);  

        String deleteCompany_ID = "CAR-01 ";
        String deleteCompany = "페라리 ";
        query = "DELETE FROM factorys " +
                "WHERE " +
                "Company_ID = 'CAR-01' " ;
        count = statement.executeUpdate(query);
        


 
        System.out.println();
        } catch (Exception e) {
        System.out.println(e.getMessage());
        /* try부분에 error가 나면 바로 catch문으로 넘어간다. 
        그러면 catch문 앞에서 error가 났다는 것을 유추 가능*/

        // TODO: handle exception
        }
        System.out.println();
    }
   
}

/*
 * import java.sql.*;

public class ConnectDBs {
    public static void main(String[] args) {
        try {
            // - MySQL workbench 실행 : JDBC
            // - User/password와 접속 IP:port 접속
            String url = "jdbc:mysql://localhost:3306/db_cars";
            String user = "root";
            String password = "!yojulab*";

            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("DB연결 성공\n");

            // - query Edit
            Statement statement = connection.createStatement();
            String query = "SELECT * FROM factorys";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                System.out.println(resultSet.getString("COMPANY_ID") + resultSet.getString("COMPANY"));
            }

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
 */