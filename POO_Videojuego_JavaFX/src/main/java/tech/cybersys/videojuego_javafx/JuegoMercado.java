package tech.cybersys.videojuego_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class JuegoMercado extends Application {
    @Override
    public void start(Stage stage) throws  IOException{
        FXMLLoader fxmlLoader = new FXMLLoader(JuegoMercado.class.getResource("vista/menu-view.fxml"));

        Scene MenuPrincipal = new Scene(fxmlLoader.load(), 800, 600);

        stage.setTitle("Juego_Mercado");
        stage.setScene(MenuPrincipal);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}