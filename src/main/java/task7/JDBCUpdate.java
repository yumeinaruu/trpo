package task7;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.Scanner;

public class JDBCUpdate {
    static Scanner scanner = new Scanner(System.in);
    public static void updateStatement(Connection connection) {
        try {
            System.out.println("If you need to update someones balance type 'y' ");
            if (!Objects.equals(scanner.nextLine(), "y")) {
                return;
            }
            System.out.println("Write name: ");
            String newUsername = scanner.nextLine();
            System.out.println("Write new balance: ");
            double newBalance = scanner.nextDouble();
            Statement statement = connection.createStatement();
            statement.executeUpdate("UPDATE trpo SET balance='" + newBalance + "' WHERE username='" + newUsername +"'" );
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
