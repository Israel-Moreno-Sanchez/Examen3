package tech.cybersys.videojuego_javafx.modelo.Builder;


import tech.cybersys.videojuego_javafx.modelo.Personaje;

public class ComercianteBuilder implements PersonajeBuilder {
    private Personaje.Builder builder;

    public ComercianteBuilder() {
        this.builder = new Personaje.Builder();
    }

    @Override
    public void buildNombre(String nombre) {
        builder.setNombre(nombre);
    }

    @Override
    public void buildHistoria() {
        String historia ="Un astuto comerciante, nacido en el bullicioso puerto de Marvella. " +
                "Desde joven, aprendió el arte del trueque y la negociación de su padre, un renombrado mercader. " +
                "Con un ojo agudo para los tesoros y una lengua de plata, él viaja por tierras lejanas en busca de " +
                "objetos raros y valiosos. Su tienda es conocida por tener los artículos más exóticos y útiles, " +
                "desde pociones mágicas hasta armas legendarias. Aunque su apariencia es modesta, su conocimiento " +
                "y recursos son invaluables para cualquier aventurero que cruce su camino.";


        builder.setHistoria(historia);
    }

    @Override
    public void buildSalud() {
        builder.setSalud("80");
    }

    @Override
    public void buildFuerza() {
        builder.setFuerza("50");
    }

    @Override
    public void buildInteligencia() {
        builder.setInteligencia("90");
    }

    @Override
    public void buildClase() {
        builder.setClase("Comerciante");
    }

    @Override
    public Personaje getPersonaje() {
        return builder.build();
    }
}
