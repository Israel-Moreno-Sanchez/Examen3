package tech.cybersys.videojuego_javafx.modelo.Builder;

import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class SoldadoBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public SoldadoBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
        String historia = "Un valiente soldado que ha dedicado su vida a proteger su patria. Criado en una familia militar, desde joven aprendió " +
                "las artes de la guerra y el liderazgo. Ha participado en numerosas batallas y misiones, ganándose la reputación de ser un líder " +
                "firme y un combatiente hábil. Su armadura siempre reluce, y su presencia inspira confianza en sus compañeros de armas. Aunque " +
                "su vida está llena de peligros, su lealtad y coraje nunca flaquean.";

        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("100"); // Soldado en excelente forma física
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("90"); // Fuerza alta debido al entrenamiento militar
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("70"); // Inteligencia suficiente para tácticas y estrategias militares
    }

    @Override
    public void buildClase() {
        builder.setClase("Soldado"); // Clase adecuada para el rol
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}
