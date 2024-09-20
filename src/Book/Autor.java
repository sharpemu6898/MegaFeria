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
public class Autor {
    String nombre;
    List<Libro> libros;

    public Autor(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarLibro(Libro libro) {
        if (!libros.contains(libro)) {
            libros.add(libro);
        }
    }

    // Obtener el número de editoriales en las que ha publicado
    public int obtenerNumEditoriales() {
        List<Editorial> editoriales = new ArrayList<>();
        for (Libro libro : libros) {
            if (!editoriales.contains(libro.editorial)) {
                editoriales.add(libro.editorial);
            }
        }
        return editoriales.size();
    }
    
}
