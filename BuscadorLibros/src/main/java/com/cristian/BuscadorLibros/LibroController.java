package com.cristian.BuscadorLibros;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibroController {
    @Autowired
    private GutendexService gutendexService;

    @GetMapping("/buscar")
    public String buscarLibro(@RequestParam String titulo) {
        List<LibroDTO> libros = gutendexService.buscarLibro(titulo);
        if (libros.isEmpty()) {
            return "No se encontraron libros.";
        }

        StringBuilder resultado = new StringBuilder();
        for (LibroDTO libro : libros) {
            resultado.append("Nombre del libro: ").append(libro.getTitle()).append("\n")
                    .append("Autor: ").append(libro.getAuthors().get(0).getName()).append("\n")
                    .append("Idioma: ").append(libro.getLanguage()).append("\n")
                    .append("Número de descargas: ").append(libro.getDownload_count()).append("\n")
                    .append("------------------------------------------------\n");
        }
        return resultado.toString();
    }
}
