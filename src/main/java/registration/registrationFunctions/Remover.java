package registration.registrationFunctions;

import registration.Connector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Remover {

    private Scanner scanner = new Scanner(System.in);
    private Connector connector = new Connector();

    public void delete() {
        try {
            Connection connection = connector.getConnection();
            System.out.println("Numer usuwanego wiersza: ");
            int id = scanner.nextInt();
            String delete = "Delete from Registration where Id = " + id;
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(delete);
            if (rows > 0) {
                System.out.println("Wiersz " + id + " usunięty\n");
            } else {
                System.out.println("Błąd usuwania wiersza\n");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
