
package Book;

import java.util.List;


public class Libro {
    String titulo;
    List<Autor> autores;
    String isbn;
    String genero;
    String formato;
    float valor;
    Editorial editorial;

    public Libro(String titulo, List<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial) {
        this.titulo = titulo;
        this.autores = autores;
        this.isbn = isbn;
        this.genero = genero;
        this.formato = formato;
        this.valor = valor;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFormato() {
        return formato;
    }
    
}
