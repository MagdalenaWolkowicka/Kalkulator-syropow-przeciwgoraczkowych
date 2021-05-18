package registration.registrationFunctions;

import registration.Connector;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InfoShower {

    private Connector connector = new Connector();
    private Connection connection = null;
    private Statement statement = null;

    public void showInfo() {
        try {
            connection = connector.getConnection();
            String query = "create table if not exists Registration (id int auto_increment primary key,  medicine varchar(20) not null, time time not null)";
            statement = connection.createStatement();
            statement.executeUpdate(query);
            String select = "Select * from Registration";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(select);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String medicine = resultSet.getString("medicine");
                String dosingTime = resultSet.getString("time");
                System.out.println(id + ". Lek --> " + medicine + ", Godzina --> " + dosingTime);
            }
            if (!resultSet.isAfterLast()) {
                System.out.println("Brak danych do wyświetlenia");
            }
        } catch (SQLException e) {
            e.getMessage();
        } finally {
            try {
                if (statement != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.getMessage();
            }
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.getMessage();
            }
            System.out.println("");
        }
    }
}