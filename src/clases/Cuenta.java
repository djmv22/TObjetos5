/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author DanielDeJesus
 */
public class Cuenta {
    private long numeroCuenta;
    private long numeroIdentificacion;
    private double saldoActual;
    
    public Cuenta (long numeroCuenta, long numeroIdentificacion, double saldoActual){
        this.numeroCuenta=numeroCuenta;
        this.numeroIdentificacion=numeroIdentificacion;
        this.saldoActual=saldoActual;
    }
    
    public Cuenta (long numeroCuenta, long numeroIdentificacion){
        this.numeroCuenta=numeroCuenta;
        this.numeroIdentificacion=numeroIdentificacion;
        this.saldoActual=0;
    }
    
    public Cuenta (){
        this.numeroCuenta=0;
        this.numeroIdentificacion=0;
        this.saldoActual=0;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdntificacion(long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    public void actualizarSaldo(double ian){
        double interes,saldo_Interes;
        interes = this.getSaldoActual()*(ian/365);
        saldo_Interes = this.getSaldoActual() + interes;
        this.setSaldoActual(saldo_Interes);
    }
    
    public void ingresar (double ingreso){
        double aux;
        aux = this.getSaldoActual() + ingreso;
        this.setSaldoActual(aux);
    }
    
    public void retirar (double egreso){
        double aux;
        aux = this.getSaldoActual() - egreso;
        this.setSaldoActual(aux);
    }
    
    public String mostrar (){
        String m;
        m = "El N° de su cuenta es: "+this.getNumeroCuenta()+"\n"+
            "El N° de su identificación es: "+this.getNumeroIdentificacion()+"\n"+
            "El saldo actual de su cuenta es: "+this.getSaldoActual();
        return m;
    }
    
    
}
