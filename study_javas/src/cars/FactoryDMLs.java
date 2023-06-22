package cars;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FactoryDMLs {
    // ConnectDBWithMethod.java 파일이 main 파일
    // select, insert, delete 펑션 각각 만들기
    public ResultSet  selectStatements(Statement statement, String query) throws SQLException{
        ResultSet resultSet = statement.executeQuery(query);
        return resultSet;
        //null을 resultSet으로 바꾸기.  펑션만들기 끝

    //펑션을 사용한다는 class 사용한다 = 무조건 인스턴스한다    
    }
    // table로 나오는걸 result set으로 받음. 얘는 셀렉트문.

    public int insertStatements(Statement statement, String query) throws SQLException {
        int count = statement.executeUpdate(query);
        /* add throws : 에러가 나면 자기를 호출한 애한테 책임을 던짐. 왜냐면 상대가 aprameter를 
         * 잘못넣었다고 생각하기 때문 */
        return count;
    }
    /* 변수는 리턴받을때 쓰므로 여기에 넣을 필요 없음. 
      
    */

}
