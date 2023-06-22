package cars;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AnyStatements_0612 {
    public ResultSet selectStatement(Statement statemt, String qy) throws SQLException{
         /* statemt = statement;
          * qy = query; */
         ResultSet resultSet = statemt.executeQuery(qy);
         return resultSet;    // 결과값이 숫자아니면 다 null
    }
    
}
