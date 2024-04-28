import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

public class ConsultaPelicula {
//Este método buscarPelicula tiene como objetivo buscar y recuperar información sobre una película utilizando
// su número de película como parámetro.
    public Pelicula buscarPelicula (int numeroDePelicula){
        URI direccion = URI.create("https://swapi.py4e.com/api/films/"+numeroDePelicula+"/");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),Pelicula.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre la pelicula");
        }



    }
}
