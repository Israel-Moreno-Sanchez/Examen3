package tech.cybersys.videojuego_javafx.modelo;

import java.io.IOException;

public interface PersonajeDAO {
    void guardarPersonaje(Personaje personaje) throws IOException;
    Personaje cargarPersonaje(String nombre) throws IOException;
}
