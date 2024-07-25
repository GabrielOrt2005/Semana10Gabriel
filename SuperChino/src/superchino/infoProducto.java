/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package superchino;


public class infoProducto {
    public int cantidad;
    public int precioBase;
    public String tipoProducto;
    private double precioBruto;
    private double ganancia;

    infoProducto() {
        
    }
    
    public void infoProducto (){
        this.cantidad = 0;
        this. precioBase = 0;
        this.tipoProducto = "";
        this.calculos();
    }
    //calculos para el precio bruto y la ganancia 
    public void calculos(){
        switch (tipoProducto){
            case "Alimentos":
            precioBruto = precioBase * 1.3 + precioBase;
            ganancia = (precioBruto-precioBase);
            case "bebidas":
            precioBruto = precioBase * 0.3 + precioBase;
            ganancia = (precioBruto-precioBase);
            case "higiene":
            precioBruto = precioBase * 0.25 + precioBase;
            ganancia = (precioBruto-precioBase);
            case "limpieza":
            precioBruto = precioBase * 0.19 + precioBase;
            ganancia = (precioBruto-precioBase);
            
        }
    }
    
    public infoProducto(int cantidad, int precioBase, String tipoProducto) {
        this.cantidad = cantidad;
        this.precioBase = precioBase;
        this.tipoProducto = tipoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(int precioBase) {
        this.precioBase = precioBase;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public double getPrecioBruto() {
        return precioBruto;
    }

    public void setPrecioBruto(double precioBruto) {
        this.precioBruto = precioBruto;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }
    
    
}
