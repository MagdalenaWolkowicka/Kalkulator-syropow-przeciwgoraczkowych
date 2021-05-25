package registration.registrationFunctions;

import registration.Connector;

import java.sql.*;

public class InfoShower {

    private Connector connector = new Connector();
    private Statement statement = null;

    public void showInfo() {
        try (java.sql.Connection connection = DriverManager.getConnection(connector.getUrl(), connector.getUser(), connector.getPassword())) {
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
            System.out.println("");
            if (!resultSet.isAfterLast()) {
                System.out.println("Brak danych do wyświetlenia\n");
            }
        } catch (SQLException e) {
            e.getMessage();
            System.out.println("Błąd bazy danych\n");
        }
    }
}