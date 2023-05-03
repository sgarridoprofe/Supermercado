/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supermercado;

import java.util.HashMap;

/**
 *
 * @author sergio
 */
public class Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String,Producto> tabla=new HashMap<String,Producto>();
        HashMap<String,Double> tabla2=new HashMap<String,Double>();
        
        tabla.put("avena", new Producto("avena",2.21));
        tabla.put("garbanzos", new Producto("garbanzos",2.39));
        
        tabla2.put("avena",2.21);
        tabla2.put("garbanzos",2.39);
        
        
        
    }
    
}
