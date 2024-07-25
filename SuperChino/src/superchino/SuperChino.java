/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;


public class SuperChino {

 
    public static void main(String[] args) {
        // TODO code application logic here
        //Llamada de metodos
        RutinaSuper R=new RutinaSuper();
        R.agregainfo();
        
        infoProducto t=new infoProducto();
        
        RutinaProducto L=new RutinaProducto();
        L.agregarProducto();
        
        JOptionPane.showMessageDialog(null, "el precio bruto es:"+t.getPrecioBruto()+"y la ganancia es de "+t.getGanancia());
        
    }
    
}
