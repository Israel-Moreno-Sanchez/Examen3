package tech.cybersys.videojuego_javafx.modelo;

public class Personaje {
    private String nombre;
    private String historia;
    private String salud;
    private String fuerza;
    private String inteligencia;
    private String clase;
    private String dinero;

    private Personaje() {}

    // Getters para cada atributo del personaje
    public String getNombre() {
        return nombre;
    }

    public String getSalud() {
        return salud;
    }

    public String getFuerza() {
        return fuerza;
    }

    public String getInteligencia() {
        return inteligencia;
    }

    public String getClase() {
        return clase;
    }

    public String getHistoria() {
        return historia;
    }

    public String getDinero() {
        return dinero;
    }

    // Clase interna estática Builder
    public static class Builder {
        private String nombre;
        private String historia;
        private String salud;
        private String fuerza;
        private String inteligencia;
        private String clase;
        private String dinero;

        // Métodos de construcción que devuelven el Builder para encadenamiento
        public Builder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public Builder setSalud(String salud) {
            this.salud = salud;
            return this;
        }

        public Builder setFuerza(String fuerza) {
            this.fuerza = fuerza;
            return this;
        }

        public Builder setInteligencia(String inteligencia) {
            this.inteligencia = inteligencia;
            return this;
        }

        public Builder setClase(String clase) {
            this.clase = clase;
            return this;
        }
        public Builder setHistoria(String historia) {
            this.historia = historia;
            return this;
        }
        public Builder setDinero(String dinero) {
            this.dinero = dinero;
            return this;
        }

        // Método build que crea una instancia de Personaje con los atributos configurados
        public Personaje build() {
            Personaje personaje = new Personaje();
            personaje.nombre = this.nombre;
            personaje.historia = this.historia;
            personaje.salud = this.salud;
            personaje.fuerza = this.fuerza;
            personaje.inteligencia = this.inteligencia;
            personaje.clase = this.clase;
            personaje.dinero = this.dinero;
            return personaje;
        }



    }
}
