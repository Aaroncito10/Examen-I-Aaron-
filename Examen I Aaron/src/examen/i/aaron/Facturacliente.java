/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.i.aaron;

/**
 *
 * @author aaron
 */
public class Facturacliente {
//Atributos de la clase factura cliente//

    public String nombreCliente = "";
    public int id;
    public float comisiones = 0;
    private int codigoFactura;
    private float montoFactura;
    private int mes;
    private String prodElectricos;
    private String prodAutomotrices;
    private String prodConstruccion;

    //Constructor de la clase factura cliente//
    public Facturacliente(String nombreCliente, int id, float comisiones, int codigoFactura, float montoFactura, int mes, String prodElectricos, String prodAutomotrices, String prodConstruccion) {
        this.id = id;
        this.codigoFactura = codigoFactura;
        this.montoFactura = montoFactura;
        this.mes = mes;
        this.prodElectricos = prodElectricos;
        this.prodAutomotrices = prodAutomotrices;
        this.prodConstruccion = prodConstruccion;
    }

    //Setters y Getters de la clase factura cliente//
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getComisiones() {
        return comisiones;
    }

    public void setComisiones(float comisiones) {
        this.comisiones = comisiones;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public float getMontoFactura() {
        return montoFactura;
    }

    public void setMontoFactura(float montoFactura) {
        this.montoFactura = montoFactura;
    }

    public int getMes() {
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Ingrese un mes valido");
        }
        return 0;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getProdElectricos() {
        return prodElectricos;
    }

    public void setProdElectricos(String prodElectricos) {
        this.prodElectricos = prodElectricos;
    }

    public String getProdAutomotrices() {
        return prodAutomotrices;
    }

    public void setProdAutomotrices(String prodAutomotrices) {
        this.prodAutomotrices = prodAutomotrices;
    }

    public String getProdConstruccion() {
        return prodConstruccion;
    }

    public void setProdConstruccion(String prodConstruccion) {
        this.prodConstruccion = prodConstruccion;
    }
}
