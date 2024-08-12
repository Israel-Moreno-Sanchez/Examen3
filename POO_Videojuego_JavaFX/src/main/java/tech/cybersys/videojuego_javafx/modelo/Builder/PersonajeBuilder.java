package tech.cybersys.videojuego_javafx.modelo.Builder;

import tech.cybersys.videojuego_javafx.modelo.Personaje;

public interface PersonajeBuilder {
    void buildNombre(String nombre);
    void buildHistoria();
    void buildSalud();
    void buildFuerza();
    void buildInteligencia();
    void buildClase();
    Personaje getPersonaje();
}