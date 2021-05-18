package registration.registrationFunctions;

import registration.Connector;

import java.sql.*;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class InfoUpdater {

    private Scanner scanner = new Scanner(System.in);
    private Connector connector = new Connector();
    private Connection connection = null;
    private Statement statement = null;
    int id;

    public void updateMedicine() {
        System.out.println("Id: ");
        id = scanner.nextInt();
        System.out.println("Lek: ");
        String medicine = scanner.next();

        try {
            Connection connection = connector.getConnection();
            String update = "Update Registration SET medicine = '" + medicine + "' where id = " + id;
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(update);
            if (rows > 0) {
                System.out.println("Edytowano pozycję " + id);
                selectUpdatedRow();
            } else {
                System.out.println("Błąd edycji\n");
            }
        } catch (SQLException e) {
            e.getMessage();
        }
    }

    public void updateTime() {
        System.out.println("Id: ");
        id = scanner.nextInt();
        System.out.println("Godzina: ");
        String dosingTime = scanner.next();
        LocalTime dosingTimeParsed = LocalTime.parse(dosingTime);

        try {
            Connection connection = connector.getConnection();
            String update = "Update Registration SET time = '" + dosingTimeParsed + "' where id = " + id;
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(update);
            if (rows > 0) {
                System.out.println("Edytowano pozycję " + id);
                selectUpdatedRow();
            } else {
                System.out.println("Błąd edycji\n");
            }
        } catch (DateTimeParseException e) {
            e.getMessage();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void selectUpdatedRow() {
        try {
            connection = connector.getConnection();
            String select = "Select * from Registration where id = " + id;
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(select);
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id") + ". Lek --> " +
                        resultSet.getString("medicine") + " , Godzina --> " +
                        resultSet.getString("time") + "\n");
            }
        } catch (SQLFeatureNotSupportedException e) {
            e.getMessage();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
