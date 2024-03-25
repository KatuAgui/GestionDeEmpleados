/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeempleados;

/**
 *
 * @author Katia Aguilar
 */
public class EmpleadoTiempoCompleto extends Empleado {
    private double horasTrabajadas;

    public EmpleadoTiempoCompleto(String nombre, int edad, double salario, double horasTrabajadas) {
        super(nombre, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    
    
    

    @Override
    public double calcularSalario() {
        double tarifa = 10;
        return getSalario() + (getHorasTrabajadas() * tarifa);
    }
    
}
