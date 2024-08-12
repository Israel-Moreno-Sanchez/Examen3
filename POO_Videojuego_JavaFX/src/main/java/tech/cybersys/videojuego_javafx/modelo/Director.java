package tech.cybersys.videojuego_javafx.modelo;

import tech.cybersys.videojuego_javafx.modelo.Builder.AgricultorBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.ComercianteBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.PersonajeBuilder;
import tech.cybersys.videojuego_javafx.modelo.Builder.SoldadoBuilder;

public class Director {
    private PersonajeBuilder builder;

    // Método para establecer el builder
    public void setBuilder(PersonajeBuilder builder) {
        this.builder = builder;
    }

    // Método para construir un personaje
    public Personaje construirPersonaje(String nombre) {
        if (builder == null) {
            throw new IllegalStateException("No se ha establecido ningún builder.");
        }
        builder.buildNombre(nombre);
        builder.buildHistoria();
        builder.buildSalud();
        builder.buildFuerza();
        builder.buildInteligencia();
        builder.buildClase();
        return builder.getPersonaje();
    }

    // Métodos específicos para cada tipo de personaje
    public Personaje construirComerciante(String nombre) {
        setBuilder(new ComercianteBuilder()); // Aquí debes tener la implementación de ComercianteBuilder
        return construirPersonaje(nombre);
    }

    public Personaje construirSoldado(String nombre) {
        setBuilder(new SoldadoBuilder()); // Aquí debes tener la implementación de SoldadoBuilder
        return construirPersonaje(nombre);
    }

    public Personaje construirAgricultor(String nombre) {
        setBuilder(new AgricultorBuilder()); // Aquí debes tener la implementación de AgricultorBuilder
        return construirPersonaje(nombre);
    }
}
