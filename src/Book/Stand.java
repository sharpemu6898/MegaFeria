/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

import java.util.ArrayList;
import java.util.List;


class Stand {
     int id;
    float precio;
    List<Editorial> editoriales;

    public Stand(int id, float precio) {
        this.id = id;
        this.precio = precio;
        this.editoriales = new ArrayList<>();
    }

    public void agregarEditorial(Editorial editorial) {
        if (!editoriales.contains(editorial)) {
            editoriales.add(editorial);
        }
    }
}
