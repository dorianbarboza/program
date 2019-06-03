package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();

        ConnectBd connect = new ConnectBd();
        Crud _crud = new Crud(connect.connexionMysql());

        Cliente regCliente = opCliente.getCliente(14);
        connect.connexionMysql();



        // Parsear int a string
        /*
        String enteroString = "5";
        int entero = Integer.parseInt(enteroString);
        System.out.println(entero);
        */
        opCliente.insertCliente("Jorge", "Estrada", "Lázaro Cárdenas 123");


    }


    public static void main(String[] args) {
        launch(args);
    }
}
