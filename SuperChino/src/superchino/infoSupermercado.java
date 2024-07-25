/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;

/**
 *
 * @author gaort
 */
public class infoSupermercado {
    public String nombreSuper;
    public int codigoSuper;
    public String nombreE;
    public int cedulaE;
    public int cantidad;
    public int precioBase;
    public String tipoProducto;
    
    
    public infoSupermercado (){
        this.nombreSuper = "";
        this.codigoSuper = 0;
        this.nombreE = "";
        this.cedulaE = 0;
        
    }

    public infoSupermercado(String nombreSuper, int codigoSuper, String nombreE, int cedulaE) {
        this.nombreSuper = nombreSuper;
        this.codigoSuper = codigoSuper;
        this.nombreE = nombreE;
        this.cedulaE = cedulaE;
    }

    public String getNombreSuper() {
        return nombreSuper;
    }

    public void setNombreSuper(String nombreSuper) {
        this.nombreSuper = nombreSuper;
    }

    public int getCodigoSuper() {
        return codigoSuper;
    }

    public void setCodigoSuper(int codigoSuper) {
        this.codigoSuper = codigoSuper;
    }

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public int getCedulaE() {
        return cedulaE;
    }

    public void setCedulaE(int cedulaE) {
        this.cedulaE = cedulaE;
    }
    
    
}
