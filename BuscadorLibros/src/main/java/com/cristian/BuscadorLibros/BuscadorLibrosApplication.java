package com.cristian.BuscadorLibros;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class BuscadorLibrosApplication {
	private final GutendexService gutendexService;

	public BuscadorLibrosApplication(GutendexService gutendexService) {
		this.gutendexService = gutendexService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BuscadorLibrosApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Ingrese el título del libro que desea buscar: ");
			String titulo = scanner.nextLine();

			List<LibroDTO> libros = gutendexService.buscarLibro(titulo);

			for (LibroDTO libro : libros) {
				System.out.println("Nombre del libro: " + libro.getTitle());
				System.out.println("Autor: " + libro.getAuthors().get(0).getName());
				System.out.println("Idioma: " + libro.getLanguage());
				System.out.println("Número de descargas: " + libro.getDownload_count());
				System.out.println("------------------------------------------------");
			}
		};
	}
}


