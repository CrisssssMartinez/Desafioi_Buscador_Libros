package com.cristian.BuscadorLibros;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@Service
public class GutendexService {
    private final RestTemplate restTemplate;

    public GutendexService() {
        this.restTemplate = new RestTemplate();
    }

    public List<LibroDTO> buscarLibro(String titulo) {
        String url = "https://gutendex.com/books?search=" + titulo;
        GutendexResponse response = restTemplate.getForObject(url, GutendexResponse.class);
        return response != null ? response.getResults() : List.of();
    }
}

