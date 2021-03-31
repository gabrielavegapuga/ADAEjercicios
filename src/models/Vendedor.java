package models;

public class Vendedor extends Persona{

    private int idVendedor;
    private int porcentajeComision;
    private int cantidadVendidaMes;
    private double salario;
    private String recibeBono;
    private int bono;


    public Vendedor(String nombre, String apellido, int dni, int idVendedor, int porcentajeComision, int cantidadVendidaMes, double salario, String recibeBono, int bono) {
        super(nombre, apellido, dni);
        this.idVendedor = idVendedor;
        this.porcentajeComision = porcentajeComision;
        this.cantidadVendidaMes = cantidadVendidaMes;
        this.salario = salario;
        this.recibeBono = recibeBono;
        this.bono = bono;
    }

    public int getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(int idVendedor) {
        this.idVendedor = idVendedor;
    }

    public int getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(int porcentajeComision) {
        this.porcentajeComision = porcentajeComision;
    }

    public int getCantidadVendidaMes() {
        return cantidadVendidaMes;
    }

    public void setCantidadVendidaMes(int cantidadVendidaMes) {
        this.cantidadVendidaMes = cantidadVendidaMes;
    }

    public double getSalario() {
        double comision = cantidadVendidaMes*porcentajeComision/100;
        double salarioMes = salario + comision;
        return salarioMes;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getRecibeBono() {
        return recibeBono;
    }

    public void setRecibeBono(String recibeBono) {
        this.recibeBono = recibeBono;
    }

    public int getBono() {
        return bono;
    }

    public void setBono(int bono) {
        this.bono = bono;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "ID Vendedor=" + idVendedor +
                ", Nombre=" + getNombre() +
                " " + getApellido() +
                ", Porcentaje_Comision=" + porcentajeComision +
                ", Cantidad_vendida_mes=" + cantidadVendidaMes +
                ", Salario=" + getSalario() +
                ", Recibe_bono=" + getRecibeBono() +
                ", Bono=" + getBono() +

                '}';
    }
}
