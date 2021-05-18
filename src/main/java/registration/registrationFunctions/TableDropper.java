package registration.registrationFunctions;

import registration.Connector;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TableDropper {

    private Connector connector = new Connector();

    public void dropTheTableRegistration() {
        try {
            Connection connection = connector.getConnection();
            String drop = "DROP TABLE IF EXISTS Registration ";
            Statement statement = connection.createStatement();
            statement.executeUpdate(drop);
            System.out.println("Dane wykasowane\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}