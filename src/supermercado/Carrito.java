/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado;

import java.util.ArrayList;

/**
 *
 * @author sergio
 */
public class Carrito {
    ArrayList<LineaCarrito> lineas;

    public Carrito() {
        lineas=new ArrayList<>();
    }
    
    public void add(LineaCarrito l){
        lineas.add(l);
    }
    
    public void add(Producto p, int n){
        lineas.add(new LineaCarrito(p, n));
    }
    
    
    
}
