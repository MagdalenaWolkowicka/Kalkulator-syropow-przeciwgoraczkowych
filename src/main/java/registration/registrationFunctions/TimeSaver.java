package registration.registrationFunctions;

import registration.Connector;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalTime;
import java.util.Scanner;

public class TimeSaver {

    private Connector connector = new Connector();
    private Scanner scanner = new Scanner(System.in);

    public void save() {
        try {
            Statement statement = createTable(connector.getUrl(), connector.getUser(), connector.getPassword());
            System.out.print("Nazwa leku: ");
            String medicine = scanner.next();
            System.out.print("Godzina (w formacie HH:MM): ");
            String dosingTime = scanner.next();
            LocalTime dosingTimeParsed = LocalTime.parse(dosingTime);
            String insert = "Insert into Registration (medicine, time)" + "values ('" + medicine + "','" + dosingTimeParsed + "')";
            int rows = statement.executeUpdate(insert);
            if (rows > 0) {
                System.out.println("\nDodano pomyślnie\n");
            } else {
                System.out.println("Błąd\n");
            }
        } catch (SQLException e) {
            e.getMessage();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    public Statement createTable(String url, String user, String password) throws SQLException {
        java.sql.Connection connection = DriverManager.getConnection(url, user, password);
        String query = "create table if not exists Registration (id int auto_increment primary key,  medicine varchar(20) not null, time time not null)";
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        return statement;
    }
}
