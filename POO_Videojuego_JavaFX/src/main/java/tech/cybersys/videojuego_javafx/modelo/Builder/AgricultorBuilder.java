package tech.cybersys.videojuego_javafx.modelo.Builder;

import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class AgricultorBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public AgricultorBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
        String historia = "Un agricultor laborioso que ha dedicado toda su vida a trabajar la tierra. Nacido en una pequeña aldea rural, " +
                "ha aprendido a cultivar todo tipo de vegetales y a cuidar del ganado desde joven. Su habilidad para trabajar en el campo " +
                "y su profundo conocimiento de las plantas y los animales lo convierten en una figura respetada en su comunidad. " +
                "Aunque su vida es sencilla, su dedicación y esfuerzo han garantizado la prosperidad de su aldea, y siempre está dispuesto " +
                "a ayudar a sus vecinos con su experiencia en la agricultura.";

        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("90"); // Agricultores suelen tener buena salud debido a su trabajo físico
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("70"); // Fuerza alta por el trabajo físico en el campo
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("60"); // Inteligencia razonable, suficiente para el conocimiento agrícola
    }

    @Override
    public void buildClase() {
        builder.setClase("Agricultor"); // Clase adecuada para el rol
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}
