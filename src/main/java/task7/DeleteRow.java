package task7;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.Scanner;

public class DeleteRow {
    static Scanner scanner = new Scanner(System.in);
    public static void deleteRow(Connection connection) {
        try {
            System.out.println("Do you want to delete any rows? Type 'y' if yes: ");
            if(!Objects.equals(scanner.nextLine(), "y")){
                return;
            }
            Statement statement = connection.createStatement();
            System.out.println("Input name: ");
            String username = scanner.nextLine();
            statement.executeUpdate("DELETE FROM trpo WHERE username='" + username + "'");
            statement.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
