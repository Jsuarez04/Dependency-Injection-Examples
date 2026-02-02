package com.julio.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.time.LocalDateTime;

/*
* 🎯 El Reto: "Bitácora del Capitán"
Imagina que estás en una nave espacial.
Necesitas un sistema que registre los eventos
del día en un archivo de texto para que queden guardados aunque se apague la computadora.


Tus Requerimientos:

Crea una clase llamada Bitacora.

Debe tener un método registrarEvento(String evento):

Este método recibe un texto (ej: "Avistamos un asteroide").

Debe guardarlo en un archivo llamado bitacora.txt.

Importante: Cada vez que escribas, debe agregar el texto en una línea nueva y no borrar lo anterior.

Extra: Agrega la fecha/hora actual al principio de la línea (pista: usa LocalDateTime.now()).

Debe tener un método leerBitacora():

Muestra en consola todo lo que ha pasado en la nave.

Si el archivo no existe, debe decir "No hay registros".

💡 Pistas (Sin darte la solución)
Recuerda importar java.nio.file.*.

Para escribir sin borrar lo anterior, busca la opción StandardOpenOption.APPEND.

Para la fecha, LocalDateTime.now().toString() es tu amigo.*/

public class Bitacora {
        private static int iterator = 0;

    private static final Path REGISTRO_EVENTOS = Paths.get("events.txt"); // Ruta, debe mantenerse inmutable

    public void newEvent(String event){

        String line = iterator + " " + event + " |Date: " + LocalDateTime.now() + "|\n";

        try{

            Files.writeString(
                    REGISTRO_EVENTOS,
                    line,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );
            System.out.println("Event register success✅");
            iterator++;
        } catch (IOException e) {
            System.out.println("File writing error❌" + e.getMessage());
        }
    }

    public void readEventRegister(){
        try{
            if(!Files.exists(REGISTRO_EVENTOS)){
                System.out.println("Error, file doesn't exists❌");
                return;
            }
            List<String> lines = Files.readAllLines(REGISTRO_EVENTOS);

            System.out.println("--- EVENT REGISTER ---");
            for (String line : lines){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("File reading error❌ " + e.getMessage());
        }
    }
    public boolean verifyDupe(String toVerify){
        boolean isDupe = true;
        try{
            if(!Files.exists(REGISTRO_EVENTOS)){
                System.out.println("Error, file doesn't exists❌");
                return false;
            }
            List<String> lines = Files.readAllLines(REGISTRO_EVENTOS);

            System.out.println("--- EVENT REGISTER ---");
            for (String line : lines){
                if(line.equals(toVerify)){
                    System.out.println("Error evento duplicado");
                    return isDupe;
                }
            }
        }catch (IOException e){
            System.out.println("File reading error❌ " + e.getMessage());
        }
        return !isDupe;
    }


}

