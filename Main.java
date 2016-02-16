

import java.sql.*;


/**
 * Created by anon on 16.02.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyDataBaseName", "root", "");
            Statement statement = c.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from dsa");
//            while (resultSet.next()){
//                System.out.println(resultSet.getString("Login"));
//            }

            //PARAMS
//            PreparedStatement pst = c.prepareStatement("select * from MoCoUser where login = ?");//? - это параметр
//            pst.setString(1, "user");//установление значения параметра. Обратите внимание: нумерация параметров начинается не с 0, а с 1!
//            ResultSet prs = pst.executeQuery();

//             PROCEDURE
//            CallableStatement cst = c.prepareCall("CALL proc_name(?,?)");//В процедуру также можно передавать параметры
//            cst.setInt(1, 100);
//            cst.setString(2, "String");
//            ResultSet rs = cst.executeQuery();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
