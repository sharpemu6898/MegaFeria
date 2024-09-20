/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Book;

/**
 *
 * @author ASUS
 */
public class Gerente extends Persona{
    Editorial editorial;

    public Gerente (String nombre, int cedula, Editorial editorial) {
        super(nombre, cedula);
        this.editorial = editorial;
    }
    
}
