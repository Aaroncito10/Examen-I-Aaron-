/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen.i.aaron;

/**
 *
 * @author aaron
 */
public class Cliente {
//Atributos de la clase cliente//

    private String nombreAgente = "";
    private int id;
    public int codigoFactura;
    private String sucursalP;
    private String vehiculo;

    //Constructor de la clase cliente//
    public Cliente(int id, int codigoFactura, String sucursalP, String vehiculo) {
        this.id = id;
        this.codigoFactura = codigoFactura;
        this.sucursalP = sucursalP;
        this.vehiculo = vehiculo;
    }

    //Setters y Getters de la clase cliente//
    public String getNombreAgente() {
        return nombreAgente;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getSucursalP() {
        return sucursalP;
    }

    public void setSucursalP(String sucursalP) {
        this.sucursalP = sucursalP;
    }

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
    }

}
