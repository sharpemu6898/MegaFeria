
package Book;

import java.util.List;


public class LibroDigital extends Libro{
    boolean hasHipervinculo;
    List<String> hipervinculos;

    public LibroDigital(String titulo, List<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial, boolean hasHipervinculo, List<String> hipervinculos) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.hasHipervinculo = hasHipervinculo;
        this.hipervinculos = hipervinculos;
    }
    
}
