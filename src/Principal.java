import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        // Mostrar cartel de bienvenida
        MostrarCatalogo.mostrarCartelBienvenida();

        Scanner sc = new Scanner(System.in);
        ConsultaPelicula consulta = new ConsultaPelicula();
        List<Pelicula> todasLasPeliculas = new ArrayList<>(); // Lista para almacenar todas las películas

        while (true) {
            System.out.print("Ingresa el número de la película (1-7) o fin para salir: ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("fin")) {
                System.out.println("¡Gracias por visitarnos! Saliendo del catálogo...");
                break; // Salir del bucle si el usuario escribe 'fin'
            }

            try {
                int numeroDePelicula = Integer.parseInt(input);
                if (numeroDePelicula < 1 || numeroDePelicula > 7) {
                    System.out.println("Error: el número de película debe estar entre 1 y 7.");
                    continue; // Volver al inicio del bucle
                }

                Pelicula pelicula = consulta.buscarPelicula(numeroDePelicula);
                System.out.println(pelicula);
                todasLasPeliculas.add(pelicula); // Agregar la película a la lista

                //Después de salir del bucle, guardar todas las películas en un solo archivo JSON
                GeneradorDeArchivo generador = new GeneradorDeArchivo();
                generador.guardarJson(todasLasPeliculas);

            } catch (NumberFormatException e) {
                System.out.println("Error: ¡Ingresa un número válido!");
            } catch (RuntimeException e) {
                System.out.println(e.getMessage());
                System.out.println("Finalizando la app");
                break; // Salir del bucle si hay una excepción
            }
        }
        sc.close(); // Cerrar el escáner
    }


}
