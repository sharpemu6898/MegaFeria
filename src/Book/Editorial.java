
package Book;
import java.util.ArrayList;
import java.util.List;
public class Editorial {
    String nit;
    String nombre;
    String direccion;
    Gerente gerente;
    public List<Libro> libros;
    List<Stand> stands;

    public Editorial(String nit, String nombre, String direccion, Gerente gerente) {
        this.nit = nit;
        this.nombre = nombre;
        this.direccion = direccion;
        this.gerente = gerente;
        this.libros = new ArrayList<>();
        this.stands = new ArrayList<>();
    }

    public List<Autor> obtenerAutores() {
        List<Autor> autores = new ArrayList<>();
        for (Libro libro : libros) {
            for (Autor autor : libro.autores) {
                if (!autores.contains(autor)) {
                    autores.add(autor);
                }
            }
        }
        return autores;
    }
}
