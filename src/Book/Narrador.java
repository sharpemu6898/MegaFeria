/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.util.ArrayList;
import java.util.List;


class Narrador extends Persona{
    List<AudioLibro> audiolibros;

    public Narrador(String nombre, int cedula) {
        super(nombre, cedula);
        this.audiolibros = new ArrayList<>();
    }

    public void agregarAudiolibro(AudioLibro audiolibro) {
        if (!audiolibros.contains(audiolibro)) {
            audiolibros.add(audiolibro);
        }
    }
    
}
