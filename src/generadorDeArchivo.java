import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class GeneradorDeArchivo {
    public void guardarJson(List<Pelicula> peliculas) { //lista de objetos de tipo peliculas
        try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();

            // Convertir la lista de películas a JSON
            String json = gson.toJson(peliculas);

            //Se crea un objeto FileWriter para el archivo "peliculas.json"
            FileWriter escritura = new FileWriter("peliculas.json");
            escritura.write(json);
            escritura.close();

            System.out.println("Archivo JSON generado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
