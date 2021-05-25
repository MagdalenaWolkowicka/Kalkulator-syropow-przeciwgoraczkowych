package registration.registrationFunctions;

import registration.Connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TableDropper {

    private Connector connector = new Connector();

    public void dropTheTableRegistration() {
        try (java.sql.Connection connection = DriverManager.getConnection(connector.getUrl(), connector.getUser(), connector.getPassword())) {
            String drop = "DROP TABLE IF EXISTS Registration ";
            Statement statement = connection.createStatement();
            statement.executeUpdate(drop);
            System.out.println("Dane wykasowane\n");
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("Błąd bazy danych\n");
        }
    }
}