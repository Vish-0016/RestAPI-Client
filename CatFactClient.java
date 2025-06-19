import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class CatFactClient {
    public static void main(String[] args) {
        System.out.println("Fetching a cat fact....");
        fetchCatFact();
    }

    public static void fetchCatFact(){
        try {
            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://catfact.ninja/fact"))
                    .build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            JSONObject obj = new JSONObject(response.body());
            String fact = obj.getString("fact");

            System.out.println("\n Random Cat Fact: ");
            System.out.println(fact);
        
        
        }catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}