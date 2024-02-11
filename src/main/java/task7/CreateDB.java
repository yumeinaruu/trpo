package task7;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.Scanner;

public class CreateDB {
    static Scanner scanner = new Scanner(System.in);
    public static void createDB(Connection connection) {
        try {
            System.out.println("Do you want to create new table? Type 'y' if yes: ");
            if(!Objects.equals(scanner.nextLine(), "y")){
                return;
            }
            Statement statement = connection.createStatement();
            statement.executeUpdate("CREATE TABLE trpo (id BIGSERIAL PRIMARY KEY, username VARCHAR(20), balance DOUBLE PRECISION)");
            statement.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
