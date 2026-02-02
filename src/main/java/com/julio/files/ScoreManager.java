package com.julio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ScoreManager {

    // Definimos la ruta del archivo "scores.txt" en la raíz del proyecto
    private static final Path ARCHIVO_PUNTAJES = Paths.get("scores.txt");

    public void guardarPuntaje(String jugador, int puntaje) {
        String linea = jugador + " - " + puntaje + " pts\n";
        try {
            // Si el archivo no existe, lo crea. Si existe, agrega al final (APPEND)
            Files.writeString(
                    ARCHIVO_PUNTAJES,
                    linea,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
            System.out.println("✅ Puntaje guardado para " + jugador);
        } catch (IOException e) {
            System.err.println("❌ Error escribiendo archivo: " + e.getMessage());
        }
    }

    public void leerPuntajes() {
        try {
            if (!Files.exists(ARCHIVO_PUNTAJES)) {
                System.out.println("📭 Aún no hay puntajes guardados.");
                return;
            }

            // Lee TODAS las líneas del archivo en una lista
            List<String> lineas = Files.readAllLines(ARCHIVO_PUNTAJES);

            System.out.println("--- TABLA DE PUNTAJES ---");
            for (String linea : lineas) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("❌ Error leyendo archivo: " + e.getMessage());
        }
    }
}


