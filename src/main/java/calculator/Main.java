package calculator;

import java.net.URISyntaxException;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException, URISyntaxException {
        Calculator calculator = new Calculator();
        calculator.start();
    }
}
