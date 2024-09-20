
package Book;

import java.util.List;


public class LibroImpreso extends Libro {
    int paginas;
    int numEjemplares;

    public LibroImpreso(String titulo, List<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial, int paginas, int numEjemplares) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.paginas = paginas;
        this.numEjemplares = numEjemplares;
    }
    
    
}
