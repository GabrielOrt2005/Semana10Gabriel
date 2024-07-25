/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

import javax.swing.JOptionPane;


public class RutinaSuper {
    
    private infoSupermercado info[] = new infoSupermercado[6];
    
    public void agregainfo(){
        int x;
        for (int i = 0; i < 1; i++) {
            //Solicita informacion
            infoSupermercado f= new infoSupermercado();
            f.setNombreSuper(JOptionPane.showInputDialog(null, "Ingrese el nombre del supermercado:"));
            f.setCodigoSuper(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el codigo del supermercado:")));
            f.setNombreE(JOptionPane.showInputDialog("Ingrese el nombre del empleado:"));
            f.setCedulaE(Integer.parseInt(JOptionPane.showInputDialog("Digite la cedula<del empleado:")));
            
            
        }
    }

    public infoSupermercado[] getInfo() {
        return info;
    }

    public void setInfo(infoSupermercado[] info) {
        this.info = info;
    }
}
