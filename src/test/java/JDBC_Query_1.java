import java.sql.*;

public class JDBC_Query_1 {
    public static void main(String[] args) throws SQLException {

        //  2-> Database baglantisi kurulur.
        /*
             URL: "jdbc:mysql://194.140.198.209/heallife_hospitaltraining";
             USERNAME= "heallife_hospitaltraininguser";
             PASSWORD="PI2ZJx@9m^)3";
           */


        Connection con = DriverManager.getConnection("jdbc:mysql://194.140.198.209/heallife_hospitaltraining",
                "heallife_hospitaltraininguser",
                "PI2ZJx@9m^)3");
        // Olusturulan conenction bir objeye atanmasa da calisir
        // ancak ilerde ilgili connection'i kullanmak istersek ona ulasamayiz.
        // O yuzden onu Connection nesnesine atama yapariz.

        Statement st= con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    }
}
