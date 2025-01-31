package mx.com.betodata.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebaConexion {
    public static void main(String[] args) {
        String url = "jdbc:oracle:thin:@localhost:1521/orcllocal";
        String user = "hr";
        String password = "abcd";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Conexión exitosa con Oracle 12c");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}