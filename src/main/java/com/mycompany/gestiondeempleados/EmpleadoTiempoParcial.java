/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondeempleados;

/**
 *
 * @author Katia Aguilar
 */
public class EmpleadoTiempoParcial extends Empleado{
    private double horasTrabajadas;
    
    public EmpleadoTiempoParcial(String nombre, int edad, double salario, double horasTrabajadas) {
        super(nombre, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    
    @Override
    public double calcularSalario() {
        double tarifa = 10;
        return (getHorasTrabajadas() * tarifa);
    }
    
}
