package tech.cybersys.videojuego_javafx.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

import static tech.cybersys.videojuego_javafx.controlador.ControladorVentanas.mostrarVentana;


public class ControladorMenu{

    @FXML
    public void BotonInicio(ActionEvent event) throws IOException {
        mostrarVentana(event, null, "CrearPersonaje-view.fxml", "Creacion de Personaje");

    }

    @FXML
    protected void onPantallaPersonajeClick(ActionEvent event) throws IOException {
      //Cambios agregados al código desde un ambiente remoto
    }

}
