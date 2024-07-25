/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;


public class RutinaProducto {
    
    private infoProducto infoP[] =new infoProducto[6];
    //Pedir información de los productos
    public void agregarProducto(){
        
        for (int i = 0; i < 1; i++) {
            infoProducto f=new infoProducto();
            f.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de productos que desea ingresar")));
            f.setPrecioBase(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio base del producto")));
            f.setTipoProducto(JOptionPane.showInputDialog("Ingrese si el producto es de Alimentos, bebidas, higiene o limpieza"));
            f.calculos();
            }
            
            
        }
    }

