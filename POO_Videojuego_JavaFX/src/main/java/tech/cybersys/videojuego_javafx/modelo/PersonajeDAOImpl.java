package tech.cybersys.videojuego_javafx.modelo;

import java.io.*;

public class PersonajeDAOImpl implements PersonajeDAO {
    private static final String RUTA_ARCHIVO = "personajes.txt";

    @Override
    public void guardarPersonaje(Personaje personaje) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(RUTA_ARCHIVO, true))) {
            writer.write(personaje.getNombre() + "," +
                    personaje.getSalud() + "," +
                    personaje.getFuerza() + "," +
                    personaje.getInteligencia() + "," +
                    personaje.getDinero() + "," +
                    personaje.getClase());
            writer.newLine();
        }
    }

    @Override
    public Personaje cargarPersonaje(String nombre) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(RUTA_ARCHIVO))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].equals(nombre)) {
                    return new Personaje.Builder()
                            .setNombre(datos[0].toString())
                            .setSalud(datos[1].toString())
                            .setFuerza(datos[2].toString())
                            .setInteligencia(datos[3].toString())
                            .setDinero(datos[4].toString())
                            .setClase(datos[5].toString())
                            .build();
                }
            }
        }
        return null; // O lanzar una excepción si no se encuentra el personaje
    }
}
