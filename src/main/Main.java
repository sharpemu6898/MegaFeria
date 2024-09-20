/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import Book.Autor;
import Book.Megaferia;
import Book.LibroImpreso;
import Book.LibroDigital;
import Book.Editorial;
import Book.Gerente;
import Book.Libro;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // Crear una instancia de Megaferia
        Megaferia megaferia = new Megaferia();
        
        // Crear autores
        Autor autor1 = new Autor("Gabriel Garcia Marquez");
        Autor autor2 = new Autor("Isabel Allende");

        // Crear libros
        List<Autor> autoresLibro1 = new ArrayList<>();
        autoresLibro1.add(autor1);
        Libro libro1 = new LibroImpreso("Cien Años de Soledad", autoresLibro1, "123456789", "Novela", "Impreso", 50.0f, null, 500, 100);
        
        List<Autor> autoresLibro2 = new ArrayList<>();
        autoresLibro2.add(autor2);
        Libro libro2 = new LibroDigital("La Casa de los Espíritus", autoresLibro2, "987654321", "Novela", "Digital", 30.0f, null, true, new ArrayList<>());
        
        // Crear editorial
        Editorial editorial1 = new Editorial("12345", "Editorial Sudamericana", "Bogotá", new Gerente("Juan Perez", 12345678, null));
        editorial1.libros.add(libro1);

        Editorial editorial2 = new Editorial("67890", "Editorial Alfaguara", "Lima", new Gerente("Maria Lopez", 87654321, null));
        editorial2.libros.add(libro2);

        // Agregar editoriales a la feria
        megaferia.editoriales.add(editorial1);
        megaferia.editoriales.add(editorial2);

        // Buscar libros por autor
        List<Libro> librosDeAutor = megaferia.buscarLibrosPorAutor("Gabriel Garcia Marquez");
        System.out.println("Libros de Gabriel Garcia Marquez: " + librosDeAutor.size());

        // Buscar formatos de un libro
        List<String> formatosDeLibro = megaferia.buscarFormatosPorLibro("Cien Años de Soledad");
        System.out.println("Formatos de 'Cien Años de Soledad': " + formatosDeLibro);
        
    
    
    }
    
}
