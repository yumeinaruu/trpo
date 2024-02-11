package task7;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.Scanner;

public class JDBCStatement {
    Scanner scanner = new Scanner(System.in);
    public void setStatement(Connection connection, String name, double balance) {
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO trpo(id, username, balance) VALUES (DEFAULT, '" + name + "', '" + balance + "')");
            statement.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void getStatement(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from trpo");
            while (resultSet.next()) {
                System.out.print(resultSet.getString("username"));
                System.out.print("\t");
                System.out.println(resultSet.getString("balance"));
            }
            statement.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public void updateStatement(Connection connection) {
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
