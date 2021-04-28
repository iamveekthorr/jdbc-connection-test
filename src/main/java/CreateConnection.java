import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;

/*
* @author Devthorr
* created at 28th of April 2021
* class CreateConnection @params = NULL
* no constructor for class
* houses method connect() @params = NULL
* */
public class CreateConnection {
    // URL String
    static final String URL_STRING = "jdbc:mysql://localhost:3306/newschema";
    // Time Zone for mysql to work properly
    static final String TIMEZONE = "?useUnicode=true&useJDBCCompliantTimezoneShift=true" +
            "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    static final String PATH = "C:\\Users\\Victor Okonkwo\\Desktop\\DemoDatabaseConnection\\password.txt";
    static String PASSWORD;
    static final String USER = "root";
    static Connection conn;


    void connect() throws IOException{
        PASSWORD = new String(Files.readAllBytes(Paths.get(PATH)));
        try{
            conn = DriverManager.getConnection(URL_STRING.concat(TIMEZONE), USER, PASSWORD);
            System.out.printf("Connection established: %s", conn);
        }catch(SQLException ex){
            System.err.println(ex.getMessage());
        }
    }


}
