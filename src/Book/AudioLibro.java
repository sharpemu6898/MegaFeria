/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.util.List;

/**
 *
 * @author ASUS
 */
 class AudioLibro extends Libro{
    int duracion;
    Narrador narrador;

    public AudioLibro(String titulo, List<Autor> autores, String isbn, String genero, String formato, float valor, Editorial editorial, int duracion, Narrador narrador) {
        super(titulo, autores, isbn, genero, formato, valor, editorial);
        this.duracion = duracion;
        this.narrador = narrador;
    }
    
}
