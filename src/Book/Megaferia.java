/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Megaferia {
    List<Stand> stands;
    public List<Editorial> editoriales;

    public Megaferia() {
        this.stands = new ArrayList<>();
        this.editoriales = new ArrayList<>();
    }

    // Método para buscar libros por autor
    public List<Libro> buscarLibrosPorAutor(String autor) {
        List<Libro> librosAutor = new ArrayList<>();
        for (Editorial editorial : editoriales) {
            for (Libro libro : editorial.libros) {
                for (Autor a : libro.autores) {
                    if (a.getNombre().equals(autor)) {
                        librosAutor.add(libro);
                    }
                }
            }
        }
        return librosAutor;
    }

    // Método para buscar libros por formato
    public List<String> buscarFormatosPorLibro(String nombreLibro) {
        List<String> formatos = new ArrayList<>();
        for (Editorial editorial : editoriales) {
            for (Libro libro : editorial.libros) {
                if (libro.getTitulo().equals(nombreLibro)) {
                    formatos.add(libro.getFormato());
                }
            }
        }
        return formatos;
    }

    // Método para obtener el autor con más editoriales
    public Autor obtenerAutorConMasEditoriales() {
        Autor autorMax = null;
        int maxEditoriales = 0;
        for (Editorial editorial : editoriales) {
            for (Libro libro : editorial.libros) {
                for (Autor autor : libro.autores) {
                    int numEditoriales = autor.obtenerNumEditoriales();
                    if (numEditoriales > maxEditoriales) {
                        maxEditoriales = numEditoriales;
                        autorMax = autor;
                    }
                }
            }
        }
        return autorMax;
    }
    
}
