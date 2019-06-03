package sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectBd {
    Connection connection ;

    public Connection connexionMysql(){
        try {
            String url = "jdbc:mysql://localhost/bdBoletaje";
            connection =
                    DriverManager.getConnection ( url , "root", "");
                    System.out.println("Conexion Exitosa");
        } catch ( SQLException ex ) {
            connection = null ;
            ex . printStackTrace () ;
            System.out.println (" SQLException : " + ex . getMessage () );
            System.out .println (" SQLState : " + ex . getSQLState () ) ;
            System.out.println (" VendorError : " + ex . getErrorCode () );
            System.out.println("Conexion Fallida");
        }

        return null;
    }
}
