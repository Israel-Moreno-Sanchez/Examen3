package tech.cybersys.videojuego_javafx.controlador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import tech.cybersys.videojuego_javafx.modelo.Builder.AgricultorBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.SoldadoBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.PersonajeBuilder;
import tech.cybersys.videojuego_javafx.modelo.Personaje;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAO;
import tech.cybersys.videojuego_javafx.modelo.PersonajeDAOImpl;

import java.io.IOException;

import static tech.cybersys.videojuego_javafx.controlador.ControladorVentanas.mostrarVentana;

public class ControladorCreacionPersonaje {

    @FXML private TabPane TablaPestanas;
    @FXML private TextArea CampoHistoria;
    @FXML private TextField CampoNombre;
    @FXML private Label EtiquetaErrorNombre;
    @FXML private TextField CampoSalud;
    @FXML private TextField CampoFuerza;
    @FXML private TextField CampoInteligencia;
    @FXML private TextField CampoDinero;
    @FXML private Button BotonCrearPersonaje;

    Personaje PersonajeGuardado;

    @FXML
    public void MostrarAtributosComerciante() throws IOException {
        String historia = "Un astuto comerciante, nacido en el bullicioso puerto de Marvella. " +
                "Desde joven, aprendió el arte del trueque y la negociación de su padre, un renombrado mercader. " +
                "Con un ojo agudo para los tesoros y una lengua de plata, él viaja por tierras lejanas en busca de " +
                "objetos raros y valiosos. Su tienda es conocida por tener los artículos más exóticos y útiles, " +
                "desde pociones mágicas hasta armas legendarias. Aunque su apariencia es modesta, su conocimiento " +
                "y recursos son invaluables para cualquier aventurero que cruce su camino.";
        if (CampoNombre.getText().equals("")) {
            EtiquetaErrorNombre.setVisible(true);
        } else {
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            Personaje comerciante = new Personaje.Builder()
                    .setClase("Comerciante")
                    .setFuerza("50")
                    .setHistoria(historia)
                    .setInteligencia("55")
                    .setSalud("200")
                    .setNombre("Carlos")
                    .setDinero("1000")
                    .build();
            PersonajeGuardado = comerciante;

            CampoHistoria.setText(comerciante.getHistoria());
            CampoSalud.setText(comerciante.getSalud());
            CampoFuerza.setText(comerciante.getFuerza());
            CampoDinero.setText(comerciante.getDinero());
            CampoInteligencia.setText(comerciante.getInteligencia());
        }
    }

    @FXML
    public void MostrarAtributosSoldado() throws IOException {
        if (CampoNombre.getText().equals("")) {
            EtiquetaErrorNombre.setVisible(true);
        } else {
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            SoldadoBuilder soldadoBuilder = new SoldadoBuilder();
            soldadoBuilder.buildNombre(CampoNombre.getText());
            soldadoBuilder.buildHistoria();
            soldadoBuilder.buildSalud();
            soldadoBuilder.buildFuerza();
            soldadoBuilder.buildInteligencia();
            soldadoBuilder.buildClase();
            Personaje soldado = soldadoBuilder.getPersonaje();
            PersonajeGuardado = soldado;

            CampoHistoria.setText(soldado.getHistoria());
            CampoSalud.setText(soldado.getSalud());
            CampoFuerza.setText(soldado.getFuerza());
            CampoDinero.setText(soldado.getDinero()); // Asegúrate de que la clase Soldado tenga este atributo si lo necesitas
            CampoInteligencia.setText(soldado.getInteligencia());
        }
    }

    @FXML
    public void MostrarAtributosAgricultor() throws IOException {
        if (CampoNombre.getText().equals("")) {
            EtiquetaErrorNombre.setVisible(true);
        } else {
            EtiquetaErrorNombre.setVisible(false);
            TablaPestanas.setVisible(true);
            AgricultorBuilder agricultorBuilder = new AgricultorBuilder();
            agricultorBuilder.buildNombre(CampoNombre.getText());
            agricultorBuilder.buildHistoria();
            agricultorBuilder.buildSalud();
            agricultorBuilder.buildFuerza();
            agricultorBuilder.buildInteligencia();
            agricultorBuilder.buildClase();
            Personaje agricultor = agricultorBuilder.getPersonaje();
            PersonajeGuardado = agricultor;

            CampoHistoria.setText(agricultor.getHistoria());
            CampoSalud.setText(agricultor.getSalud());
            CampoFuerza.setText(agricultor.getFuerza());
            CampoDinero.setText(agricultor.getDinero()); // Asegúrate de que la clase Agricultor tenga este atributo si lo necesitas
            CampoInteligencia.setText(agricultor.getInteligencia());
        }
    }

    @FXML
    public void CrearPersonaje(ActionEvent event) throws IOException {
        if (PersonajeGuardado == null) {
            // Mostrar un mensaje de error si no se ha creado ningún personaje
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error");
            alerta.setHeaderText(null);
            alerta.setContentText("No se ha creado ningún personaje.");
            alerta.showAndWait();
            return;
        }

        PersonajeDAO personajeDAO = new PersonajeDAOImpl();
        personajeDAO.guardarPersonaje(PersonajeGuardado);
        mostrarVentana(event, null, "Juego-view.fxml", "Pantalla de Juego");
    }

    @FXML
    public void CargarPersonaje(String nombre) throws IOException {
        PersonajeDAO personajedao = new PersonajeDAOImpl();
        Personaje personaje1 = personajedao.cargarPersonaje(nombre);
        // Aquí puedes agregar lógica para mostrar la información del personaje cargado, si es necesario
    }
}
